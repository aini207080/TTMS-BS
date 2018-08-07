package xupt.se.ttms.view.employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import xupt.se.ttms.model.Employee;
import xupt.se.ttms.service.EmployeeSrv;
import xupt.se.ttms.view.tmpl.*;

public class EmployeeAddUI extends PopUITmpl implements ActionListener{

	
	private static final long serialVersionUID = 1L;

	private JButton btnCancel, btnSave; 	//取消，保存按鈕

	protected boolean rst=false; 				//操作结果
	private JLabel lblName, lblRow, lblColumn,lblFlag, lblInfo;
	protected JTextField txtName, txtRow, txtColumn, txtInfo, txtFlag;

	
	protected void initContent(){
		this.setTitle("添加员工信息");
		lblName = new JLabel("员工工号：");
		lblName.setBounds(60, 30, 80, 30);
		contPan.add(lblName);
		txtName = new JTextField();
		txtName.setBounds(150, 30, 120, 30);
		contPan.add(txtName);

		lblRow = new JLabel("员工名：");
		lblRow.setBounds(60, 80, 80, 30);
		contPan.add(lblRow);
		txtRow = new JTextField();
		txtRow.setBounds(150, 80, 120, 30);
		contPan.add(txtRow);

		lblColumn = new JLabel("员工电话：");
		lblColumn.setBounds(60, 130, 80, 30);
		contPan.add(lblColumn);
		txtColumn = new JTextField();
		txtColumn.setBounds(150, 130, 120, 30);
		contPan.add(txtColumn);
		
		
		lblInfo = new JLabel("员工住址：");
		lblInfo.setBounds(60, 180, 80, 30);
		contPan.add(lblInfo);
		txtInfo = new JTextField();
		txtInfo.setBounds(150, 180, 120, 30);
		contPan.add(txtInfo);
		
		lblFlag = new JLabel("员工邮箱：");
		lblFlag.setBounds(60, 230, 80, 30);
		contPan.add(lblFlag);
		txtFlag = new JTextField();
		txtFlag.setBounds(150, 230, 120, 30);
		contPan.add(txtFlag);
		
		
		btnSave = new JButton("保存");
		btnSave.addActionListener(this);
		btnSave.setBounds(60, 320, 60, 30);
		contPan.add(btnSave);

		btnCancel = new JButton("取消");
		btnCancel.addActionListener(this);
		btnCancel.setBounds(180, 320, 60, 30);
		contPan.add(btnCancel);
	}
	
	
	public boolean getReturnStatus(){
		   return rst;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			rst=false;
			this.setVisible(false);
		} else if (e.getSource() == btnSave) {
			btnSaveClicked();
		}

	}
	
	protected void btnSaveClicked(){
		
		if (txtName.getText() != null && txtRow.getText() != null
				&& txtColumn.getText() != null && txtFlag.getText() != null) {
			EmployeeSrv stuSrv = new EmployeeSrv();
			Employee stu=new Employee();
			stu.setEmployee_workid(Integer.parseInt(txtName.getText()));
			stu.setEmployee_name(txtRow.getText());
			stu.setEmployee_tel(txtColumn.getText());
			stu.setEmployee_address(txtInfo.getText());
			stu.setEmployee_email(txtFlag.getText());
			stuSrv.add(stu);
			this.setVisible(false);
			rst=true;
		} else {
			JOptionPane.showMessageDialog(null, "数据不完整");
		}		
	}
	
	
}
