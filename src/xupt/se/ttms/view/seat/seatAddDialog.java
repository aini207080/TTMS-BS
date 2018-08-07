package xupt.se.ttms.view.seat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

import xupt.se.ttms.model.Seat;
import xupt.se.ttms.service.SeatSrv;
import xupt.se.ttms.view.tmpl.ImagePanel;

public class seatAddDialog extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JButton btnCancel, btnSave; 	

	protected boolean rst=false; 				//操作结果
	protected int txtId, txtStudioId, txtRow, txtColumn,txtstatus;
	private JComboBox<Integer> status;
	private int seatStatus = 0;
	public seatAddDialog() {
		
	}
	public seatAddDialog(Seat seat) {
		this.txtId = seat.getId();
		this.txtStudioId = seat.getStudioId();
		this.txtRow = seat.getRow();
	    this.txtColumn = seat.getColumn();
		initContent();
	}

	
	protected void initContent(){
		this.setTitle("管理座位");
		this.setBackground(Color.WHITE);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();//得到屏幕的大小 
		setBounds((screen.width-300)/2,(screen.height-200)/2,300,200);
		setLayout(new BorderLayout());
		JPanel footerJPanel = new JPanel();
		add(footerJPanel, BorderLayout.SOUTH);
		Integer []statusList = new Integer[]{0,1,-1};	
		status = new JComboBox<Integer>(statusList);
		status.setSize(60, 30);
		add(status, BorderLayout.NORTH);
		
		btnSave = new JButton("保存");
		btnSave.addActionListener(this);
		footerJPanel.add(btnSave);
		btnCancel = new JButton("取消");
		btnCancel.addActionListener(this);
		footerJPanel.add(btnCancel);

		ImagePanel imageJP = new ImagePanel("resource/image/pencil.jpg");
		imageJP.setBounds(80, 80, 100, 100);
		imageJP.setLayout(null);
		this.add(imageJP);
	}
	
	
	public boolean getReturnStatus(){
		   return rst;
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
		
			SeatSrv seatSrv = new SeatSrv();
			Seat seat=new Seat();
			seat.setId(txtId);
			seat.setStudioId(txtStudioId);
			seat.setRow(txtRow);
			seat.setColumn(txtColumn);
			seat.setSeatStatus(Integer.parseInt(status.getSelectedItem().toString()));
			seatSrv.modify(seat);
			seatStatus = Integer.parseInt(status.getSelectedItem().toString());
			rst = true;
			this.dispose();
	}
	public int getSeatStatus() {
		return seatStatus;
	}
}
