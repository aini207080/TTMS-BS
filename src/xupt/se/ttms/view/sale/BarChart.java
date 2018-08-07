package xupt.se.ttms.view.sale;

import java.awt.Font;  

import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.axis.CategoryAxis;  
import org.jfree.chart.axis.ValueAxis;  
import org.jfree.chart.plot.CategoryPlot;  
import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset;  
  
public class BarChart {  
    ChartPanel frame1;  
    public  BarChart(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17){  
        CategoryDataset dataset = getDataSet(  x0,  x1,  x2,  x3,  x4,  x5,  x6,  x7,  x8,  x9,  x10,  x11,  x12,  x13,  x14,  x15,  x16,  x17);  
        JFreeChart chart = ChartFactory.createBarChart3D(  
                             "年度统计", // 图表标题  
                            "年份", // 目录轴的显示标签  
                            "销售额", // 数值轴的显示标签  
                            dataset, // 数据集  
                            PlotOrientation.VERTICAL, // 图表方向：水平、垂直  
                            true,           // 是否显示图例(对于简单的柱状图必须是false)  
                            false,          // 是否生成工具  
                            false           // 是否生成URL链接  
                            );  
          
        //从这里开始  
        CategoryPlot plot=chart.getCategoryPlot();//获取图表区域对象  
        CategoryAxis domainAxis=plot.getDomainAxis();         //水平底部列表  
         domainAxis.setLabelFont(new Font("黑体",Font.BOLD,14));         //水平底部标题  
         domainAxis.setTickLabelFont(new Font("宋体",Font.BOLD,12));  //垂直标题  
         ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状  
         rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,15));  
          chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));  
          chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体  
            
          //到这里结束，虽然代码有点多，但只为一个目的，解决汉字乱码问题  
            
         frame1=new ChartPanel(chart,true);        //这里也可以用chartFrame,可以直接生成一个独立的Frame  
           
    }  
    private static CategoryDataset getDataSet(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17) {  
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
        dataset.addValue(x0, "2000", "2000");  
        dataset.addValue(x1, "2001", "2001");  
        dataset.addValue(x2, "2002", "2002");  
        dataset.addValue(x3, "2003", "2003");  
        dataset.addValue(x4, "2004", "2004");
        dataset.addValue(x5, "2005", "2005");  
        dataset.addValue(x6, "2006", "2006");  
        dataset.addValue(x7, "2007", "2007");  
        dataset.addValue(x8, "2008", "2008");  
        dataset.addValue(x9, "2009", "2009");
        dataset.addValue(x10, "2010", "2010");  
        dataset.addValue(x11, "2011", "2011");  
        dataset.addValue(x12, "2012", "2012");  
        dataset.addValue(x13, "2013", "2013");  
        dataset.addValue(x14, "2014", "2014");
        dataset.addValue(x15, "2015", "2015");  
        dataset.addValue(x16, "2016", "2016");  
        dataset.addValue(x17, "2017", "2017");  
        return dataset;  
}
public ChartPanel getChartPanel(){  
    return frame1;  
      
}  
}