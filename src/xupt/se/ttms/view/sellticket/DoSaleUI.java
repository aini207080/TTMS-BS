package xupt.se.ttms.view.sellticket;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import xupt.se.ttms.model.Employee;
import xupt.se.ttms.model.Sale;
import xupt.se.ttms.model.Ticket;
import xupt.se.ttms.service.EmployeeSrv;
import xupt.se.ttms.service.SaleSrv;
import xupt.se.ttms.service.TicketSrv;
import xupt.se.ttms.view.tmpl.ImagePanel;
import xupt.se.ttms.view.tmpl.PopUITmpl;

public class DoSaleUI extends JDialog implements ActionListener {


	private static final long serialVersionUID1= 1L;
	private int frmWidth=800;
	private int frmHeight=600;
	private JButton btnCancel, btnSave; 	//取消，保存按鈕

	protected boolean rst=false; 				//操作结果
	private JLabel lblEmpId, lblShed, lblPay, lblPayMent,lblPayChange;
	protected JTextField txtPayMent;
	protected JComboBox<Integer> txtEmpId;
	private JLabel txtShed, lblTicNum, txtTicNumn, txtPayChange, txtPay;
	private EmployeeSrv employeeSrv;

	private List<Ticket> ticketList = null;
	public final ImagePanel headPan = new ImagePanel("resource/image/header_pop.jpg");
	public JPanel contPan = new JPanel();
	public JLabel windowName = new JLabel();
	public DoSaleUI() {
	//	initContent();
	}

	public DoSaleUI(List<Ticket> ticketList) {
	
			this.ticketList = new LinkedList<Ticket>();
			this.ticketList  = ticketList;
			this.setSize(frmWidth, frmHeight);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.setLayout(null);
			this.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					onWindowClosing();
				}
			});
			headPan.setBounds(0, 0, frmWidth, 60);
			headPan.setLayout(null);
			this.add(headPan);
			
			contPan.setBounds(0, 60, frmWidth, this.frmHeight-80);
			contPan.setLayout(null);
			this.add(contPan);	
			
			initHeader();
			initContent();
	}

	//	@Override
	protected void initContent(){
		this.setTitle("生成账单");

		lblEmpId = new JLabel("操作员 ID：");
		lblEmpId.setBounds(60, 30, 80, 30);
		contPan.add(lblEmpId);
		
		txtEmpId = new JComboBox<Integer>();
		employeeSrv = new EmployeeSrv();
		List<Employee> listsAllEmployee = employeeSrv.FetchAll();
		Integer [] empId = new Integer[listsAllEmployee.size()];
		for(int i=0; i<listsAllEmployee.size(); i++) 
		{    
			empId[i] = listsAllEmployee.get(i).getId();
			txtEmpId.addItem(empId[i]);
		} 
		txtEmpId.setBounds(150, 30, 120, 30);
		contPan.add(txtEmpId);

		lblShed = new JLabel("剧目场次：");
		lblShed.setBounds(60, 80, 80, 30);
		contPan.add(lblShed);
		
		String sched = new String();
		for(int i = 0;i<ticketList.size(); i++){
			sched += "[" + String.valueOf(ticketList.get(i).getScheduleId()) + "]";
		}
		txtShed = new JLabel(sched);
		txtShed.setBounds(150, 80, 120, 30);
		contPan.add(txtShed);
		
		lblTicNum = new JLabel("票数量：");
		lblTicNum.setBounds(60, 130, 80, 30);
		contPan.add(lblTicNum);
		txtTicNumn = new JLabel(ticketList.size() + " 张");
		txtTicNumn.setBounds(150, 130, 120, 30);
		contPan.add(txtTicNumn);

		lblPay = new JLabel("应收金额(￥):");
		lblPay.setBounds(60, 180, 80, 30);
		contPan.add(lblPay);
		Double payNum =  (double) 0;
		for(Ticket ticket : ticketList){
			payNum += ticket.getPrice();
		}
		txtPay = new JLabel(payNum + "");
		txtPay.setBounds(150, 180, 120, 30);
		contPan.add(txtPay);
		
		lblPayMent = new JLabel("实收金额(￥):");
		lblPayMent.setBounds(60, 230, 80, 30);
		contPan.add(lblPayMent);
		txtPayMent = new JTextField();
		txtPayMent.setBounds(150, 230, 120, 30);
		contPan.add(txtPayMent);
			
		lblPayChange = new JLabel("找零金额(￥):");
		lblPayChange.setBounds(60, 280, 80, 30);
		contPan.add(lblPayChange);
		txtPayChange = new JLabel("待刷新>>");
		txtPayChange.setBounds(150, 280, 80, 30);
		contPan.add(txtPayChange);
		JButton toChangeBt = new JButton("刷新");
		toChangeBt.setBounds(210, 280, 60, 30);
		toChangeBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   txtPayChange.setText((Float.parseFloat(txtPayMent.getText())-Float.parseFloat(txtPay.getText()))+"");
				
			}
		});
		contPan.add(toChangeBt);
		
		btnSave = new JButton("结算");
		btnSave.addActionListener(this);
		btnSave.setBounds(60, 320, 60, 30);
		contPan.add(btnSave);

		btnCancel = new JButton("取消");
		btnCancel.addActionListener(this);
		btnCancel.setBounds(210, 320, 60, 30);
		contPan.add(btnCancel);

		JLabel jLabel = new JLabel();
		jLabel.setBounds(360, 160, 100, 100);
		this.add(jLabel);

	}
	
	
	public boolean getReturnStatus(){
		   return rst;
	}
	
	private void initHeader() {
		try {


			windowName.setBounds(frmWidth-160, 5, 160, 50);
			windowName.setFont(new java.awt.Font("dialog", 1, 20));
			windowName.setForeground(Color.blue);	
			headPan.add(windowName);
			setWindowName("模块名称");
			
			
		} catch (Exception e) {
			javax.swing.JOptionPane.showMessageDialog(null, e, "Exception", 0);
			e.printStackTrace();
		}
	}
	

	//Set the name of the popup window 
	public void setWindowName(String name){
		windowName.setText(name);
	}
	
	//To be override by the detailed business block interface 
	protected void onWindowClosing(){
		this.dispose();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			rst=false;
			this.dispose();
			getParent().setVisible(true);

		} else if (e.getSource() == btnSave) {
			btnSaveClicked();
		}

	}

	protected void btnSaveClicked(){
		
		if (txtEmpId.getSelectedItem() != null && txtShed.getText() != null
				&& txtTicNumn.getText() != null && txtPay.getText() != null 
				&& txtPayMent.getText() != null ) {
			SaleSrv stuSrv = new SaleSrv();
			Sale sale =new Sale();
			sale.setEmpId(Integer.parseInt(txtEmpId.getSelectedItem().toString()));
			sale.setPayment(Float.parseFloat(txtPayMent.getText()));
			sale.setChange(Float.parseFloat(txtPayChange.getText()));
			sale.setType(1);
			sale.setStatus(0);
			if(stuSrv.add(ticketList,sale)){
				JOptionPane.showMessageDialog(null, "已生成销售单");
			}else{
				TicketSrv ticketSrv = new TicketSrv();
				for(int i = 0;i<ticketList.size();i++){
					ticketSrv.unlockTicket(ticketList.get(i).getId());
				}
				
			}
			
		
			this.dispose();
			rst=true;
			getParent().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "数据不完整");
		}		
	}
	

}
