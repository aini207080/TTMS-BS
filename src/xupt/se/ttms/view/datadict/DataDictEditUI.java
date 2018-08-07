package xupt.se.ttms.view.datadict;

import javax.swing.JDialog;








import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



//import view.studioUI.ImageJPanel;



import xupt.se.ttms.model.DataDict;
import xupt.se.ttms.service.DataDictSrv;
import xupt.se.ttms.view.datadict.DataDictAddUI;

public class DataDictEditUI extends DataDictAddUI{

	int id ;
	public DataDictEditUI(DataDict ddict) {
		initData(ddict);
	}

	public void initData(DataDict ddict) {
		if(null== ddict){
			return;
		}
		this.setTitle("修改数据字典");
		id = ddict.getId();
		txtSuperId.setSelectedItem(new DataDictSrv().Fetch("dict_id = " + ddict.getSuperId()).get(0).getName());
		
		txtName.setText(ddict.getName());
		txtValue.setText(ddict.getValue());
	}

	protected void btnSaveClicked(){
		if (txtSuperId.getSelectedItem() != null && txtName.getText() != null
				&& txtValue.getText() != null) {
			DataDictSrv dictSrv = new DataDictSrv();
			DataDict ddict=new DataDict();
			ddict.setId(id);
			ddict.setSuperId(dictSrv.findSelfByName(txtSuperId.getSelectedItem().toString()).getId());
			ddict.setName(txtName.getText());  
			ddict.setValue(txtValue.getText()); 

			dictSrv.modify(ddict);
			this.setVisible(false);
			rst=true;
			getParent().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "数据不完整");
		}		
	}

}
