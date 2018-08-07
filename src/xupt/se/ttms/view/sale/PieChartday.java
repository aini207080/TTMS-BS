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
  
public class PieChartday {  
    ChartPanel frame1;  
    public PieChartday(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17,int x18,int x19,int x20,int x21,int x22,int x23,int x24,int x25,int x26,int x27,int x28,int x29){  
          DefaultPieDataset data = getDataSet( x0,  x1,  x2,  x3,  x4,  x5,  x6,  x7,  x8,  x9,  x10,  x11,  x12,  x13,  x14,  x15,  x16,  x17,  x18,  x19,  x20,  x21,  x22,  x23,  x24,  x25,  x26,  x27,  x28,  x29);  
          JFreeChart chart = ChartFactory.createPieChart3D("2017年6月 日统计",data,true,false,false);  
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
    private static DefaultPieDataset getDataSet(int x0,int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int x10,int x11,int x12,int x13,int x14,int x15,int x16,int x17,int x18,int x19,int x20,int x21,int x22,int x23,int x24,int x25,int x26,int x27,int x28,int x29) {  
        DefaultPieDataset dataset = new DefaultPieDataset();  
        dataset.setValue("1",x0);  
        dataset.setValue("2",x1);  
        dataset.setValue("3",x2);  
        dataset.setValue("4",x3);  
        dataset.setValue("5",x4);
        dataset.setValue("6",x5);  
        dataset.setValue("7",x6);  
        dataset.setValue("8",x7);  
        dataset.setValue("9",x8);  
        dataset.setValue("10",x9);
        dataset.setValue("11",x10);  
        dataset.setValue("12",x11);  
        dataset.setValue("13",x12);  
        dataset.setValue("14",x13);  
        dataset.setValue("15",x14);
        dataset.setValue("16",x15);  
        dataset.setValue("17",x16);  
        dataset.setValue("18",x17);
        dataset.setValue("19",x18);
        dataset.setValue("20",x19);  
        dataset.setValue("21",x20);  
        dataset.setValue("22",x21);  
        dataset.setValue("23",x22);  
        dataset.setValue("24",x23);
        dataset.setValue("25",x24);  
        dataset.setValue("26",x25);  
        dataset.setValue("27",x26);  
        dataset.setValue("28",x27);  
        dataset.setValue("29",x28);
        dataset.setValue("30",x29);  
        return dataset;  
}  
    public ChartPanel getChartPanel(){  
        return frame1;  
          
    }  
}