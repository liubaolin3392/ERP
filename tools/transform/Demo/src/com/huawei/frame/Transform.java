package com.huawei.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.theme.SubstanceTerracottaTheme;

public class Transform extends JFrame {

	private JPanel contentPane;
	private static JFrame f  = new JFrame();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {  
            UIManager.setLookAndFeel(new SubstanceLookAndFeel());  
            JFrame.setDefaultLookAndFeelDecorated(true);  
            JDialog.setDefaultLookAndFeelDecorated(true);  
            SubstanceLookAndFeel.setCurrentTheme(new SubstanceTerracottaTheme());
        } catch (Exception e) {  
            System.err.println("Something went wrong!");  
        }  
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transform frame = new Transform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transform() {
		setTitle("\u4E8C\u8FDB\u5236\u6587\u4EF6\u8F6C\u6362");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("\u4E0A\u4F20\u4E8C\u8FDB\u5236\u6570\u636E\u6587\u4EF6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
			     if(jfc.showOpenDialog(f)==JFileChooser.APPROVE_OPTION ){
			    	 File file = jfc.getSelectedFile();
			    	 String content = Transform.txt2String(file);
			    	 System.out.println(content);
			    	 textArea.setText(Transform.binaryToString(content));
			     }
			}
		});
		panel.add(btnNewButton);
		
		JButton button = new JButton("\u4E0A\u4F20\u5F85\u8F6C\u6362\u4E3A\u4E8C\u8FDB\u5236\u6570\u636E\u7684\u6587\u4EF6");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
			     if(jfc.showOpenDialog(f)==JFileChooser.APPROVE_OPTION ){
			    	 File file = jfc.getSelectedFile();
			    	 String content = Transform.txt2String(file);
			    	 System.out.println(content);
			    	 textArea.setText(Transform.stringToBinary(content));
			     }
			}
		});
		panel.add(button);
		
		
	}
	/**
     * 读取txt文件的内容
     * @param file 想要读取的文件对象
     * @return 返回文件内容
     */
    public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
    
    public static String binaryToString(String binary){
    	
    	String[] contents = binary.split(" ");
    	char[] results = new char[contents.length];
    	for (int i = 0; i < contents.length; i++) {
    		results[i] =  (char) Integer.parseInt(contents[i].trim(), 2);   
		}
    	String content = new String(results);
    	return content;
    }
    public static String stringToBinary(String binary){
    	
    	char[] aa = binary.toCharArray();
    	StringBuffer content = new StringBuffer();
    	for (int i = 0; i < aa.length; i++) {
    		content.append(Integer.toBinaryString(aa[i])).append(" ");
		}
    	return content.toString();
    }
}
