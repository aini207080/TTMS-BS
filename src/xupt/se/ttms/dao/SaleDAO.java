package xupt.se.ttms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.xml.crypto.Data;

import xupt.se.ttms.idao.iSaleDAO;
import xupt.se.ttms.model.Sale;
import xupt.se.ttms.model.Seat;
import xupt.se.ttms.model.Studio;
import xupt.se.ttms.model.Ticket;
import xupt.se.ttms.service.PlaySrv;
import xupt.se.ttms.service.ScheduleSrv;
import xupt.se.util.DBUtil;

public class SaleDAO implements iSaleDAO {
	DBUtil db;
	Connection con;

	@Override
	public boolean doSale(List<Ticket> tickets, Sale sale) {
		try {
			int id = -1;
			db = new DBUtil();
			db.openConnection();
			con = db.getConn();
			con.setAutoCommit(false);
			/*
			 *  生成销售单
			 */
	        String sqlDoSale = "insert into sale(emp_id, sale_time, sale_payment, sale_change, sale_type, sale_status) VALUES(?,?,?,?,1,1)";  
	        PreparedStatement prep = con.prepareStatement(sqlDoSale, PreparedStatement.RETURN_GENERATED_KEYS);  ;
	        prep.setInt(1, sale.getEmpId());  
	        prep.setTimestamp(2, new Timestamp(new Date().getTime()));  
	        prep.setFloat(3, sale.getPayment());  
	        prep.setFloat(4, sale.getChange());  
	        prep.executeUpdate();  
	        ResultSet rs = prep.getGeneratedKeys();  
	        if (rs.next()) {  
	            id = rs.getInt(1);  
	        }
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
				return false;
			}
			return false;
		} finally {
			try {
				con.setAutoCommit(true);
				db.close();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	@Override
	public int update(Sale sale) {
		int rtn=0;
		try {
			String sql = "update sale set " + " emp_id ='"
					+ sale.getEmpId() + "', " + " sale_payment = '"
					+ sale.getPayment() + "', " + " sale_change = '"
					+ sale.getChange() + "', " + " sale_type = '"
					+ sale.getType() + "' ," + "sale_time = '"
					+ sale.getTime() +"'," +  "sale_status = '"
					+ sale.getStatus() +"'";

			sql += " where sale_id = " + sale.getId();
			DBUtil db = new DBUtil();
			db.openConnection();
			rtn =db.execCommand(sql);
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtn;
	}

	@Override
	public int delete(int ID) {
		int rtn=0;		
		try{
			String sql = "delete from sale ";
			sql += " where sale_id = " + ID;
			DBUtil db = new DBUtil();
			db.openConnection();
			rtn=db.execCommand(sql);
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtn;		
	}
	@Override
	public List<Sale> select(String condt){
		List<Sale> saleList = null;
		saleList = new LinkedList<Sale>();
		try {
			String sql = "select * from sale ";
			condt.trim();
			if (!condt.isEmpty())
				sql += " where sale_id = " + condt;
			DBUtil db = new DBUtil();
			if (!db.openConnection()) {
				System.out.print("fail to connect database");
				return null;
			}
			ResultSet rst = db.execQuery(sql);
			if (rst != null) {
				while (rst.next()) {
					Sale sale = new Sale();
					sale.setId(rst.getInt("sale_id"));
					sale.setEmpId(rst.getInt("emp_id"));
					sale.setTime(rst.getTimestamp("sale_time"));
					sale.setPayment(rst.getFloat("sale_payment"));
					sale.setChange(rst.getFloat("sale_change"));
					sale.setStatus(rst.getInt("sale_status"));
					sale.setType(rst.getInt("sale_type"));
					saleList.add(sale);
				}
			}
			db.close(rst);
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		return saleList;
	}

	@Override
	public boolean doSale(List<Ticket> tickets) {
		return false;
	}
	public int statisticsyear(String condt,String condt1){
		int a=0;
		try {
			String sql = "SELECT sum(sale_payment-sale_change) AS 'sum' FROM sale ";
			condt.trim();
			if (!condt.isEmpty())
				sql += " WHERE sale_time BETWEEN  '" + condt+ "' AND '" +condt1+"'";
//			System.out.println(sql);
			DBUtil db = new DBUtil();
			if (!db.openConnection()) {
				System.out.print("fail to connect database");
			}
			ResultSet rst = db.execQuery(sql);
			if (rst != null) {
				while (rst.next()) {
					a=rst.getInt("sum");
				}
			}
			db.close(rst);
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return a;
	}
	public int statisticsemployee(String condt){
		int a=0;
		try {
			String sql = "SELECT sum(sale_payment-sale_change) AS 'sum' FROM sale ";
			condt.trim();
			if (!condt.isEmpty())
				sql += " WHERE emp_id =  " + condt;
//			System.out.println(sql);
			DBUtil db = new DBUtil();
			if (!db.openConnection()) {
				System.out.print("fail to connect database");
			}
			ResultSet rst = db.execQuery(sql);
			if (rst != null) {
				while (rst.next()) {
					a=rst.getInt("sum");
				}
			}
			db.close(rst);
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return a;
	}
	public int statisticsplay(String condt){
		int a=0;
		try {
			String sql = "SELECT sum(ticket_price) AS 'sum' FROM ticket,schedule,play ";
			condt.trim();
			if (!condt.isEmpty())
				sql += " WHERE ticket.sched_id = schedule.sched_id  AND schedule.play_id = play.play_id AND play_name = '" + condt+"'";
//			System.out.println(sql);
			DBUtil db = new DBUtil();
			if (!db.openConnection()) {
				System.out.print("fail to connect database");
			}
			ResultSet rst = db.execQuery(sql);
			if (rst != null) {
				while (rst.next()) {
					a=rst.getInt("sum");
				}
			}
			db.close(rst);
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return a;
	}
}