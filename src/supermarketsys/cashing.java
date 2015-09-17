package supermarketsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cashing {
	private JTextField 会员号填写;
	private JTextField 总金额填写;
	private JTextField 商品金额填写;
	private JTextField 名称填写;

	
	cashing(){
		JFrame frame;
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 745, 578);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel 会员号 = new JLabel("\u4F1A\u5458\u53F7");
		会员号.setFont(new Font("宋体", Font.PLAIN, 24));
		会员号.setHorizontalAlignment(SwingConstants.CENTER);
		会员号.setBounds(51, 77, 115, 35);
		frame.getContentPane().add(会员号);
		
		会员号填写 = new JTextField();
		会员号填写.setBounds(181, 77, 222, 35);
		frame.getContentPane().add(会员号填写);
		会员号填写.setColumns(10);
		
		
		JLabel 名称 = new JLabel("\u540D\u79F0");
		名称.setHorizontalAlignment(SwingConstants.CENTER);
		名称.setFont(new Font("宋体", Font.PLAIN, 24));
		名称.setBounds(51, 285, 115, 35);
		frame.getContentPane().add(名称);
		
		名称填写 = new JTextField();
		名称填写.setBounds(181, 285, 222, 35);
		frame.getContentPane().add(名称填写);
		名称填写.setColumns(10);
		
		JLabel 商品金额 = new JLabel("\u91D1\u989D");
		商品金额.setHorizontalAlignment(SwingConstants.CENTER);
		商品金额.setFont(new Font("宋体", Font.PLAIN, 24));
		商品金额.setBounds(51, 361, 115, 52);
		frame.getContentPane().add(商品金额);
		
		商品金额填写 = new JTextField();
		商品金额填写.setBounds(181, 375, 115, 43);
		frame.getContentPane().add(商品金额填写);
		商品金额填写.setColumns(10);
		
		JLabel 总金额 = new JLabel("\u603B\u91D1\u989D");
		总金额.setFont(new Font("宋体", Font.PLAIN, 22));
		总金额.setHorizontalAlignment(SwingConstants.CENTER);
		总金额.setBounds(424, 378, 95, 35);
		frame.getContentPane().add(总金额);
		
		总金额填写 = new JTextField();
		总金额填写.setFont(new Font("宋体", Font.PLAIN, 22));
		总金额填写.setBounds(519, 378, 96, 35);
		frame.getContentPane().add(总金额填写);
		总金额填写.setColumns(10);		
				
		JLabel 条形码 = new JLabel("\u6761\u5F62\u7801");
		条形码.setHorizontalAlignment(SwingConstants.CENTER);
		条形码.setFont(new Font("宋体", Font.PLAIN, 24));
		条形码.setBounds(51, 180, 115, 35);
		frame.getContentPane().add(条形码);
		
		JTextField 条形码填写;
		条形码填写 = new JTextField();
		//输入条形码，回车，显示金额，名称，条形码自动消失
		条形码填写.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code=条形码填写.getText();
				String Money=null;
				String Name=null;
				try {
					ConnectDb conn1=new ConnectDb();
					Money =conn1.getMoney(code);
					ConnectDb conn2=new ConnectDb();
					Name=conn1.getName(code);
				} catch (Exception el) {
					el.printStackTrace();
				}
				名称填写.setText(Name);
				商品金额填写.setText(Money);
				/*String total_Money="0";
				total_Money = (Integer.parseInt(total_Money)+Integer.parseInt(Money_Name[1]))+"";
				总金额填写.setText(total_Money);*/
				条形码填写.setText("");
			}
		});
		条形码填写.setBounds(181, 182, 222, 35);
		frame.getContentPane().add(条形码填写);
		条形码填写.setColumns(10);
		
		
		
		JButton 支付按钮 = new JButton("\u652F\u4ED8");
		//支付后全部自动清空，金额输入到数据库中
		支付按钮.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				会员号填写.setText("");
				商品金额填写.setText("");
				总金额填写.setText("");
				名称填写.setText("");
//				
//				
//				
			}
		});
		
		
		支付按钮.setFont(new Font("宋体", Font.PLAIN, 22));
		支付按钮.setBounds(613, 449, 95, 52);
		frame.getContentPane().add(支付按钮);
		
		
	}
}
