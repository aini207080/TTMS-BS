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
  
public class Lineday {  
	ChartPanel frame1;
    	  public Lineday(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17,int x18,int x19,int x20,int x21,int x22,int x23,int x24,int x25,int x26,int x27,int x28,int x29) {
    	    StandardChartTheme mChartTheme = new StandardChartTheme("CN");
    	    mChartTheme.setLargeFont(new Font("黑体", Font.BOLD, 20));
    	    mChartTheme.setExtraLargeFont(new Font("宋体", Font.PLAIN, 15));
    	    mChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));
    	    ChartFactory.setChartTheme(mChartTheme);		
    	    CategoryDataset mDataset = GetDataset(x0,  x1,  x2,  x3,  x4,  x5,  x6,  x7,  x8,  x9,  x10,  x11,  x12,  x13,  x14,  x15,  x16,  x17,  x18,  x19,  x20,  x21,  x22,  x23,  x24,  x25,  x26,  x27,  x28,  x29);
    	    JFreeChart mChart = ChartFactory.createLineChart(
    	        "2017年6月 日统计",//图名字
    	        "日期",//横坐标
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
    	  public static CategoryDataset GetDataset(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17,int x18,int x19,int x20,int x21,int x22,int x23,int x24,int x25,int x26,int x27,int x28,int x29)
    	  {
    	    DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
    	    mDataset.addValue(x0, "First", "1");  
            mDataset.addValue(x1, "First", "2");  
            mDataset.addValue(x2, "First", "3");  
            mDataset.addValue(x3, "First", "4");  
            mDataset.addValue(x4, "First", "5");
            mDataset.addValue(x5, "First", "6");  
            mDataset.addValue(x6, "First", "7");  
            mDataset.addValue(x7, "First", "8");  
            mDataset.addValue(x8, "First", "9");  
            mDataset.addValue(x9, "First", "10");
            mDataset.addValue(x10, "First", "11");  
            mDataset.addValue(x11, "First", "12");  
            mDataset.addValue(x12, "First", "13");  
            mDataset.addValue(x13, "First", "14");  
            mDataset.addValue(x14, "First", "15");
            mDataset.addValue(x15, "First", "16");  
            mDataset.addValue(x16, "First", "17");  
            mDataset.addValue(x17, "First", "18");  
            mDataset.addValue(x18, "First", "19");  
            mDataset.addValue(x19, "First", "20");  
            mDataset.addValue(x20, "First", "21");  
            mDataset.addValue(x21, "First", "22");  
            mDataset.addValue(x22, "First", "23");
            mDataset.addValue(x23, "First", "24");  
            mDataset.addValue(x24, "First", "25");  
            mDataset.addValue(x25, "First", "26");  
            mDataset.addValue(x26, "First", "27");  
            mDataset.addValue(x27, "First", "28");
            mDataset.addValue(x28, "First", "29");  
            mDataset.addValue(x29, "First", "30");
    	    return mDataset;
    	  }
    	  public ChartPanel getChartPanel(){  
    	        return frame1;  
    	          
    	    }
} 