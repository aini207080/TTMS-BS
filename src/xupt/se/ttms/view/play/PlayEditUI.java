package xupt.se.ttms.view.play;

import javax.swing.JOptionPane;

import xupt.se.ttms.model.Play;
import xupt.se.ttms.service.DataDictSrv;
import xupt.se.ttms.service.PlaySrv;
import xupt.se.ttms.view.play.PlayAddUI;

public class PlayEditUI extends PlayAddUI{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;

	public PlayEditUI(Play play) {
		initData(play);
	}

	public void initData(Play play) {
		if(null== play){
			return;
		}
		this.setTitle("修改影片");
		txtName.setText(play.getName());
		
		txtType.setSelectedItem(dataDictSrv.findSelfByID(play.getTypeId()).get(0).getName());
		txtLang.setSelectedItem(dataDictSrv.findSelfByID(play.getLangId()).get(0).getName());
	    txtLength.setText(Integer.toString(play.getLength()));
		txtPrice.setText(Float.toString(play.getTicketPrice()));
		txtStatus.setText(Integer.toString(play.getStatus()));
		txtIntrodution.setText(play.getIntroduction());
		ID = play.getId();
	}
   
	@Override
	protected void btnSaveClicked(){
		if (txtType.getSelectedItem() != null && txtLang.getSelectedItem() != null
				&&txtName.getText() != null && txtIntrodution.getText() != null && txtLength.getText() != null 
				&& txtPrice.getText() != null && txtStatus.getText() != null){
			PlaySrv playSrv = new PlaySrv();
			Play p=new Play();
			p.setId(ID);
			p.setTypeId(dataDictSrv.findSelfByName(txtType.getSelectedItem().toString()).getId());
			p.setLangId(dataDictSrv.findSelfByName(txtLang.getSelectedItem().toString()).getId());
			p.setName(txtName.getText());
			p.setLength(Integer.parseInt(txtLength.getText()));
			p.setTicketPrice(Float.parseFloat(txtPrice.getText()));
			p.setStatus(Integer.parseInt(txtStatus.getText()));
			p.setIntroduction(txtIntrodution.getText());

			playSrv.modify(p);
			this.setVisible(false);
			rst=true;
			getParent().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "数据不完整");
		}		
	}

}
