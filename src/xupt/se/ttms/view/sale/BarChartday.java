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
  
public class BarChartday {  
    ChartPanel frame1;  
    public  BarChartday(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17,int x18,int x19,int x20,int x21,int x22,int x23,int x24,int x25,int x26,int x27,int x28,int x29){  
        CategoryDataset dataset = getDataSet(   x0,  x1,  x2,  x3,  x4,  x5,  x6,  x7,  x8,  x9,  x10,  x11,  x12,  x13,  x14,  x15,  x16,  x17,  x18,  x19,  x20,  x21,  x22,  x23,  x24,  x25,  x26,  x27,  x28,  x29);  
        JFreeChart chart = ChartFactory.createBarChart3D(  
                             "2017年6月 统计", // 图表标题  
                            "日期", // 目录轴的显示标签  
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
    private static CategoryDataset getDataSet(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17,int x18,int x19,int x20,int x21,int x22,int x23,int x24,int x25,int x26,int x27,int x28,int x29) {  
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
        dataset.addValue(x0, "1", "1");  
        dataset.addValue(x1, "2", "2");  
        dataset.addValue(x2, "3", "3");  
        dataset.addValue(x3, "4", "4");  
        dataset.addValue(x4, "5", "5");
        dataset.addValue(x5, "6", "6");  
        dataset.addValue(x6, "7", "7");  
        dataset.addValue(x7, "8", "8");  
        dataset.addValue(x8, "9", "9");  
        dataset.addValue(x9, "10", "10");
        dataset.addValue(x10, "11", "11");  
        dataset.addValue(x11, "12", "12");  
        dataset.addValue(x12, "13", "13");  
        dataset.addValue(x13, "14", "14");  
        dataset.addValue(x14, "15", "15");
        dataset.addValue(x15, "16", "16");  
        dataset.addValue(x16, "17", "17");  
        dataset.addValue(x17, "18", "18");  
        dataset.addValue(x18, "19", "19");  
        dataset.addValue(x19, "20", "20");  
        dataset.addValue(x20, "21", "21");  
        dataset.addValue(x21, "22", "22");  
        dataset.addValue(x22, "23", "23");
        dataset.addValue(x23, "24", "24");  
        dataset.addValue(x24, "25", "25");  
        dataset.addValue(x25, "26", "26");  
        dataset.addValue(x26, "27", "27");  
        dataset.addValue(x27, "28", "28");
        dataset.addValue(x28, "29", "29");  
        dataset.addValue(x29, "30", "30");  
        return dataset;  
}
public ChartPanel getChartPanel(){  
    return frame1;  
      
}  
}