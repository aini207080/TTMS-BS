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
  
public class Linemonth {  
	ChartPanel frame1;
    	  public Linemonth(int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12) {
    	    StandardChartTheme mChartTheme = new StandardChartTheme("CN");
    	    mChartTheme.setLargeFont(new Font("黑体", Font.BOLD, 20));
    	    mChartTheme.setExtraLargeFont(new Font("宋体", Font.PLAIN, 15));
    	    mChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));
    	    ChartFactory.setChartTheme(mChartTheme);		
    	    CategoryDataset mDataset = GetDataset(x1,  x2,  x3,  x4,  x5,  x6,  x7,  x8,  x9,  x10,  x11,  x12);
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
    	  public static CategoryDataset GetDataset(int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12)
    	  {
    	    DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
    	    mDataset.addValue(x1, "First", "一月");
    	    mDataset.addValue(x2, "First", "二月");
    	    mDataset.addValue(x3, "First", "三月");
    	    mDataset.addValue(x4, "First", "四月");
    	    mDataset.addValue(x5, "First", "五月");
    	    mDataset.addValue(x6, "First", "六月");
    	    mDataset.addValue(x7, "First", "七月");
    	    mDataset.addValue(x8, "First", "八月");
    	    mDataset.addValue(x9, "First", "九月");
    	    mDataset.addValue(x10,"First", "十月");
    	    mDataset.addValue(x11,"First", "十一月");
    	    mDataset.addValue(x12,"First", "十二月");
    	    return mDataset;
    	  }
    	  public ChartPanel getChartPanel(){  
    	        return frame1;  
    	          
    	    }
} 