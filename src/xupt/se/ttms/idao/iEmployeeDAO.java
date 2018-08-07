package xupt.se.ttms.idao;

import java.util.List;

import xupt.se.ttms.model.Employee;

public interface iEmployeeDAO {
    public int insert(Employee stu);
    public int update(Employee stu);
    public int delete(int ID);
    public List<Employee> select(String condt);

}


