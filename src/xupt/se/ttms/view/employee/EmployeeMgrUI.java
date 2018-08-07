package xupt.se.ttms.view.employee;

import java.awt.Color;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.lang.model.type.TypeKind;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.util.List;
import java.util.Iterator;


import xupt.se.ttms.model.Employee;
import xupt.se.ttms.service.EmployeeSrv;
import xupt.se.ttms.view.tmpl.*;

class EmployeeTable {
	private static final long serialVersionUID = 1L;
	private JTable jt;
	public EmployeeTable(JScrollPane jp) {
		
		DefaultTableModel tabModel=new DefaultTableModel(){
			private static final long serialVersionUID = 1L;

			@Override              
			public boolean isCellEditable(int row,int column){
				return false;              
			};
		};
		tabModel.addColumn("id");
		tabModel.addColumn("emp_no");
		tabModel.addColumn("name");
		tabModel.addColumn("tel_num");
		tabModel.addColumn("address");
		tabModel.addColumn("Email");
		//初始化列明
		jt=new JTable(tabModel);	
		
		//设置各列的宽度
	    TableColumnModel columnModel = jt.getColumnModel();
	    
	    //隐藏ID这一列
        TableColumn column = columnModel.getColumn(0);
        column.setMinWidth(0);
        column.setMaxWidth(0);
        column.setWidth(0);
        column.setPreferredWidth(0);

        column = columnModel.getColumn(1);
        column.setPreferredWidth(10);
        column = columnModel.getColumn(2);
        column.setPreferredWidth(10);
        column = columnModel.getColumn(3);
        column.setPreferredWidth(10);
        column = columnModel.getColumn(4);
        column.setPreferredWidth(10);
        column = columnModel.getColumn(5);
        column.setPreferredWidth(50);

		
		jp.add(jt);
		jp.setViewportView(jt);
		
	}
	
	public Employee getEmployee() {
		int row=jt.getSelectedRow();
		if(row>=0){
			Employee empl = new Employee();
			empl.setId(Integer.parseInt(jt.getValueAt(row, 0).toString()));
			empl.setEmployee_workid(Integer.parseInt(jt.getValueAt(row, 1).toString()));
			empl.setEmployee_name(jt.getValueAt(row, 2).toString());
			empl.setEmployee_tel(jt.getValueAt(row, 3).toString()); 
			empl.setEmployee_address(jt.getValueAt(row, 4).toString());
			empl.setEmployee_email(jt.getValueAt(row, 5).toString());

			return empl;
		}
		else{
			return null;
		}
			
	}
	
	// 创建JTable
	public void showEmployeeList(List<Employee> empList) {
		try {
			DefaultTableModel tabModel = (DefaultTableModel) jt.getModel();
			tabModel.setRowCount(0);
			
			Iterator<Employee> itr = empList.iterator();
			while (itr.hasNext()) {
				Employee stu = itr.next();
				Object data[] = new Object[6];
				data[0] = Integer.toString(stu.getId());
				data[1] = Integer.toString(stu.getEmployee_workid());
				data[2] = stu.getEmployee_name();
				data[3] = stu.getEmployee_tel();
				data[4] = stu.getEmployee_address();
				data[5] = stu.getEmployee_email();
				tabModel.addRow(data);;
			}
			jt.invalidate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class EmployeeMgrUI extends MainUITmpl {

	private static final long serialVersionUID = 1L;
	private JLabel ca1 = null; // 界面提示
	// 用来放表格的滚动控件
	private JScrollPane jsc;
	// 查找的提示和输出
	private JLabel hint;
	private JTextField input;
	// 查找，编辑和删除按钮
	private JButton btnAdd, btnEdit, btnDel, btnQuery;
	EmployeeTable tms;
	
	public EmployeeMgrUI() {
		
	}

	// To be override by the detailed business block interface
	@Override
	protected void initContent() {
		Rectangle rect = contPan.getBounds();

		ca1 = new JLabel("员工管理", JLabel.CENTER);
		ca1.setBounds(0, 5, rect.width, 30);
		ca1.setFont(new java.awt.Font("宋体", 1, 20));
		ca1.setForeground(Color.blue);
		contPan.add(ca1);

		jsc = new JScrollPane();
		jsc.setBounds(0, 40, rect.width, rect.height - 90);
		contPan.add(jsc);
		
		hint = new JLabel("请输入雇员名称:", JLabel.RIGHT);
		hint.setBounds(60, rect.height - 45, 150, 30);
		contPan.add(hint);

		input = new JTextField();
		input.setBounds(220, rect.height - 45, 200, 30);
		contPan.add(input);
		
		// 查找 ，删除和编辑的按钮，其中含有相关的事件处理！
		btnQuery = new JButton("查找");
		btnQuery.setBounds(440, rect.height - 45, 60, 30);
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				btnQueryClicked();
			}
		});
		contPan.add(btnQuery);

		btnAdd = new JButton("添加");
		btnAdd.setBounds(rect.width - 220, rect.height - 45, 60, 30);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				btnAddClicked();
			}
		});
		contPan.add(btnAdd);

		btnEdit = new JButton("修改");
		btnEdit.setBounds(rect.width - 150, rect.height - 45, 60, 30);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				btnModClicked();
			}
		});
		contPan.add(btnEdit);

		btnDel = new JButton("删除");
		btnDel.setBounds(rect.width - 80, rect.height - 45, 60, 30);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				btnDelClicked();
			}
		});
		contPan.add(btnDel);
		tms = new EmployeeTable(jsc);
		showTable();
	}

	private void btnAddClicked() {
		EmployeeAddUI addStud=null;
		addStud = new EmployeeAddUI();
		addStud.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		addStud.setWindowName("添加雇员信息");
		addStud.toFront();
		addStud.setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
		addStud.setVisible(true);
		if (addStud.getReturnStatus()) {
			showTable();
		}
	}

	private void btnModClicked() {
		Employee empl = tms.getEmployee();
		if(null== empl){
			JOptionPane.showMessageDialog(null, "请选择要修改的雇员信息");
			return; 
		}
		EmployeeEditUI modStu = new EmployeeEditUI(empl);
		modStu.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		modStu.setWindowName("修改雇员信息");
		modStu.toFront();
		modStu.setModal(true);
		modStu.setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
		modStu.setVisible(true);
		if (modStu.getReturnStatus()) {
			showTable();
		}
	}

	private void btnDelClicked() {
		Employee empl = tms.getEmployee();
		if(null== empl){
			JOptionPane.showMessageDialog(null, "请选择要删除的雇员信息");
			return; 
		}
		int confirm = JOptionPane.showConfirmDialog(null, "确认删除所选？", "删除", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			EmployeeSrv empSrv = new EmployeeSrv();
			empSrv.delete(empl.getId());
			showTable();
		}
	}

	private void btnQueryClicked() {
		if (input.getText().equals("")) 
		{
			JOptionPane.showMessageDialog(null, "请输入检索条件");
		} 
		else 
		{
			EmployeeSrv empSrv = new EmployeeSrv();
			List<Employee> empList = empSrv.Fetch(input.getText() + "");;
			tms.showEmployeeList(empList);
		}
	}

	private void showTable() {
		List<Employee> empList = new EmployeeSrv().FetchAll();
		tms.showEmployeeList(empList);
	}

	public static void main(String[] args) {
		EmployeeMgrUI frmStuMgr = new EmployeeMgrUI();
		frmStuMgr.setVisible(true);
	}
}
