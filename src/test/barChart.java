package test;

import java.awt.Color;
import java.awt.Font;

import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class barChart {
    public static void main(String[] args) {
        //��������ͼ
        makeBarChart3D();
    }
    /**
     * ��ȡ�����
     * @return
     */
    public static DefaultCategoryDataset getDataset(){
        
    	DefaultCategoryDataset  dataset = new  DefaultCategoryDataset();
        
        dataset.addValue(3.0, "", "ʫ��Э��");   
        dataset.addValue(4.0, "", "�鷨Э��");   
        dataset.addValue(5.0, "", "��ѧ��");   
        dataset.addValue(5.0, "", "IT����");   
        dataset.addValue(6.0, "", "dato����Э��");          
        return dataset;       
    }
        
    /**
     * ��������ͼ
     */
    public static void makeBarChart3D(){
        
        String title = "�������ǰ�������ͳ������ͼ";
        // ������ݼ�   
        DefaultCategoryDataset  dataset = getDataset();
        
        // ������������
        StandardChartTheme chartTheme = new StandardChartTheme("CN");
        // ����
        chartTheme.setExtraLargeFont(new Font("����", Font.BOLD, 20));
        // legend
        chartTheme.setRegularFont(new Font("����", Font.PLAIN, 12));
        // ��������
        chartTheme.setLargeFont(new Font("����", Font.PLAIN, 14));
        
        ChartFactory.setChartTheme(chartTheme);

        
        JFreeChart chart = ChartFactory.createBarChart3D(
        		 "�������ǰ�������ͳ������ͼ", // ͼ�����                       
        		 "����", // Ŀ¼�����ʾ��ǩ                       
        		 "���", // ��ֵ�����ʾ��ǩ                        
        		 dataset, // ���ݼ�                       
        		 PlotOrientation.VERTICAL, // ͼ���򣬴˴�Ϊ��ֱ����                        
        		 // PlotOrientation.HORIZONTAL, //ͼ���򣬴˴�Ϊˮƽ����                      
        		 true, // �Ƿ���ʾͼ��                       
        		 true, // �Ƿ����ɹ���                        
        		 false // �Ƿ�����URL����  
                );
        
        // ����ͼ��Ĵ���
        ChartFrame frame = new ChartFrame(title, chart, true);
        chart.setBackgroundPaint(ChartColor.WHITE); 
        // ����Ĵ�С����Ϊ����Ӧ
        frame.pack();
        // ����Ϊ�ɼ�
        frame.setVisible(true);
    }
}
