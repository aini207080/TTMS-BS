package xupt.se.ttms.view.sale;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import xupt.se.ttms.dao.SaleDAO;
import xupt.se.ttms.model.Employee;
import xupt.se.ttms.model.Play;
import xupt.se.ttms.service.EmployeeSrv;
import xupt.se.ttms.service.PlaySrv;
import xupt.se.ttms.view.tmpl.PopUITmpl;

public class Statistics extends PopUITmpl{
	private static final long serialVersionUID = 1L;
	protected  JComboBox<String> day;
	protected  JComboBox<String> month;
	protected  JComboBox<String> quarter;
	protected  JComboBox<String> year;
	protected JComboBox<Integer> txtEmpId;
	protected  JComboBox<String> play;
	private JLabel lb1day, lb1month,lblyear,lb1quarter,lblEmpId,lblplay,lb1Total,lb1TotalChange;
	private JLabel myear, mquarter, mmonth, mday,memployee,mplay;
	private JButton query1, query2,query3,query4,query5,query6,query7;
	private JButton Analysis1, Analysis2,Analysis3,Analysis4,Analysis5,Analysis6;
	private EmployeeSrv employeeSrv;
	private PlaySrv playSrv;
	protected void initContent(){
		//记录总收入
		SaleDAO years =new SaleDAO();
		//记录每一年的收入
		int yearSale2000 =years.statisticsyear("20000101","20010101");
		int yearSale2001 =years.statisticsyear("20010101","20020101");
		int yearSale2002 =years.statisticsyear("20020101","20030101");
		int yearSale2003 =years.statisticsyear("20030101","20040101");
		int yearSale2004 =years.statisticsyear("20040101","20050101");
		int yearSale2005 =years.statisticsyear("20050101","20060101");
		int yearSale2006 =years.statisticsyear("20060101","20070101");
		int yearSale2007 =years.statisticsyear("20070101","20080101");
		int yearSale2008 =years.statisticsyear("20080101","20090101");
		int yearSale2009 =years.statisticsyear("20090101","20100101");
		int yearSale2010 =years.statisticsyear("20100101","20110101");
		int yearSale2011 =years.statisticsyear("20110101","20120101");
		int yearSale2012 =years.statisticsyear("20120101","20130101");
		int yearSale2013 =years.statisticsyear("20130101","20140101");
		int yearSale2014 =years.statisticsyear("20140101","20150101");
		int yearSale2015 =years.statisticsyear("20150101","20160101");
		int yearSale2016 =years.statisticsyear("20160101","20170101");
		int yearSale2017 =years.statisticsyear("20170101","20180101");
		//记录2017年每个季度的收入
		int yearSale20171 =years.statisticsyear("20170101","20170401");
		int yearSale20172 =years.statisticsyear("20170401","20170701");
		int yearSale20173 =years.statisticsyear("20170701","20171001");
		int yearSale20174 =years.statisticsyear("20171001","20180101");
		//记录2017年每个月的收入
		int yearSale1 =years.statisticsyear("20170101","20170201");
		int yearSale2 =years.statisticsyear("20170201","20170301");
		int yearSale3 =years.statisticsyear("20170301","20170401");
		int yearSale4 =years.statisticsyear("20170401","20170501");
		int yearSale5 =years.statisticsyear("20170501","20170601");
		int yearSale6 =years.statisticsyear("20170601","20170701");
		int yearSale7 =years.statisticsyear("20170701","20170801");
		int yearSale8 =years.statisticsyear("20170801","20170901");
		int yearSale9 =years.statisticsyear("20170901","20171001");
		int yearSale10=years.statisticsyear("20171001","20171101");
		int yearSale11=years.statisticsyear("20171101","20171201");
		int yearSale12=years.statisticsyear("20171201","20180101");
		//记录6月每天收入
		int yearSaleday1 =years.statisticsyear("20170601","20170602");
		int yearSaleday2 =years.statisticsyear("20170602","20170603");
		int yearSaleday3 =years.statisticsyear("20170603","20170604");
		int yearSaleday4 =years.statisticsyear("20170604","20170605");
		int yearSaleday5 =years.statisticsyear("20170605","20170606");
		int yearSaleday6 =years.statisticsyear("20170606","20170607");
		int yearSaleday7 =years.statisticsyear("20170607","20170608");
		int yearSaleday8 =years.statisticsyear("20170608","20170609");
		int yearSaleday9 =years.statisticsyear("20170609","20170610");
		int yearSaleday10=years.statisticsyear("20170610","20170611");
		int yearSaleday11=years.statisticsyear("20170611","20170612");
		int yearSaleday12=years.statisticsyear("20170612","20170613");
		int yearSaleday13=years.statisticsyear("20170613","20170614");
		int yearSaleday14=years.statisticsyear("20170614","20170615");
		int yearSaleday15=years.statisticsyear("20170615","20170616");
		int yearSaleday16=years.statisticsyear("20170616","20170617");
		int yearSaleday17=years.statisticsyear("20170617","20170618");
		int yearSaleday18=years.statisticsyear("20170618","20170619");
		int yearSaleday19=years.statisticsyear("20170619","20170620");
		int yearSaleday20=years.statisticsyear("20170620","20170621");
		int yearSaleday21=years.statisticsyear("20170621","20170622");
		int yearSaleday22=years.statisticsyear("20170622","20170623");
		int yearSaleday23=years.statisticsyear("20170623","20170624");
		int yearSaleday24=years.statisticsyear("20170624","20170625");
		int yearSaleday25=years.statisticsyear("20170625","20170626");
		int yearSaleday26=years.statisticsyear("20170626","20170627");
		int yearSaleday27=years.statisticsyear("20170627","20170628");
		int yearSaleday28=years.statisticsyear("20170628","20170629");
		int yearSaleday29=years.statisticsyear("20170629","20170630");
		int yearSaleday30=years.statisticsyear("20170630","20170701");
		//记录每个售票员的销售额
		int yearSaleemp1 =years.statisticsemployee("7");
		int yearSaleemp2 =years.statisticsemployee("8");
		//记录每个剧目的销售额
		int yearSaleplay1 =years.statisticsplay("神奇女侠");
		int yearSaleplay2 =years.statisticsplay("加勒比海盗5：死无对证");
		int yearSaleplay3 =years.statisticsplay("哆啦A梦：大雄的南极冰冰凉大冒险");
		int yearSaleplay4 =years.statisticsplay("摔跤吧！爸爸");
		int yearSaleplay5 =years.statisticsplay("美好的意外");
		
		year = new JComboBox<String>();
		month = new JComboBox<String>();
		quarter = new JComboBox<String>();
		day = new JComboBox<String>();
		myear = new JLabel();
		mquarter = new JLabel();
		mmonth = new JLabel();
		mday = new JLabel();
		memployee = new JLabel();
		mplay = new JLabel();
		year.addItem("2000");
		year.addItem("2001");
		year.addItem("2002");
		year.addItem("2003");
		year.addItem("2004");
		year.addItem("2005");
		year.addItem("2006");
		year.addItem("2007");
		year.addItem("2008");
		year.addItem("2009");
		year.addItem("2010");
		year.addItem("2011");
		year.addItem("2012");
		year.addItem("2013");
		year.addItem("2014");
		year.addItem("2015");
		year.addItem("2016");
		year.addItem("2017");
		quarter.addItem("第一季度");
		quarter.addItem("第二季度");
		quarter.addItem("第三季度");
		quarter.addItem("第四季度");
		month.addItem("一月");
		month.addItem("二月");
		month.addItem("三月");
		month.addItem("四月");
		month.addItem("五月");
		month.addItem("六月");
		month.addItem("七月");
		month.addItem("八月");
		month.addItem("九月");
		month.addItem("十月");
		month.addItem("十一月");
		month.addItem("十二月");
		for (int i = 1; i <= 31; i++) {
		day.addItem(i + "");
		}
		this.setTitle("统计销售额");
		lblyear = new JLabel("按年份查询:");
		lblyear.setBounds(200, 10, 80, 30);
		contPan.add(lblyear);
		year.setBounds(300, 10, 120, 30);
		contPan.add(year);
		query1 = new JButton("查询");
		query1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				SaleDAO years =new SaleDAO();
				int yearSale =years.statisticsyear(Integer.parseInt(year.getSelectedItem().toString())+"0101",String.valueOf(Integer.parseInt(year.getSelectedItem().toString())+1)+"0101");
				myear.setText(year.getSelectedItem().toString() + "年的销售额为:"+ yearSale);
			}
		});
		query1.setBounds(450,10, 60, 30);
		contPan.add(query1);
		myear.setBounds(250, 40, 200, 30);
		contPan.add(myear);
		Analysis1 = new JButton("分析");
		Analysis1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				JFrame frame=new JFrame("年度数据统计分析图");  
			    frame.setLayout(new GridLayout(2,2,10,10));  
			    frame.add(new BarChart(yearSale2000,yearSale2001,yearSale2002,yearSale2003,yearSale2004,yearSale2005,yearSale2006,yearSale2007,yearSale2008,yearSale2009,yearSale2010,yearSale2011,yearSale2012,yearSale2013,yearSale2014,yearSale2015,yearSale2016,yearSale2017).getChartPanel());          //添加柱形图 
			    frame.add(new PieChart(yearSale2000,yearSale2001,yearSale2002,yearSale2003,yearSale2004,yearSale2005,yearSale2006,yearSale2007,yearSale2008,yearSale2009,yearSale2010,yearSale2011,yearSale2012,yearSale2013,yearSale2014,yearSale2015,yearSale2016,yearSale2017).getChartPanel());           //添加饼状图  
			    frame.add(new Line(yearSale2000,yearSale2001,yearSale2002,yearSale2003,yearSale2004,yearSale2005,yearSale2006,yearSale2007,yearSale2008,yearSale2009,yearSale2010,yearSale2011,yearSale2012,yearSale2013,yearSale2014,yearSale2015,yearSale2016,yearSale2017).getChartPanel());    //添加折线图  
			    frame.setBounds(50, 50, 800, 600);  
			    frame.setVisible(true);
			}
		});
		Analysis1.setBounds(450,45, 60, 30);
		contPan.add(Analysis1);

		lb1quarter = new JLabel("按季度查询:");
		lb1quarter.setBounds(200, 90, 80, 30);
		contPan.add(lb1quarter);
		quarter.setBounds(300, 90, 120, 30);
		contPan.add(quarter);
		query2 = new JButton("查询");
		query2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				SaleDAO years =new SaleDAO();
				if(quarter.getSelectedItem().toString()=="第一季度")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0101",year.getSelectedItem().toString()+"0401");
					mquarter.setText(year.getSelectedItem().toString() + "年"+quarter.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(quarter.getSelectedItem().toString()=="第二季度")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0401",year.getSelectedItem().toString()+"0701");
					mquarter.setText(year.getSelectedItem().toString() + "年"+quarter.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(quarter.getSelectedItem().toString()=="第三季度")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0701",year.getSelectedItem().toString()+"1001");
					mquarter.setText(year.getSelectedItem().toString() + "年"+quarter.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(quarter.getSelectedItem().toString()=="第四季度")
				{
					int yearSale =years.statisticsyear(Integer.parseInt(year.getSelectedItem().toString())+"1001",String.valueOf(Integer.parseInt(year.getSelectedItem().toString())+1)+"0101");
					mquarter.setText(year.getSelectedItem().toString() + "年"+quarter.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				} 
			}
		});
		query2.setBounds(450, 90, 60, 30);
		contPan.add(query2);
		mquarter.setBounds(250, 120, 200, 30);
		contPan.add(mquarter);
		Analysis2 = new JButton("分析");
		Analysis2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				JFrame frame=new JFrame("2017年季度数据统计分析图");  
			    frame.setLayout(new GridLayout(2,2,10,10));  
			    frame.add(new BarChartjidu(yearSale20171,yearSale20172,yearSale20173,yearSale20174).getChartPanel());          //添加柱形图
			    frame.add(new PieChartjidu(yearSale20171,yearSale20172,yearSale20173,yearSale20174).getChartPanel());           //添加饼状图  
			    frame.add(new Linejidu(yearSale20171,yearSale20172,yearSale20173,yearSale20174).getChartPanel());    //添加折线图  
			    frame.setBounds(50, 50, 800, 600);  
			    frame.setVisible(true);
			}
		});
		Analysis2.setBounds(450,125, 60, 30);
		contPan.add(Analysis2);

		lb1month = new JLabel("按月份查询:");
		lb1month.setBounds(200, 170, 80, 30);
		contPan.add(lb1month);
		month.setBounds(300, 170, 120, 30);
		contPan.add(month);
		query3 = new JButton("查询");
		query3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				SaleDAO years =new SaleDAO();
				if(month.getSelectedItem().toString()=="一月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0101",year.getSelectedItem().toString()+"0201");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="二月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0201",year.getSelectedItem().toString()+"0301");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="三月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0301",year.getSelectedItem().toString()+"0401");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="四月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0401",year.getSelectedItem().toString()+"0501");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="五月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0501",year.getSelectedItem().toString()+"0601");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="六月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0601",year.getSelectedItem().toString()+"0701");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="七月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0701",year.getSelectedItem().toString()+"0801");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="八月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0801",year.getSelectedItem().toString()+"0901");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="九月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0901",year.getSelectedItem().toString()+"1001");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="十月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"1001",year.getSelectedItem().toString()+"1101");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="十一月")
				{
					int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"1101",year.getSelectedItem().toString()+"1201");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}else if(month.getSelectedItem().toString()=="十二月")
				{
					int yearSale =years.statisticsyear(Integer.parseInt(year.getSelectedItem().toString())+"1201",String.valueOf(Integer.parseInt(year.getSelectedItem().toString())+1)+"0101");
					mmonth.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + "的销售额为:"+ yearSale);
				}
			}
		});
		query3.setBounds(450, 170, 60, 30);
		contPan.add(query3);
		mmonth.setBounds(250, 200, 200, 30);
		contPan.add(mmonth);
		Analysis3 = new JButton("分析");
		Analysis3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				JFrame frame=new JFrame("2017年月份数据统计分析图");  
			    frame.setLayout(new GridLayout(2,2,10,10));  
			    frame.add(new BarChartmonth(yearSale1,yearSale2,yearSale3,yearSale4,yearSale5,yearSale6,yearSale7,yearSale8,yearSale9,yearSale10,yearSale11,yearSale12).getChartPanel());          //添加柱形图 
			    frame.add(new PieChartmonth(yearSale1,yearSale2,yearSale3,yearSale4,yearSale5,yearSale6,yearSale7,yearSale8,yearSale9,yearSale10,yearSale11,yearSale12).getChartPanel());           //添加饼状图  
			    frame.add(new Linemonth(yearSale1,yearSale2,yearSale3,yearSale4,yearSale5,yearSale6,yearSale7,yearSale8,yearSale9,yearSale10,yearSale11,yearSale12).getChartPanel());    //添加折线图  
			    frame.setBounds(50, 50, 800, 600);  
			    frame.setVisible(true);
			}
		});
		Analysis3.setBounds(450,205, 60, 30);
		contPan.add(Analysis3);
		
		lb1day = new JLabel("按日期查询:");
		lb1day.setBounds(200, 250, 80, 30);
		contPan.add(lb1day);
		day.setBounds(300, 250, 120, 30);
		contPan.add(day);
		query4 = new JButton("查询");
		query4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				SaleDAO years =new SaleDAO();
				if(month.getSelectedItem().toString()=="一月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"010"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"010"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0109",year.getSelectedItem().toString()+"0110");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0131",year.getSelectedItem().toString()+"0201");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"01"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"01"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="二月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"020"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"020"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0209",year.getSelectedItem().toString()+"0210");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						mday.setText(month.getSelectedItem().toString()+"没有31号，查询失败");
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"02"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"02"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="三月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"030"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"030"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0309",year.getSelectedItem().toString()+"0310");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0331",year.getSelectedItem().toString()+"0401");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"03"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"03"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="四月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"040"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"040"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0409",year.getSelectedItem().toString()+"0410");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						mday.setText(month.getSelectedItem().toString()+"没有31号，查询失败");
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"04"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"04"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="五月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"050"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"050"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0509",year.getSelectedItem().toString()+"0510");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0531",year.getSelectedItem().toString()+"0601");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"05"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"05"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="六月")
				{

					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"060"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"060"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0609",year.getSelectedItem().toString()+"0610");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						mday.setText(month.getSelectedItem().toString()+"没有31号，查询失败");
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"06"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"06"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="七月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"070"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"070"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0709",year.getSelectedItem().toString()+"0710");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0731",year.getSelectedItem().toString()+"0801");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"07"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"07"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="八月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"080"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"080"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0809",year.getSelectedItem().toString()+"0810");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0831",year.getSelectedItem().toString()+"0901");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"08"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"08"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="九月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"090"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"090"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"0909",year.getSelectedItem().toString()+"0910");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						mday.setText(month.getSelectedItem().toString()+"没有31号，查询失败");
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"09"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"09"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="十月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"100"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"100"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"1009",year.getSelectedItem().toString()+"1010");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"1031",year.getSelectedItem().toString()+"1101");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"10"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"10"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="十一月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"110"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"110"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"1109",year.getSelectedItem().toString()+"1110");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						mday.setText(month.getSelectedItem().toString()+"没有31号，查询失败");
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"11"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"11"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}else if(month.getSelectedItem().toString()=="十二月")
				{
					if(Integer.parseInt(day.getSelectedItem().toString())>0 && Integer.parseInt(day.getSelectedItem().toString())<9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"120"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"120"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 9)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"1209",year.getSelectedItem().toString()+"1210");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else if(Integer.parseInt(day.getSelectedItem().toString()) == 31)
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"1231",String.valueOf(Integer.parseInt(year.getSelectedItem().toString())+1)+"0101");
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}else
					{
						int yearSale =years.statisticsyear(year.getSelectedItem().toString()+"12"+day.getSelectedItem().toString(),year.getSelectedItem().toString()+"12"+String.valueOf(Integer.parseInt(day.getSelectedItem().toString())+1));
						mday.setText(year.getSelectedItem().toString() + "年"+month.getSelectedItem().toString() + day.getSelectedItem().toString() +"日的销售额为:"+ yearSale);
					}
				}
			}
		});
		query4.setBounds(450, 250, 60, 30);
		contPan.add(query4);
		mday.setBounds(250, 280, 200, 30);
		contPan.add(mday);
		Analysis4 = new JButton("分析");
		Analysis4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				JFrame frame=new JFrame("2017年6月 日数据统计分析图");  
			    frame.setLayout(new GridLayout(2,2,10,10));  
			    frame.add(new BarChartday(yearSaleday1,yearSaleday2,yearSaleday3,yearSaleday4,yearSaleday5,yearSaleday6,yearSaleday7,yearSaleday8,yearSaleday9,yearSaleday10,yearSaleday11,yearSaleday12,yearSaleday13,yearSaleday14,yearSaleday15,yearSaleday16,yearSaleday17,yearSaleday18,yearSaleday19,yearSaleday20,yearSaleday21,yearSaleday22,yearSaleday23,yearSaleday24,yearSaleday25,yearSaleday26,yearSaleday27,yearSaleday28,yearSaleday29,yearSaleday30).getChartPanel());          //添加柱形图 
			    frame.add(new PieChartday(yearSaleday1,yearSaleday2,yearSaleday3,yearSaleday4,yearSaleday5,yearSaleday6,yearSaleday7,yearSaleday8,yearSaleday9,yearSaleday10,yearSaleday11,yearSaleday12,yearSaleday13,yearSaleday14,yearSaleday15,yearSaleday16,yearSaleday17,yearSaleday18,yearSaleday19,yearSaleday20,yearSaleday21,yearSaleday22,yearSaleday23,yearSaleday24,yearSaleday25,yearSaleday26,yearSaleday27,yearSaleday28,yearSaleday29,yearSaleday30).getChartPanel());           //添加饼状图  
			    frame.add(new Lineday(yearSaleday1,yearSaleday2,yearSaleday3,yearSaleday4,yearSaleday5,yearSaleday6,yearSaleday7,yearSaleday8,yearSaleday9,yearSaleday10,yearSaleday11,yearSaleday12,yearSaleday13,yearSaleday14,yearSaleday15,yearSaleday16,yearSaleday17,yearSaleday18,yearSaleday19,yearSaleday20,yearSaleday21,yearSaleday22,yearSaleday23,yearSaleday24,yearSaleday25,yearSaleday26,yearSaleday27,yearSaleday28,yearSaleday29,yearSaleday30).getChartPanel());    //添加折线图  
			    frame.setBounds(50, 50, 800, 600);  
			    frame.setVisible(true);
			}
		});
		Analysis4.setBounds(450,285, 60, 30);
		contPan.add(Analysis4);
		
		lblEmpId = new JLabel("按操作员查询:");
		lblEmpId.setBounds(200,330, 80, 30);
		contPan.add(lblEmpId);
		txtEmpId = new JComboBox<Integer>();
		employeeSrv = new EmployeeSrv();
		List<Employee> listsAllEmployee = employeeSrv.FetchAll();
		Integer [] empId = new Integer[listsAllEmployee.size()];
		for(int i=0; i<listsAllEmployee.size(); i++) 
		{    
			empId[i] = listsAllEmployee.get(i).getId();
			txtEmpId.addItem(empId[i]);
		} 
		txtEmpId.setBounds(300, 330, 120, 30);
		contPan.add(txtEmpId);
		query5 = new JButton("查询");
		query5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				SaleDAO years =new SaleDAO();
				int yearSale =years.statisticsemployee(txtEmpId.getSelectedItem().toString());
				memployee.setText("售票员"+txtEmpId.getSelectedItem().toString() + "的销售额为:"+yearSale);
			}
		});
		query5.setBounds(450, 330, 60, 30);
		contPan.add(query5);
		memployee.setBounds(250, 360, 200, 30);
		contPan.add(memployee);
		Analysis5 = new JButton("分析");
		Analysis5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				JFrame frame=new JFrame("售票员数据统计分析图");  
			    frame.setLayout(new GridLayout(2,2,10,10));  
			    frame.add(new BarChartemp(yearSaleemp1,yearSaleemp2).getChartPanel());          //添加柱形图 
			    frame.add(new PieChartemp(yearSaleemp1,yearSaleemp2).getChartPanel());           //添加饼状图  
			    frame.add(new Lineemp(yearSaleemp1,yearSaleemp2).getChartPanel());    //添加折线图  
			    frame.setBounds(50, 50, 800, 600);  
			    frame.setVisible(true);
			}
		});
		Analysis5.setBounds(450,365, 60, 30);
		contPan.add(Analysis5);
		
		lblplay = new JLabel("按剧目查询:");
		lblplay.setBounds(200,410, 80, 30);
		contPan.add(lblplay);
		playSrv = new PlaySrv();
		List<Play>listsAllPlay_name = playSrv.FetchAll();
	    String [] plays = new String[listsAllPlay_name.size()];
		Play play_name;
		for(int i = 0;i < listsAllPlay_name.size(); i++){
			play_name = listsAllPlay_name.get(i);
			plays[i] = play_name.getName();
		}
		play= new JComboBox<String>(plays);
		play.setBounds(300, 410, 120, 30);
		contPan.add(play);
		query6 = new JButton("查询");
		query6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				SaleDAO years =new SaleDAO();
				int yearSale =years.statisticsplay(play.getSelectedItem().toString());
				mplay.setText("剧目"+play.getSelectedItem().toString() + "的销售额为:"+yearSale);
			}
		});
		query6.setBounds(450, 410, 60, 30);
		contPan.add(query6);
		mplay.setBounds(250, 440, 200, 30);
		contPan.add(mplay);
		Analysis6 = new JButton("分析");
		Analysis6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				JFrame frame=new JFrame("剧目数据统计分析图");  
			    frame.setLayout(new GridLayout(2,2,10,10));  
			    frame.add(new BarChartplay(yearSaleplay1,yearSaleplay2,yearSaleplay3,yearSaleplay4,yearSaleplay5).getChartPanel());          //添加柱形图 
			    frame.add(new PieChartplay(yearSaleplay1,yearSaleplay2,yearSaleplay3,yearSaleplay4,yearSaleplay5).getChartPanel());           //添加饼状图  
			    frame.add(new Lineplay(yearSaleplay1,yearSaleplay2,yearSaleplay3,yearSaleplay4,yearSaleplay5).getChartPanel());    //添加折线图  
			    frame.setBounds(50, 50, 800, 600);  
			    frame.setVisible(true);
			}
		});
		Analysis6.setBounds(450,445, 60, 30);
		contPan.add(Analysis6);
		
		lb1Total = new JLabel("总计:");
		lb1Total.setBounds(200, 470, 80, 30);
		contPan.add(lb1Total);
		lb1TotalChange = new JLabel("待刷新>>");
		lb1TotalChange.setBounds(300, 470, 80, 30);
		contPan.add(lb1TotalChange);
		query7 = new JButton("刷新");
		query7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				SaleDAO years =new SaleDAO();
				int TotalSale =years.statisticsyear("20000101","20180101");
				lb1TotalChange.setText(TotalSale+"");
			}
		});
		query7.setBounds(450, 470, 60, 30);
		contPan.add(query7);
	}
}
