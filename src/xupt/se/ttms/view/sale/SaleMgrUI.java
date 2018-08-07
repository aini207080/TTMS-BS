package xupt.se.ttms.view.sale;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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

import xupt.se.ttms.model.Sale;
import xupt.se.ttms.model.Studio;
import xupt.se.ttms.model.Ticket;
import xupt.se.ttms.service.SaleSrv;
import xupt.se.ttms.view.progressBar.ProgressBarDemo;
import xupt.se.ttms.view.tmpl.MainUITmpl;
class SaleTable {

	private static final long serialVersionUID = 1L;
	private JTable jt;

	public SaleTable(JScrollPane jp) {
		
		DefaultTableModel tabModel=new DefaultTableModel(){
			private static final long serialVersionUID = 1L;

			@Override              
			public boolean isCellEditable(int row,int column){
				return false;              
			};
		};
		tabModel.addColumn("id");
		tabModel.addColumn("emp id");
		tabModel.addColumn("time");
		tabModel.addColumn("payMent");
		tabModel.addColumn("payChange");
		tabModel.addColumn("type");
		tabModel.addColumn("status");
		//初始化列明
		jt=new JTable(tabModel);	
		
		//设置各列的宽度
	    TableColumnModel columnModel = jt.getColumnModel();
	    
	    //隐藏ID这一列
        TableColumn column = columnModel.getColumn(0);
//        column.setMinWidth(0);
//        column.setMaxWidth(0);
//        column.setWidth(0);
        column.setPreferredWidth(10);

        column = columnModel.getColumn(1);
        column.setPreferredWidth(10);
        column = columnModel.getColumn(2);
        column.setPreferredWidth(30);
        column = columnModel.getColumn(3);
        column.setPreferredWidth(10);
        column = columnModel.getColumn(4);
        column.setPreferredWidth(10);
        column = columnModel.getColumn(5);
        column.setPreferredWidth(10);
        column = columnModel.getColumn(6);
        column.setPreferredWidth(10);

		
		jp.add(jt);
		jp.setViewportView(jt);
		
	}
	
	public Sale getSale() {
		int row=jt.getSelectedRow();
		if(row>=0){
			Sale sale = new Sale();
			sale.setId(Integer.parseInt(jt.getValueAt(row, 0).toString()));
			sale.setEmpId(Integer.parseInt(jt.getValueAt(row, 1).toString()));
			java.text.SimpleDateFormat sdf= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//小写的mm表示的是分钟   
			java.util.Date date = null;
			try {
				
				date = sdf.parse(jt.getValueAt(row, 2).toString());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			sale.setTime(date);
			//sale.setTime(new Date(jt.getValueAt(row, 2).toString())); 
			sale.setPayment(Float.parseFloat(jt.getValueAt(row, 3).toString()));
			sale.setChange(Float.parseFloat(jt.getValueAt(row, 4).toString()));
			sale.setType(Integer.parseInt(jt.getValueAt(row, 5).toString()));
			sale.setStatus(Integer.parseInt(jt.getValueAt(row, 6).toString()));

			return sale;
		}
		else{
			return null;
		}
			
	}
	
	// 创建JTable
	public void showSaleList(List<Sale> stuList) {
		try {
			DefaultTableModel tabModel = (DefaultTableModel) jt.getModel();
			tabModel.setRowCount(0);
			
			Iterator<Sale> itr = stuList.iterator();
			while (itr.hasNext()) {
				Sale sale = itr.next();
				Object data[] = new Object[7];
				data[0] = Integer.toString(sale.getId());
				data[1] = Integer.toString(sale.getEmpId());
				data[2] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(sale.getTime()); 
				data[3] = Float.toString(sale.getPayment());
				data[4] = Float.toString(sale.getChange());
				data[5] = Integer.toString(sale.getType());
				data[6] = Integer.toString(sale.getStatus());
				tabModel.addRow(data);;
			}
			jt.invalidate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class SaleMgrUI extends MainUITmpl {
	
	private static final long serialVersionUID = 1L;
	private JLabel ca1 = null; // 界面提示
	// 用来放表格的滚动控件
	private JScrollPane jsc;
	// 查找的提示和输出
	private JLabel hint;
	private JTextField input;

	// 查找，编辑和删除按钮
	private JButton btnAdd, btnEdit, btnDel, btnQuery, btnStatistics;
	
	private List<Ticket> ticketList;
	
	private Rectangle rect;
	SaleTable tms;

	public SaleMgrUI() {
	}

	// To be override by the detailed business block interface
//	@Override
	protected void initContent() {
		rect = contPan.getBounds();

		ca1 = new JLabel("销售记录", JLabel.CENTER);
		ca1.setBounds(0, 5, rect.width, 30);
		ca1.setFont(new java.awt.Font("宋体", 1, 20));
		ca1.setForeground(Color.blue);
		contPan.add(ca1);

		jsc = new JScrollPane();
		jsc.setBounds(0, 40, rect.width, rect.height - 90);
		contPan.add(jsc);

		hint = new JLabel("请输入sale Id:", JLabel.RIGHT);
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


		btnDel = new JButton("删除");
		btnDel.setBounds(rect.width - 180, rect.height - 45, 80, 30);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				btnDelClicked();
			}
		});
		contPan.add(btnDel);
		
		
		btnStatistics = new JButton("统计");
		btnStatistics.setBounds(rect.width - 100, rect.height - 45, 80, 30);
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				Statistics();
			}
		});
		contPan.add(btnStatistics);
		
		tms = new SaleTable(jsc);
	
		showTable();
		
		ticketList = new LinkedList<Ticket>();
		
	}

	

	

	protected void Statistics() {
		ProgressBarDemo progressBarDemo = new ProgressBarDemo();
        new Thread(){
			public void run(){
		Statistics sta = new Statistics();
		sta.setWindowName("统计销售额");
		sta.toFront();
		sta.setVisible(true);
			}
        }.start();
 	}

	private void btnDelClicked() {
		Sale sale = tms.getSale();
		if(null== sale){
			JOptionPane.showMessageDialog(null, "请选择要删除的记录");
			return; 
		}
		int confirm = JOptionPane.showConfirmDialog(null, "确认删除所选？", "删除", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			SaleSrv saleSrv = new SaleSrv();
			saleSrv.delete(sale.getId());
			showTable();
		}
	}

	private void btnQueryClicked() {
		if (input.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "请输入检索条件");
		} else {
			SaleSrv SaleSrv = new SaleSrv();
			List<Sale> saleList = SaleSrv.Fech( input.getText());
			tms.showSaleList(saleList);
		}
	}
	
	public void showTable() {
		List<Sale> saleList = new SaleSrv().Fech("");
		tms.showSaleList(saleList);
	}
	

	public static void main(String[] args) {
		SaleMgrUI frmSaleMgr = new SaleMgrUI();
		frmSaleMgr.setVisible(true);
	}

}

