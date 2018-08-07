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
  
public class PieChartplay {  
    ChartPanel frame1;  
    public PieChartplay(int x0,int x1,int x2,int x3,int x4){  
          DefaultPieDataset data = getDataSet( x0,  x1,x2,x3,x4);  
          JFreeChart chart = ChartFactory.createPieChart3D("剧目销售统计",data,true,false,false);  
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
    private static DefaultPieDataset getDataSet(int x0,int x1,int x2,int x3,int x4) {  
        DefaultPieDataset dataset = new DefaultPieDataset();  
        dataset.setValue("神奇女侠",x0);  
        dataset.setValue("加勒比海盗5：死无对证",x1); 
        dataset.setValue("哆啦A梦：大雄的南极冰冰凉大冒险",x2);  
        dataset.setValue("摔跤吧！爸爸",x3);
        dataset.setValue("美好的意外",x4);  
        return dataset;  
}  
    public ChartPanel getChartPanel(){  
        return frame1;  
          
    }  
}