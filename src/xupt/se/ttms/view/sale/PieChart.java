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
  
public class PieChart {  
    ChartPanel frame1;  
    public PieChart(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17){  
          DefaultPieDataset data = getDataSet( x0,  x1,  x2,  x3,  x4,  x5,  x6,  x7,  x8,  x9,  x10,  x11,  x12,  x13,  x14,  x15,  x16,  x17);  
          JFreeChart chart = ChartFactory.createPieChart3D("年度统计",data,true,false,false);  
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
    private static DefaultPieDataset getDataSet(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17) {  
        DefaultPieDataset dataset = new DefaultPieDataset();  
        dataset.setValue("2000",x0);  
        dataset.setValue("2001",x1);  
        dataset.setValue("2002",x2);  
        dataset.setValue("2003",x3);  
        dataset.setValue("2004",x4);
        dataset.setValue("2005",x5);  
        dataset.setValue("2006",x6);  
        dataset.setValue("2007",x7);  
        dataset.setValue("2008",x8);  
        dataset.setValue("2009",x9);
        dataset.setValue("2010",x10);  
        dataset.setValue("2011",x11);  
        dataset.setValue("2012",x12);  
        dataset.setValue("2013",x13);  
        dataset.setValue("2014",x14);
        dataset.setValue("2015",x15);  
        dataset.setValue("2016",x16);  
        dataset.setValue("2017",x17);
        return dataset;  
}  
    public ChartPanel getChartPanel(){  
        return frame1;  
          
    }  
}