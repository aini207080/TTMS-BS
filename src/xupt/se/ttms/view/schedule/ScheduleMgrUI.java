package xupt.se.ttms.view.schedule;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import xupt.se.ttms.model.Schedule;
import xupt.se.ttms.service.PlaySrv;
import xupt.se.ttms.service.ScheduleSrv;
import xupt.se.ttms.service.StudioSrv;
import xupt.se.ttms.view.tmpl.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

class ScheduleTable {

	private static final long serialVersionUID = 1L;
	private JTable jt;
	private PlaySrv playSrv = new PlaySrv();
	private StudioSrv studioSrv = new StudioSrv();

	public ScheduleTable(JScrollPane jp) {
		
		DefaultTableModel tabModel=new DefaultTableModel(){
			private static final long serialVersionUID = 1L;

			@Override              
			public boolean isCellEditable(int row,int column){
				return false;              
			};
		};
		tabModel.addColumn("sched_id");
		tabModel.addColumn("studio_id");
		tabModel.addColumn("play_id");
		tabModel.addColumn("sched_time");
		tabModel.addColumn("sched_ticket_price");
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

		
		jp.add(jt);
		jp.setViewportView(jt);
		
	}
	
	public Schedule getSchedule() {
		int row=jt.getSelectedRow();
		if(row>=0){
			Schedule schedule = new Schedule();
			schedule.setSched_id(Integer.parseInt(jt.getValueAt(row, 0).toString()));
			schedule.setStudio_id(new StudioSrv().Fetch("studio_name = '"+jt.getValueAt(row, 1).toString() +"'").get(0).getID());
			schedule.setPlay_id(new PlaySrv().Fetch("play_name = '"+jt.getValueAt(row, 2).toString()+"'").get(0).getId()); 
			java.text.SimpleDateFormat sdf= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//小写的mm表示的是分钟   
			java.util.Date date = null;
			try {
				
				date = sdf.parse(jt.getValueAt(row, 3).toString());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			schedule.setSched_time(date);
			schedule.setSched_ticket_price(Float.parseFloat(jt.getValueAt(row, 4).toString())); 

			return schedule;
		}
		else{
			return null;
		}
			
	}
	
	// 创建JTable
	public void showScheduleList(List<Schedule> stuList) {
		try {
			DefaultTableModel tabModel = (DefaultTableModel) jt.getModel();
			tabModel.setRowCount(0);
			
			Iterator<Schedule> itr = stuList.iterator();
			while (itr.hasNext()) {
				Schedule schedule = itr.next();
				Object data[] = new Object[5];
			    data[0] = schedule.getSched_id();
				data[1] = studioSrv.Fetch("studio_id = " + schedule.getStudio_id()).get(0).getName();
				data[2] = playSrv.Fetch("play_id = " + schedule.getPlay_id()).get(0).getName();
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String date = df.format(schedule.getSched_time());
				data[3] = date;
				data[4] = schedule.getSched_ticket_price();
				tabModel.addRow(data);;
			}
			jt.invalidate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class ScheduleMgrUI extends MainUITmpl {
	private static final long serialVersionUID = 1L;
	private JLabel ca1 = null; // 界面提示
	// 用来放表格的滚动控件
	private JScrollPane jsc;
	// 查找的提示和输出
	private JLabel hint;
	private JTextField input;
	ScheduleTable tms;
	// 查找，编辑和删除按钮
	private JButton btnAdd, btnEdit, btnDel, btnQuery;

	public ScheduleMgrUI() {
		
	}
	
	protected void initContent() {
		Rectangle rect = contPan.getBounds();

		ca1 = new JLabel("演出计划管理", JLabel.CENTER);
		ca1.setBounds(0, 5, rect.width, 30);
		ca1.setFont(new java.awt.Font("宋体", 1, 20));
		ca1.setForeground(Color.blue);
		contPan.add(ca1);
		
		jsc = new JScrollPane();
		jsc.setBounds(0, 40, rect.width, rect.height - 90);
		contPan.add(jsc);
		
		hint = new JLabel("请输入演出计划名称:", JLabel.RIGHT);
		hint.setBounds(60, rect.height - 45, 150, 30);
		contPan.add(hint);

		input = new JTextField(10);
		input.setBounds(220, rect.height - 45, 200, 30);
		contPan.add(input);

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
		tms = new ScheduleTable(jsc);
		showTable();
	}

	private void btnAddClicked() {
		ScheduleAddUI addSchedule =null;
		addSchedule = new ScheduleAddUI();
		addSchedule.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		addSchedule.setWindowName("添加演出计划");
		addSchedule.toFront();
		addSchedule.setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
		addSchedule.setModal(true);
		addSchedule.setVisible(true);
		if (addSchedule.getReturnStatus()) {
			showTable();
		}
		
	}

	private void btnModClicked() {	
		Schedule schedule = tms.getSchedule();
		if(null== schedule){
			JOptionPane.showMessageDialog(null, "请选择要修改的演出计划");
			return; 
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date sched_time = schedule.getSched_time();
		ScheduleEditUI modSchedule = new ScheduleEditUI(schedule);
		modSchedule.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		modSchedule.setWindowName("修改演出计划");
		modSchedule.toFront();
		modSchedule.setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
		modSchedule.setModal(true);
		modSchedule.setVisible(true);
		if (modSchedule.getReturnStatus()) {
			showTable();
		}
	}

	private void btnDelClicked() {
		Schedule schedule = tms.getSchedule();
		if(null== schedule){
			JOptionPane.showMessageDialog(null, "请选择要删除的演出计划");
			return; 
		}
		int confirm = JOptionPane.showConfirmDialog(null, "确认删除所选？", "删除", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			ScheduleSrv scheduleSrv = new ScheduleSrv();
			scheduleSrv.delete(schedule.getSched_id());
			showTable();
		}
	}

	private void btnQueryClicked() {
		if (input.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "请输入检索条件");
			
		} else {
			ScheduleSrv stuSrv = new ScheduleSrv();
			List<Schedule> stuList = stuSrv.Fetch("sched_id = '" + input.getText() + "'");
			tms.showScheduleList(stuList);
		}
	}
  
	public void showTable() {
		List<Schedule> stuList = new ScheduleSrv().FetchAll();
		tms.showScheduleList(stuList);
	}

	public static void main(String[] args) {
		ScheduleMgrUI frmStuMgr = new ScheduleMgrUI();
		frmStuMgr.setVisible(true);
	}
}
