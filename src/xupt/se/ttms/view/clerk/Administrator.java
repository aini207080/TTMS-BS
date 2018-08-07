package xupt.se.ttms.view.clerk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import xupt.se.ttms.view.datadict.DataDictMgrUI;
import xupt.se.ttms.view.employee.EmployeeMgrUI;
import xupt.se.ttms.view.play.PlayMgrUI;
import xupt.se.ttms.view.sale.SaleMgrUI;
import xupt.se.ttms.view.schedule.ScheduleMgrUI;
import xupt.se.ttms.view.studio.StudioMgrUI;
import xupt.se.ttms.view.tmpl.MainUITmpl;

public class Administrator extends MainUITmpl{
	private static final long serialVersionUID = 1025028999012028956L;

	public Administrator(){
		this.setVisible(true);
	}

	@Override
	protected void initContent() {
		JPanel workPanel = new JPanel();
		workPanel.setLayout(null);
		workPanel.setBounds(0, 0, 1000, 500);
		
		JButton dataDict = new JButton();
		dataDict.setVerticalTextPosition(SwingConstants.BOTTOM);
		dataDict.setHorizontalTextPosition(SwingConstants.CENTER);
		dataDict.setIcon(new ImageIcon("resource/image/ticket.jpg"));
		dataDict.setBackground(Color.WHITE);
		dataDict.setText(" 数据字典管理 ");
		dataDict.setBounds(100, 50, 160, 160);
		
		dataDict.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				DataDictMgrUI dataDictMgrUI= new DataDictMgrUI();
				dataDictMgrUI.setVisible(true);
				Administrator.this.dispose();
			}
		});
		
		JButton employee = new JButton();
		employee.setVerticalTextPosition(SwingConstants.BOTTOM);
		employee.setHorizontalTextPosition(SwingConstants.CENTER);
		employee.setIcon(new ImageIcon("resource/image/ticket.jpg"));
		employee.setBackground(Color.WHITE);
		employee.setText(" 雇员管理 ");
		employee.setBounds(400, 50, 160, 160);
		
		employee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				EmployeeMgrUI frmStuMgr = new EmployeeMgrUI();
				frmStuMgr.setVisible(true);
				Administrator.this.dispose();
			}
		});
		
		JButton studio = new JButton();
		studio.setVerticalTextPosition(SwingConstants.BOTTOM);
		studio.setHorizontalTextPosition(SwingConstants.CENTER);
		studio.setIcon(new ImageIcon("resource/image/ticket.jpg"));
		studio.setBackground(Color.WHITE);
		studio.setText("演出厅管理");
		studio.setBounds(700, 50, 160, 160);
		
		studio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				StudioMgrUI frmStuMgr = new StudioMgrUI();
				frmStuMgr.setVisible(true);
				Administrator.this.dispose();
			}
		});
		
		JButton play = new JButton();
		play.setVerticalTextPosition(SwingConstants.BOTTOM);
		play.setHorizontalTextPosition(SwingConstants.CENTER);
		play.setIcon(new ImageIcon("resource/image/ticket.jpg"));
		play.setBackground(Color.WHITE);
		play.setText(" 剧目管理 ");
		play.setBounds(100, 250, 160, 160);
		
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				PlayMgrUI frmStuMgr= new PlayMgrUI();
				frmStuMgr.setVisible(true);
				Administrator.this.dispose();
			}
		});
		
		JButton schedule = new JButton();
		schedule.setVerticalTextPosition(SwingConstants.BOTTOM);
		schedule.setHorizontalTextPosition(SwingConstants.CENTER);
		schedule.setIcon(new ImageIcon("resource/image/ticket.jpg"));
		schedule.setBackground(Color.WHITE);
		schedule.setText(" 演出计划管理 ");
		schedule.setBounds(400, 250, 160, 160);
		
		schedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				ScheduleMgrUI frmStuMgr = new ScheduleMgrUI();
				frmStuMgr.setVisible(true);
				Administrator.this.dispose();
			}
		});
		
		JButton sale = new JButton();
		sale.setVerticalTextPosition(SwingConstants.BOTTOM);
		sale.setHorizontalTextPosition(SwingConstants.CENTER);
		sale.setIcon(new ImageIcon("resource/image/ticket.jpg"));
		sale.setBackground(Color.WHITE);
		sale.setText("销售记录管理");
		sale.setBounds(700, 250, 160, 160);
		
		sale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				SaleMgrUI frmSaleMgr = new SaleMgrUI();
				frmSaleMgr.setVisible(true);
				Administrator.this.dispose();
			}
		});
		
		workPanel.add(dataDict);
		workPanel.add(employee);
		workPanel.add(studio);
		workPanel.add(play);
		workPanel.add(schedule);
		workPanel.add(sale);
		
		contPan.add(workPanel);
		contPan.validate();
		
	}
	public static void main(String[] args) {
	Administrator administrator = new Administrator();
}
}
