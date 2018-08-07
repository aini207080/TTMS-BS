package xupt.se.ttms.view.employee;

import javax.swing.JOptionPane;

import xupt.se.ttms.model.Employee;
import xupt.se.ttms.service.EmployeeSrv;
import xupt.se.ttms.view.employee.EmployeeAddUI;

public class EmployeeEditUI extends EmployeeAddUI{
	private static final long serialVersionUID = 1L;
	private Employee stud;
	public EmployeeEditUI(Employee stu) {
		initData(stu);
	}

	public void initData(Employee stu) {
		if(null== stu){
			return;
		}
		this.setTitle("修改雇员信息");
		txtName.setText(Integer.toString(stu.getEmployee_workid()));
		txtRow.setText(stu.getEmployee_name());
		txtColumn.setText(stu.getEmployee_tel());
		txtInfo.setText(stu.getEmployee_address());
		txtFlag.setText(stu.getEmployee_email());
		stud=stu;
		this.invalidate();
	}

	protected void btnSaveClicked(){
		if (txtName.getText() != null && txtRow.getText() != null
				&& txtColumn.getText() != null && txtFlag.getText() != null) {
			EmployeeSrv stuSrv = new EmployeeSrv();
			Employee stu=stud;
			stu.setEmployee_workid(Integer.parseInt(txtName.getText()));
			stu.setEmployee_name(txtRow.getText());
			stu.setEmployee_tel(txtColumn.getText());
			stu.setEmployee_address(txtInfo.getText());
			stu.setEmployee_email(txtFlag.getText());
			stuSrv.modify(stu);
			this.setVisible(false);
			rst=true;
		} else {
			JOptionPane.showMessageDialog(null, "数据不完整");
		}		
	}

}