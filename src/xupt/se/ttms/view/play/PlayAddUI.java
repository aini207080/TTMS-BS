package xupt.se.ttms.view.play;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import javax.swing.JComboBox;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.border.Border;

import xupt.se.ttms.model.DataDict;
import xupt.se.ttms.model.Play;
import xupt.se.ttms.service.DataDictSrv;
import xupt.se.ttms.service.PlaySrv;
import xupt.se.ttms.view.tmpl.*;

public class PlayAddUI extends PopUITmpl implements ActionListener {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton btnCancel, btnSave; 	//取消，保存按鈕

	protected boolean rst=false; 				//操作结果
	private JLabel lb1type, lb1lang,lblName, lb1introduction, lb1length, lb1price, lb1status;
	protected JTextField  txtName, txtLength, txtPrice, txtStatus;

	protected JTextArea txtIntrodution;

	DataDictSrv dataDictSrv = new DataDictSrv();
    List<DataDict> listPlayType = dataDictSrv.findByID(2);
    
	List<DataDict> listPlayLang = dataDictSrv.findByID(3);
	
	protected  JComboBox<String> txtType;
	protected  JComboBox<String> txtLang;
	
	
	public PlayAddUI() {
	}

	protected void initContent(){
		DataDictSrv dataDictSrv = new DataDictSrv();
	    List<DataDict> listPlayType = dataDictSrv.findByID(2);
	    
		List<DataDict> listPlayLang = dataDictSrv.findByID(3);
		String [] type = new String[listPlayType.size()];
		String [] lang = new String[listPlayLang.size()];
		DataDict d;
		for(int i=0; i<listPlayType.size(); i++) 
		{    
			  d = listPlayType.get(i);
		      type[i] = d.getName();
		} 
		for(int i=0;i<listPlayLang.size();i++) 
		{    
			  d = listPlayLang.get(i);
		      lang[i] = d.getName();
		} 
		txtType = new JComboBox<String>(type);
	
		txtLang = new JComboBox<String>(lang);
		this.setTitle("添加影片");
		lb1type = new JLabel("影片类型");
		lb1type.setBounds(60, 30, 80, 30);
		contPan.add(lb1type);
		txtType.setBounds(150, 30, 120, 30);
		contPan.add(txtType);

		lb1lang = new JLabel("语言类型");
		lb1lang.setBounds(60, 80, 80, 30);
		contPan.add(lb1lang);
		txtLang.setBounds(150, 80, 120, 30);
		contPan.add(txtLang);

		lblName = new JLabel("影片名称：");
		lblName.setBounds(60, 150, 80, 30);
		contPan.add(lblName);
		txtName = new JTextField();
		txtName.setBounds(150, 150, 120, 30);
		contPan.add(txtName);
		
		lb1introduction = new JLabel("电影描述");
		lb1introduction.setBounds(60, 200, 80, 30);
		contPan.add(lb1introduction);
		txtIntrodution = new JTextArea("");
		txtIntrodution.setLineWrap(true);//激活自动换行功能
		txtIntrodution.setWrapStyleWord(true);//激活断行不断字功能
		txtIntrodution.setBounds(150, 200, 400, 80);
		txtIntrodution.setBackground(Color.white);
		txtIntrodution.setBorder (BorderFactory.createLineBorder(Color.gray,2)); //设置边框
		contPan.add(txtIntrodution);
		
		lb1length = new JLabel("电影时长");
		lb1length.setBounds(60, 300, 80, 30);
		contPan.add(lb1length);
		txtLength = new JTextField();
		txtLength.setBounds(150, 300, 120, 30);
		contPan.add(txtLength);

		lb1price = new JLabel("票价：");
		lb1price.setBounds(60, 350, 50, 30);
		contPan.add(lb1price);
		txtPrice = new JTextField();
		txtPrice.setBounds(150, 350, 120, 30);
		contPan.add(txtPrice);

		lb1status = new JLabel("状态：");
		lb1status.setBounds(60, 400, 90, 30);
		contPan.add(lb1status);
		txtStatus = new JTextField();
		txtStatus.setBounds(150, 400, 120, 30);
		contPan.add(txtStatus);

		btnSave = new JButton("保存");

		btnSave.addActionListener(this);
		btnSave.setBounds(60, 450, 60, 30);
		contPan.add(btnSave);

		btnCancel = new JButton("取消");
		btnCancel.addActionListener(this);
		btnCancel.setBounds(180, 450, 60, 30);
		contPan.add(btnCancel);
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
		

		
		if (txtType.getSelectedItem() != null && txtLang.getSelectedItem() != null
				&& txtName.getText() != null && txtIntrodution.getText() != null && txtLength.getText() != null 
				&& txtPrice.getText() != null && txtStatus.getText() != null) {
			PlaySrv stuSrv = new PlaySrv();
			Play p=new Play();	
			
			p.setTypeId(dataDictSrv.findSelfByName(txtType.getSelectedItem().toString()).getId());
			p.setLangId(dataDictSrv.findSelfByName(txtLang.getSelectedItem().toString()).getId());
			p.setName(txtName.getText());
			p.setLength(Integer.parseInt(txtLength.getText()));
			p.setTicketPrice(Float.parseFloat(txtPrice.getText()));
			p.setStatus(Integer.parseInt(txtStatus.getText()));
			p.setIntroduction(txtIntrodution.getText());


			stuSrv.add(p);
			rst=true;
			this.dispose();
			
			getParent().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "数据不完整");
		}		
	}
}