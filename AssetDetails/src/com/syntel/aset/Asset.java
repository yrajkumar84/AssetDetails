package com.syntel.aset;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.ibm.icu.impl.UCharacterName;
import com.syntel.aset.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JScrollPane;

public class Asset {

	public JFrame frame;
	static String uname=null;
	static String lname=null;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asset window = new Asset();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Workbook workbook = new HSSFWorkbook();
        
        //Create a blank sheet
        Sheet sheet = workbook.createSheet("Employee Data");
        
		 Map<String, Object[]> data = new TreeMap<String, Object[]>();
	      
	        data.put("1", new Object[] {"NAME", "LASTNAME"});
	        data.put("2", new Object[] { uname, lname});
	        System.out.println(uname);
	        data.put("3", new Object[] { uname, lname});
	
	        Set<String> keyset = data.keySet();
	        int rownum = 0;
	        for (String key : keyset)
	        {
	            Row row = sheet.createRow(rownum++);
	            Object [] objArr = data.get(key);
	            int cellnum = 0;
	            for (Object obj : objArr)
	            {
	               Cell cell = row.createCell(cellnum++);
	               if(obj instanceof String)
	                    cell.setCellValue((String)obj);
	                else if(obj instanceof Integer)
	                    cell.setCellValue((Integer)obj);
	            }
	        }
	        try
	        {
	            //Write the workbook in file system
	            FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));
	            workbook.write(out);
	            out.close();
	            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }

	}

	/**
	 * Create the application.
	 */
	public Asset() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxSpl = new JCheckBox("SPL");
		chckbxSpl.setBounds(6, 31, 43, 23);
		frame.getContentPane().add(chckbxSpl);
		
		JCheckBox chckbxSl = new JCheckBox("SL");
		chckbxSl.setBounds(6, 57, 43, 23);
		frame.getContentPane().add(chckbxSl);
		
		JCheckBox chckbxSyn = new JCheckBox("SYN");
		chckbxSyn.setBounds(6, 83, 52, 23);
		frame.getContentPane().add(chckbxSyn);
		
		JLabel lblAsset = new JLabel("Asset");
		lblAsset.setForeground(Color.DARK_GRAY);
		lblAsset.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAsset.setBounds(6, 0, 43, 23);
		frame.getContentPane().add(lblAsset);
		
		JCheckBox chckbxS = new JCheckBox("S6");
		chckbxS.setBounds(105, 31, 43, 23);
		frame.getContentPane().add(chckbxS);
		
		JCheckBox chckbxS_1 = new JCheckBox("S5");
		chckbxS_1.setBounds(105, 57, 37, 23);
		frame.getContentPane().add(chckbxS_1);
		
		JCheckBox chckbxS_2 = new JCheckBox("S4");
		chckbxS_2.setBounds(105, 83, 37, 23);
		frame.getContentPane().add(chckbxS_2);
		
		JCheckBox chckbxS_3 = new JCheckBox("S1");
		chckbxS_3.setBounds(60, 31, 43, 23);
		frame.getContentPane().add(chckbxS_3);
		
		JCheckBox chckbxS_4 = new JCheckBox("S2");
		chckbxS_4.setBounds(60, 57, 43, 23);
		frame.getContentPane().add(chckbxS_4);
		
		JCheckBox chckbxS_5 = new JCheckBox("S3");
		chckbxS_5.setBounds(60, 83, 43, 23);
		frame.getContentPane().add(chckbxS_5);
		
		JLabel lblBuilding = new JLabel("BUILDING");
		lblBuilding.setForeground(Color.DARK_GRAY);
		lblBuilding.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBuilding.setBounds(59, 0, 80, 23);
		frame.getContentPane().add(lblBuilding);
		
		JRadioButton rdbtnDell = new JRadioButton("DELL");
		rdbtnDell.setBounds(163, 57, 109, 23);
		frame.getContentPane().add(rdbtnDell);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(247, 51, 92, 34);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(393, 51, 92, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBounds(595, 31, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 381, 784, -215);
		frame.getContentPane().add(scrollPane);
	}
}
