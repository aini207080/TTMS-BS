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
  
public class Lineemp {  
	ChartPanel frame1;
    	  public Lineemp(int x0,int x1) {
    	    StandardChartTheme mChartTheme = new StandardChartTheme("CN");
    	    mChartTheme.setLargeFont(new Font("黑体", Font.BOLD, 20));
    	    mChartTheme.setExtraLargeFont(new Font("宋体", Font.PLAIN, 15));
    	    mChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));
    	    ChartFactory.setChartTheme(mChartTheme);		
    	    CategoryDataset mDataset = GetDataset(x0,  x1);
    	    JFreeChart mChart = ChartFactory.createLineChart(
    	        "人员销售统计",//图名字
    	        "售票员",//横坐标
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
    	  public static CategoryDataset GetDataset(int x0,int x1)
    	  {
    	    DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
    	    mDataset.addValue(x0, "First", "张三");
    	    mDataset.addValue(x1, "First", "李四");
    	    return mDataset;
    	  }
    	  public ChartPanel getChartPanel(){  
    	        return frame1;  
    	          
    	    }
} 