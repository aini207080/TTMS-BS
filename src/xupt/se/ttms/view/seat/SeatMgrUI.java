package xupt.se.ttms.view.seat;

import java.awt.Color;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import xupt.se.ttms.model.Seat;
import xupt.se.ttms.service.SeatSrv;
import xupt.se.ttms.view.tmpl.*;

import java.util.List;
import java.util.Iterator;

class SeatTable {

	private static final long serialVersionUID = 1L;
	private JTable jt;

	public SeatTable(JScrollPane jp) {
		
		DefaultTableModel tabModel=new DefaultTableModel(){
			private static final long serialVersionUID = 1L;

			@Override              
			public boolean isCellEditable(int row,int column){
				return false;              
			};
		};
		tabModel.addColumn("id");
		tabModel.addColumn("studioId");
		tabModel.addColumn("row");
		tabModel.addColumn("column");
		tabModel.addColumn("seat_status");
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
	
	public Seat getSeat() {
		int row=jt.getSelectedRow();
		if(row>=0){
			Seat seat = new Seat();
			seat.setId(Integer.parseInt(jt.getValueAt(row, 0).toString()));
			seat.setStudioId(Integer.parseInt(jt.getValueAt(row, 1).toString()));
			seat.setRow(Integer.parseInt(jt.getValueAt(row, 2).toString())); 
			seat.setColumn(Integer.parseInt(jt.getValueAt(row, 3).toString()));
			seat.setSeatStatus(Integer.parseInt(jt.getValueAt(row, 4).toString()));

			return seat;
		}
		else{
			return null;
		}
			
	}
	
	// 创建JTable
	public void showSeatList(List<Seat> seatList) {
		try {
			DefaultTableModel tabModel = (DefaultTableModel) jt.getModel();
			tabModel.setRowCount(0);
			
			Iterator<Seat> itr = seatList.iterator();
			while (itr.hasNext()) {
				Object data[] = new Object[5];
				Seat tmpSeat = itr.next();
				data[0] = Integer.toString(tmpSeat.getId());
				data[1] = Integer.toString(tmpSeat.getStudioId());
				data[2] = Integer.toString(tmpSeat.getRow());
				data[3] = Integer.toString(tmpSeat.getColumn());
				data[4] = Integer.toString(tmpSeat.getSeatStatus());
				tabModel.addRow(data);;
			}
			jt.invalidate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class SeatMgrUI extends MainUITmpl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SeatTable tms; 
	private JLabel ca1 = null; // 界面提示
	// 用来放表格的滚动控件
	private JScrollPane jsc;
	// 查找的提示和输出
	private JLabel hint;
	private JTextField input;

	// 查找，编辑和删除按钮
	private JButton btnAdd, btnEdit, btnDel, btnQuery;

	public SeatMgrUI() {
		initialize();
	}

	// To be override by the detailed business block interface
	
	private void initialize() {
		Rectangle rect = contPan.getBounds();

		ca1 = new JLabel("座位管理", JLabel.CENTER);
		ca1.setBounds(0, 5, rect.width, 30);
		ca1.setFont(new java.awt.Font("宋体", 1, 20));
		ca1.setForeground(Color.blue);
		contPan.add(ca1);

		jsc = new JScrollPane();
		jsc.setBounds(0, 40, rect.width, rect.height - 90);
		contPan.add(jsc);

		hint = new JLabel("请输入所在影厅ID:", JLabel.RIGHT);
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
		contPan.add(ca1);
		tms = new SeatTable(jsc);
		showTable();
	}

	private void btnAddClicked() {
		SeatAddUI addStud = new SeatAddUI();
		addStud.toFront();
		addStud.setModal(true);
		addStud.setVisible(true);

		if (addStud.getReturnStatus()) {
			showTable();
		}
	}

	private void btnModClicked() {
		Seat seat = tms.getSeat();
		if(null== seat){
			JOptionPane.showMessageDialog(null, "请选择要修改座位的演出厅");
			return; 
		}
		SeatEditUI modStu = new SeatEditUI(seat);
		modStu.toFront();
		modStu.setModal(true);
		modStu.setVisible(true);
		if (modStu.getReturnStatus()) {
			showTable();
		}
	}

	private void btnDelClicked() {
		Seat seat = tms.getSeat();
		if(null== seat){
			JOptionPane.showMessageDialog(null, "请选择要删除座位的演出厅");
			return; 
		}
		int confirm = JOptionPane.showConfirmDialog(null, "确认删除所选？", "删除", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			SeatSrv seatSrv = new SeatSrv();
			seatSrv.delete(seat.getId());
			showTable();
		}
	}

	private void btnQueryClicked() {
		if (input.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "请输入检索条件");

		} else {
			SeatSrv seatSrv = new SeatSrv();
			List<Seat> seatList = seatSrv.Fetch("studio_id ='" + input.getText());
			tms.showSeatList(seatList);
		}
	}

	public void showTable() {
		List<Seat> seatList =new SeatSrv().FetchAll();
		tms.showSeatList(seatList);
	}

	public static void main(String[] args) {
		SeatMgrUI frmStuMgr = new SeatMgrUI();
		frmStuMgr.setVisible(true);
	}
}
