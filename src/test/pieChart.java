package test;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.data.general.DefaultPieDataset;

	/**
	 * ��������ͼ
	 *
	 */
	public class pieChart {
	    
	    public static void main(String[] args) {
	        //��������ͼ
	        makePieChart3D();
	    }
	    /**
	     * ��ȡ�����
	     * @return
	     */
	    public static DefaultPieDataset getDataset(){
	        
	        DefaultPieDataset dataset = new DefaultPieDataset();
	        
	        dataset.setValue("���ͻ�Э��", 20);
	        dataset.setValue("����Э��", 20);
	        dataset.setValue("����Э��", 20);
	        dataset.setValue("�鷨Э��", 20);
	        dataset.setValue("��ѧ��", 20);
	        
	        return dataset;
	        
	    }    
	    
	    /**
	     * ��������ͼ
	     */
	    public static void makePieChart3D(){
	        
	        String title = "������������ǰ�������ͳ��ͼ";
	        // ������ݼ�   
	        DefaultPieDataset dataset = getDataset();
	        
	        // ������������
	        StandardChartTheme chartTheme = new StandardChartTheme("CN");
	        // ����
	        chartTheme.setExtraLargeFont(new Font("����", Font.BOLD, 20));
	        // legend
	        chartTheme.setRegularFont(new Font("����", Font.PLAIN, 18));
	        // ��������
	        chartTheme.setLargeFont(new Font("����", Font.PLAIN, 16));
	        ChartFactory.setChartTheme(chartTheme);
	        
	        JFreeChart chart = ChartFactory.createPieChart3D(
	                title, //����
	                dataset,     // ͼ�����ݼ�   
	                true,         // �Ƿ���ʾͼ��   
	                false,         // �Ƿ����ɹ��ߣ���ʾ��   
	                false         // �Ƿ�����URL����  
	                );
	        
	        // ����ͼ��Ĵ���
	        ChartFrame frame = new ChartFrame(title, chart, true);
	        // ����Ĵ�С����Ϊ����Ӧ
	        frame.pack();
	        // ����Ϊ�ɼ�
	        frame.setVisible(true);
	    }
	}