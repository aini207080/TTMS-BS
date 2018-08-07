package xupt.se.ttms.view.datadict;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import xupt.se.ttms.model.DataDict;
import xupt.se.ttms.service.DataDictSrv;
import xupt.se.ttms.view.tmpl.*;

public class DataDictAddUI extends PopUITmpl implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton btnCancel, btnSave; 	//取消，保存按鈕

	protected boolean rst=false; 				//操作结果
	protected JLabel lblSuperId,lblIndex, lblName, lblValue;
	protected JComboBox<String> txtSuperId;

	protected JTextField txtName, txtValue;

	public DataDictAddUI() {

	}

	protected void initContent(){
		this.setTitle("添加数据字典");
		DataDictSrv dataDictSrv = new DataDictSrv();
		List<DataDict> listsAllDataDict = dataDictSrv.Fetch("dict_parent_id =1 or dict_id = 1");
		String [] parentNode = new String[listsAllDataDict.size()];
		for(int i=0; i<listsAllDataDict.size(); i++) 
		{    
			parentNode[i] = listsAllDataDict.get(i).getName();
		} 
		
		lblSuperId = new JLabel("父类型：");
		lblSuperId.setBounds(60, 30, 80, 30);
		contPan.add(lblSuperId);
		txtSuperId = new JComboBox<String>(parentNode);
		txtSuperId.setBounds(150, 30, 120, 30);
		contPan.add(txtSuperId);

		lblName = new JLabel("字典名称：");
		lblName.setBounds(60, 80, 80, 30);
		contPan.add(lblName);
		txtName = new JTextField();
		txtName.setBounds(150, 80, 120, 30);
		contPan.add(txtName);

		lblValue = new JLabel("字典值：");
		lblValue.setBounds(60, 130, 80, 30);
		contPan.add(lblValue);
		txtValue = new JTextField();
		txtValue.setBounds(150, 130, 120, 30);
		contPan.add(txtValue);

		btnSave = new JButton("保存");

		btnSave.addActionListener(this);
		btnSave.setBounds(60, 180, 80, 30);
		contPan.add(btnSave);

		btnCancel = new JButton("取消");
		btnCancel.addActionListener(this);
		btnCancel.setBounds(180, 180, 80, 30);
		contPan.add(btnCancel);
	}
	
	
	public boolean getReturnStatus(){
		   return rst;
	}

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
		if (txtSuperId.getSelectedItem() != null && txtName.getText() != null
				&& txtValue.getText() != null) {
			DataDictSrv dictSrv = new DataDictSrv();
			DataDict ddict =new DataDict();
			List<DataDict> super_id = dictSrv.Fetch("dict_name = '" + txtSuperId.getSelectedItem() + "'");
			List<DataDict> bortherList =dictSrv.Fetch("dict_parent_id = " + super_id.get(0).getId());
			ddict.setSuperId(super_id.get(0).getId());
			ddict.setIndex(bortherList.size() +1);
			ddict.setName(txtName.getText());
			ddict.setValue(txtValue.getText());
			dictSrv.add(ddict);
			this.dispose();
			rst=true;
			getParent().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "数据不完整");
		}		
	}
}
