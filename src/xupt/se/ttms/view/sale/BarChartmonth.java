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
  
public class BarChartmonth {  
    ChartPanel frame1;  
    public  BarChartmonth(int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12){  
        CategoryDataset dataset = getDataSet(x1,  x2,  x3,  x4,  x5,  x6,  x7,  x8,  x9,  x10,  x11,  x12);  
        JFreeChart chart = ChartFactory.createBarChart3D(  
                             "2017年月份统计", // 图表标题  
                            "月份", // 目录轴的显示标签  
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
    private static CategoryDataset getDataSet(int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12) {  
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();   
        dataset.addValue(x1, "一月", "一月");  
        dataset.addValue(x2, "二月", "二月");  
        dataset.addValue(x3, "三月", "三月");  
        dataset.addValue(x4, "四月", "四月");
        dataset.addValue(x5, "五月", "五月");  
        dataset.addValue(x6, "六月", "六月");  
        dataset.addValue(x7, "七月", "七月");  
        dataset.addValue(x8, "八月", "八月");  
        dataset.addValue(x9, "九月", "九月");
        dataset.addValue(x10, "十月", "十月");  
        dataset.addValue(x11, "十一月", "十一月");  
        dataset.addValue(x12, "十二月", "十二月");  
        return dataset;  
}
public ChartPanel getChartPanel(){  
    return frame1;  
      
}  
}