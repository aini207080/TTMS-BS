package xupt.se.ttms.service;

import java.util.List;

import xupt.se.ttms.idao.DAOFactory;
import xupt.se.ttms.idao.iEmployeeDAO;
import xupt.se.ttms.model.Employee;

public class EmployeeSrv {
    private iEmployeeDAO employeeDAO=DAOFactory.creatEmployeeDAO();

    public int add(Employee stu){
        return employeeDAO.insert(stu);
    }

    public int modify(Employee stu){
        return employeeDAO.update(stu);
    }

    public int delete(int ID){
        return employeeDAO.delete(ID);
    }

    public List<Employee> Fetch(String condt){
        return employeeDAO.select(condt);
    }

    public List<Employee> FetchAll(){
        return employeeDAO.select("");
    }

}
