package xupt.se.ttms.view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Blob;
import java.awt.Label;
import java.util.Iterator;
import java.util.List;

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

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import xupt.se.ttms.model.Play;
import xupt.se.ttms.service.DataDictSrv;
import xupt.se.ttms.service.PlaySrv;
import xupt.se.ttms.view.tmpl.*;

class PlayTable {

	private static final long serialVersionUID = 1L;
	private JTable jt;

	public PlayTable(JScrollPane jp) {
		
		DefaultTableModel tabModel=new DefaultTableModel(){
			private static final long serialVersionUID = 1L;

			@Override              
			public boolean isCellEditable(int row,int column){
				return false;              
			};
		};
		tabModel.addColumn("play_id");
		tabModel.addColumn("play_type");
		tabModel.addColumn("play_lang");
		tabModel.addColumn("play_name");
		tabModel.addColumn("play_introduction");
		tabModel.addColumn("play_length");
		tabModel.addColumn("play_ticket_price");
		tabModel.addColumn("play_status");
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
        column.setPreferredWidth(50);        
        column = columnModel.getColumn(6);
        column.setPreferredWidth(10);
        column = columnModel.getColumn(7);
        column.setPreferredWidth(10);     
		
		jp.add(jt);
		jp.setViewportView(jt);
		
	}
	
	public Play getPlay() {
		int row=jt.getSelectedRow();
		if(row>=0){
			Play play = new Play();
			DataDictSrv dataDictSrv = new DataDictSrv();
			play.setId(Integer.parseInt(jt.getValueAt(row, 0).toString()));
			play.setTypeId(dataDictSrv.findSelfByName(jt.getValueAt(row, 1).toString()).getId());
			play.setLangId(dataDictSrv.findSelfByName(jt.getValueAt(row, 2).toString()).getId());
			play.setName(jt.getValueAt(row, 3).toString());
			play.setLength(Integer.parseInt(jt.getValueAt(row, 5).toString()));
			play.setTicketPrice(Float.parseFloat(jt.getValueAt(row, 6).toString()));
			play.setStatus(Integer.parseInt(jt.getValueAt(row, 7).toString()));
			if (jt.getValueAt(row, 4) != null)
				play.setIntroduction(jt.getValueAt(row, 4).toString());
			else
				play.setIntroduction("");

			return play;
		}
		else{
			return null;
		}
			
	}
	
	// 创建JTable
	public void showPlayList(List<Play> playList) {
		try {
			DefaultTableModel tabModel = (DefaultTableModel) jt.getModel();
			tabModel.setRowCount(0);
			
			Iterator<Play> itr = playList.iterator();
			while (itr.hasNext()) {
				Play p = itr.next();
				DataDictSrv findSelfByName = new DataDictSrv();
				Object data[] = new Object[8];
				data[0] = Integer.toString(p.getId());
				data[1] = findSelfByName.findSelfByID(p.getTypeId()).get(0).getName();
				data[2] = findSelfByName.findSelfByID(p.getLangId()).get(0).getName();
				data[3] = p.getName();
				data[4] = p.getIntroduction();
				data[5] = Integer.toString(p.getLength());
				data[6] = p.getTicketPrice();
				data[7] = Integer.toString(p.getStatus());
				tabModel.addRow(data);;
			}
			jt.invalidate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class PlayMgrUI extends MainUITmpl{
	private static final long serialVersionUID = 1L;
	private JLabel ca1 = null; // 界面提示
	// 用来放表格的滚动控件
	private JScrollPane jsc;
	// 查找的提示和输出
	private JLabel hint;
	private JTextField input;
	PlayTable tms;
	// 查找，编辑和删除按钮
	private JButton btnAdd, btnEdit, btnDel, btnQuery;

	public PlayMgrUI() {
	}

	// To be override by the detailed business block interface
	protected void initContent() {
		Rectangle rect = contPan.getBounds();
		setLayout(new BorderLayout());
		JPanel topJPanel = new JPanel(new FlowLayout());
		add(topJPanel, BorderLayout.NORTH);
		ca1 = new JLabel("影片管理", JLabel.CENTER);
		ca1.setBounds(0, 5, rect.width, 30);
		ca1.setFont(new Font("宋体", 1, 20));
		ca1.setForeground(Color.blue);
		contPan.add(ca1);
	
		jsc = new JScrollPane();
		jsc.setBounds(0, 40, rect.width, rect.height - 90);
		contPan.add(jsc);

		hint = new JLabel("请输入影片名称:", JLabel.RIGHT);
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
		tms = new PlayTable(jsc);
		showTable();
	}
    
	private void btnAddClicked() {
		PlayAddUI addPlay =null;
		addPlay = new PlayAddUI();
		addPlay.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		addPlay.setWindowName("添加剧目");
		addPlay.toFront();
		addPlay.setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
		addPlay.setVisible(true);
		if (addPlay.getReturnStatus()) {
			showTable();
		}
	}

	private void btnModClicked() {
		Play play = tms.getPlay();
		if(null== play){
			JOptionPane.showMessageDialog(null, "请选择要修改的剧目");
			return; 
		}	
		PlayEditUI modStu = new PlayEditUI(play);
		modStu.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		modStu.setWindowName("修改剧目");
		modStu.initData(play);
		modStu.toFront();
		modStu.setModal(true);
		modStu.setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
		modStu.setVisible(true);
		if (modStu.getReturnStatus()) {
			showTable();
		}
	}

	private void btnDelClicked() {
		Play play = tms.getPlay();
		if(null== play){
			JOptionPane.showMessageDialog(null, "请选择要删除的剧目");
			return; 
		}
		int confirm = JOptionPane.showConfirmDialog(null, "确认删除所选？", "删除", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			PlaySrv playSrv = new PlaySrv();
			playSrv.delete(play.getId());
			showTable();
		}
	}

	private void btnQueryClicked() {
		if (input.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "请输入检索条件");
			
		} else {
			PlaySrv playSrv = new PlaySrv();
			List<Play> playList = playSrv.Fetch("play_name='" + input.getText() + "'");
			tms.showPlayList(playList);
		}
	}
	
	private void showTable() {
		List<Play> playList = new  PlaySrv().FetchAll();
		tms.showPlayList(playList);
	}

	public static void main(String[] args) {
		PlayMgrUI frmStuMgr= new PlayMgrUI();
		frmStuMgr.setVisible(true);
	}
}
