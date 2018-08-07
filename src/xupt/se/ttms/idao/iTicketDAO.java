package xupt.se.ttms.idao;
import xupt.se.ttms.model.Ticket;

import java.util.List;

public interface iTicketDAO {
	public int insert(Ticket stu);
	public int update(Ticket stu);
	public int delete(int ID);
	public int lockTicket(int ID, String date);
	public int unlockTicket(int ID);
	public List<Ticket> select(String condt);
}
