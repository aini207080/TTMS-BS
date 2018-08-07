package xupt.se.ttms.idao;
import xupt.se.ttms.model.Sale;
import xupt.se.ttms.model.Ticket;

import java.util.List;

public interface iSaleDAO {
	public boolean doSale(List<Ticket> tickets);

	public List<Sale> select(String condt);

	public int  update(Sale sale);

	public int delete(int ID);

	boolean doSale(List<Ticket> tickets, Sale sale);
}
