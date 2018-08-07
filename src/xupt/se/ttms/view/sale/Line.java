package xupt.se.ttms.view.sale;

import java.awt.Font;  
import java.text.SimpleDateFormat;  
  
import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset; 
  
public class Line {  
	ChartPanel frame1;
    	  public Line(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17) {
    	    StandardChartTheme mChartTheme = new StandardChartTheme("CN");
    	    mChartTheme.setLargeFont(new Font("黑体", Font.BOLD, 20));
    	    mChartTheme.setExtraLargeFont(new Font("宋体", Font.PLAIN, 15));
    	    mChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));
    	    ChartFactory.setChartTheme(mChartTheme);		
    	    CategoryDataset mDataset = GetDataset(x0,  x1,  x2,  x3,  x4,  x5,  x6,  x7,  x8,  x9,  x10,  x11,  x12,  x13,  x14,  x15,  x16,  x17);
    	    JFreeChart mChart = ChartFactory.createLineChart(
    	        "年度统计",//图名字
    	        "年份",//横坐标
    	        "销售额",//纵坐标
    	        mDataset,//数据集
    	        PlotOrientation.VERTICAL,
    	        true, // 显示图例
    	        true, // 采用标准生成器 
    	        false);// 是否生成超链接
    	    
    	    CategoryPlot mPlot = (CategoryPlot)mChart.getPlot();
    	    mPlot.setBackgroundPaint(Color.LIGHT_GRAY);
    	    mPlot.setRangeGridlinePaint(Color.BLUE);//背景底部横虚线
    	    mPlot.setOutlinePaint(Color.RED);//边界线
    	    frame1=new ChartPanel (mChart,true); 

    	  }
    	  public static CategoryDataset GetDataset(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17)
    	  {
    	    DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
    	    mDataset.addValue(x0, "First", "2000");
    	    mDataset.addValue(x1, "First", "2001");
    	    mDataset.addValue(x2, "First", "2002");
    	    mDataset.addValue(x3, "First", "2003");
    	    mDataset.addValue(x4, "First", "2004");
    	    mDataset.addValue(x5, "First", "2005");
    	    mDataset.addValue(x6, "First", "2006");
    	    mDataset.addValue(x7, "First", "2007");
    	    mDataset.addValue(x8, "First", "2008");
    	    mDataset.addValue(x9, "First", "2009");
    	    mDataset.addValue(x10, "First", "2010");
    	    mDataset.addValue(x11,"First", "2011");
    	    mDataset.addValue(x12, "First", "2012");
    	    mDataset.addValue(x13, "First", "2013");
    	    mDataset.addValue(x14, "First", "2014");
    	    mDataset.addValue(x15, "First", "2015");
    	    mDataset.addValue(x16, "First", "2016");
    	    mDataset.addValue(x17,"First", "2017");
    	    return mDataset;
    	  }
    	  public ChartPanel getChartPanel(){  
    	        return frame1;  
    	          
    	    }
} 