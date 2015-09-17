package supermarketsys;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class shopperlogin {

	
     shopperlogin() {
    	JFrame frame = new JFrame();
    	frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\318757-130Q010403754.jpg"));
		frame.setTitle("\u8D27\u67B6\u67E5\u8BE2\u754C\u9762");
		frame.setBounds(100, 100, 1026, 724);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton 类别查询 = new JButton("\u7C7B\u522B\u67E5\u8BE2");
		类别查询.setFont(new Font("宋体", Font.PLAIN, 28));
		类别查询.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		//类别查询.setBorder(BorderFactory.createRaisedBevelBorder());

		//类别查询.setContentAreaFilled(false);
		JTextField 商品信息;
		JTextField 商品位置;

		类别查询.setBounds(15, 146, 201, 122);
		frame.getContentPane().add(类别查询);
		
		JButton 名称查询 = new JButton("\u540D\u79F0\u67E5\u8BE2");
		名称查询.setFont(new Font("宋体", Font.PLAIN, 28));
		名称查询.setBounds(15, 280, 201, 122);
		frame.getContentPane().add(名称查询);
		
		JButton 条形码查询 = new JButton("\u6761\u5F62\u7801\u67E5\u8BE2");
		条形码查询.setFont(new Font("宋体", Font.PLAIN, 28));
		条形码查询.setBounds(15, 417, 201, 122);
		frame.getContentPane().add(条形码查询);
		
		商品信息 = new JTextField();
		商品信息.setBounds(392, 161, 286, 93);
		frame.getContentPane().add(商品信息);
		商品信息.setColumns(10);
		
		JLabel 输入 = new JLabel("\u8F93\u5165\u67E5\u8BE2\u5546\u54C1\u7684\u4FE1\u606F");
		输入.setFont(new Font("宋体", Font.PLAIN, 25));
		输入.setBounds(392, 101, 247, 35);
		frame.getContentPane().add(输入);
		
		JLabel 输出 = new JLabel("\u5546\u54C1\u7684\u4F4D\u7F6E\u4E3A");
		输出.setFont(new Font("宋体", Font.PLAIN, 25));
		输出.setBounds(392, 340, 183, 35);
		frame.getContentPane().add(输出);
		
		商品位置 = new JTextField();
		商品位置.setBounds(392, 407, 286, 93);
		frame.getContentPane().add(商品位置);
		商品位置.setColumns(10);
		
		JButton 超市总图 = new JButton("\u8D85\u5E02\u603B\u56FE");
		超市总图.setFont(new Font("宋体", Font.PLAIN, 28));
		超市总图.setBounds(795, 74, 155, 62);
		frame.getContentPane().add(超市总图);
		
		JButton viplogin = new JButton("\u4F1A\u5458\u767B\u5F55");
		//会员登录
		viplogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				viplogin vip=new viplogin();
				frame.dispose();
			}
		});
		viplogin.setFont(new Font("宋体", Font.PLAIN, 28));
		viplogin.setBounds(795, 206, 155, 62);
		frame.getContentPane().add(viplogin);
		
//		JButton 返回 = new JButton("\u8FD4\u56DE");
//		返回.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				frame.dispose();
//				role_chose rc=new role_chose();
//			}
//		});
//		返回.setFont(new Font("宋体", Font.PLAIN, 30));
//		返回.setBounds(795, 564, 155, 55);
//		frame.getContentPane().add(返回);
	}
}
