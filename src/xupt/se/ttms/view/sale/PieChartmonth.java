package xupt.se.ttms.view.sale;

import java.awt.Font;  
import java.text.DecimalFormat;  
import java.text.NumberFormat;  
  
import javax.swing.JPanel;  
  
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;  
import org.jfree.chart.plot.PiePlot;  
import org.jfree.data.general.DefaultPieDataset;  
  
public class PieChartmonth {  
    ChartPanel frame1;  
    public PieChartmonth(int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12){  
          DefaultPieDataset data = getDataSet(x1,  x2,  x3,  x4,  x5,  x6,  x7,  x8,  x9,  x10,  x11,  x12);  
          JFreeChart chart = ChartFactory.createPieChart3D("2017年月份统计",data,true,false,false);  
        //设置百分比  
          PiePlot pieplot = (PiePlot) chart.getPlot();  
          DecimalFormat df = new DecimalFormat("0.00%");//获得一个DecimalFormat对象，主要是设置小数问题  
          NumberFormat nf = NumberFormat.getNumberInstance();//获得一个NumberFormat对象  
          StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//获得StandardPieSectionLabelGenerator对象  
          pieplot.setLabelGenerator(sp1);//设置饼图显示百分比  
        
      //没有数据的时候显示的内容  
          pieplot.setNoDataMessage("无数据显示");  
          pieplot.setCircular(false);  
          pieplot.setLabelGap(0.02D);  
        
          pieplot.setIgnoreNullValues(true);//设置不显示空值  
          pieplot.setIgnoreZeroValues(true);//设置不显示负值  
         frame1=new ChartPanel (chart,true);  
          chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体  
          PiePlot piePlot= (PiePlot) chart.getPlot();//获取图表区域对象  
          piePlot.setLabelFont(new Font("宋体",Font.BOLD,10));//解决乱码  
          chart.getLegend().setItemFont(new Font("黑体",Font.BOLD,10));  
    }  
    private static DefaultPieDataset getDataSet(int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12) {  
        DefaultPieDataset dataset = new DefaultPieDataset();  
        dataset.setValue("一月",x1);  
        dataset.setValue("二月",x2);  
        dataset.setValue("三月",x3);  
        dataset.setValue("四月",x4);
        dataset.setValue("五月",x5);  
        dataset.setValue("六月",x6);  
        dataset.setValue("七月",x7);  
        dataset.setValue("八月",x8);  
        dataset.setValue("九月",x9);
        dataset.setValue("十月",x10);  
        dataset.setValue("十一月",x11);  
        dataset.setValue("十二月",x12);  
        return dataset;  
}  
    public ChartPanel getChartPanel(){  
        return frame1;  
          
    }  
}