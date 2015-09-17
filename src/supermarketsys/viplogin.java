package supermarketsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.Toolkit;

import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viplogin {

	   viplogin() {
		JFrame frame;
	    JTextField 会员号填写;
		JTextField 密码填写;
		JLabel 积分;
		JTextField 积分信息;
		JLabel label;
		JLabel 建议;
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\6608733_090856975000_2.jpg"));
		frame.setTitle("\u4F1A\u5458\u754C\u9762");
		frame.setBounds(100, 100, 1049, 863);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel 会员号 = new JLabel("\u4F1A\u5458\u53F7");
		会员号.setHorizontalAlignment(SwingConstants.CENTER);
		会员号.setFont(new Font("微软雅黑", Font.BOLD, 40));
		会员号.setBounds(146, 109, 153, 57);
		frame.getContentPane().add(会员号);
		
		JLabel 密码 = new JLabel("\u5BC6\u7801");
		密码.setHorizontalAlignment(SwingConstants.CENTER);
		密码.setFont(new Font("微软雅黑", Font.BOLD, 40));
		密码.setBounds(146, 249, 153, 64);
		frame.getContentPane().add(密码);
		
		会员号填写 = new JTextField();
		会员号填写.setFont(new Font("宋体", Font.PLAIN, 25));
		会员号填写.setBackground(new Color(255, 228, 225));
		会员号填写.setBounds(348, 118, 229, 57);
		frame.getContentPane().add(会员号填写);
		会员号填写.setColumns(10);
		
		密码填写 = new JTextField();
		密码填写.setFont(new Font("宋体", Font.PLAIN, 25));
		密码填写.setBackground(new Color(255, 228, 225));
		密码填写.setBounds(348, 259, 229, 64);
		frame.getContentPane().add(密码填写);
		密码填写.setColumns(10);
		
		积分 = new JLabel("\u60A8\u7684\u79EF\u5206\u6709");
		积分.setFont(new Font("楷体", Font.BOLD, 30));
		积分.setBounds(540, 438, 183, 57);
		frame.getContentPane().add(积分);
		
		积分信息 = new JTextField();
		积分信息.setFont(new Font("宋体", Font.PLAIN, 25));
		积分信息.setBounds(749, 452, 96, 38);
		frame.getContentPane().add(积分信息);
		积分信息.setColumns(10);
		
		建议 = new JLabel("\u5728\u6B64\u8F93\u5165\u60A8\u7684\u5EFA\u8BAE");
		建议.setFont(new Font("楷体", Font.PLAIN, 30));
		建议.setBounds(64, 544, 279, 64);
		frame.getContentPane().add(建议);
		
		JTextArea 建议区 = new JTextArea();
		建议区.setBounds(74, 623, 771, 57);
		frame.getContentPane().add(建议区);
		
		JButton 确定 = new JButton("\u786E\u5B9A");
		//会员号密码正确后即可查看分数
		确定.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//boolean b=false;
				String vipnumber;
				vipnumber= 会员号填写.getText();
				String password;
				password= 密码填写.getText();
				int score = 0;
				try {
					ConnectDb conn=new ConnectDb();
					score =conn.getScore(vipnumber, password);
				} catch (Exception el) {
					el.printStackTrace();
				}
				String scores=score+"";				
					积分信息.setText(scores);
					
				
				//if(b==false)
//					JOptionPane.showMessageDialog(null, "用户名或密码错误！", "警告", 0);
			}
				
				
				
				
				
			
		});
		确定.setFont(new Font("宋体", Font.PLAIN, 24));
		确定.setBounds(146, 438, 123, 57);
		frame.getContentPane().add(确定);
		
		JButton 提交 = new JButton("\u63D0\u4EA4");
		提交.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
				
				
				
				
				
			}
		});
		提交.setFont(new Font("宋体", Font.PLAIN, 25));
		提交.setBounds(64, 714, 123, 46);
		frame.getContentPane().add(提交);
		
		JButton 返回 = new JButton("\u8FD4\u56DE");
		返回.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new shopperlogin();
			}
		});
		返回.setFont(new Font("宋体", Font.PLAIN, 24));
		返回.setBounds(876, 714, 123, 46);
		frame.getContentPane().add(返回);
		
	
	}
}
