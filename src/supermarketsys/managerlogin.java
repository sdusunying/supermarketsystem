package supermarketsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class managerlogin {

	 managerlogin() {
		JFrame frame;
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 770, 621);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel 员工号 = new JLabel("\u5458\u5DE5\u53F7");
		员工号.setFont(new Font("宋体", Font.PLAIN, 30));
		员工号.setHorizontalAlignment(SwingConstants.CENTER);
		员工号.setBounds(141, 96, 148, 55);
		frame.getContentPane().add(员工号);
		
		JLabel 密码 = new JLabel("\u5BC6\u7801");
		密码.setHorizontalAlignment(SwingConstants.CENTER);
		密码.setFont(new Font("宋体", Font.PLAIN, 30));
		密码.setBounds(141, 217, 148, 55);
		frame.getContentPane().add(密码);
		
		JTextField 员工号填写;
		JTextField 密码填写;
		员工号填写 = new JTextField();
		员工号填写.setBounds(347, 109, 232, 37);
		frame.getContentPane().add(员工号填写);
		员工号填写.setColumns(10);
		
		密码填写 = new JTextField();
		密码填写.setColumns(10);
		密码填写.setBounds(347, 230, 232, 37);
		frame.getContentPane().add(密码填写);
		
		JButton 修改货物 = new JButton("\u4FEE\u6539\u8D27\u7269\u4FE1\u606F");
		修改货物.setFont(new Font("宋体", Font.PLAIN, 28));
		修改货物.setBounds(113, 352, 213, 55);
		frame.getContentPane().add(修改货物);
		
		JButton 修改员工 = new JButton("\u4FEE\u6539\u5458\u5DE5\u4FE1\u606F");
		修改员工.setFont(new Font("宋体", Font.PLAIN, 28));
		修改员工.setBounds(113, 459, 213, 55);
		frame.getContentPane().add(修改员工);
		
		JButton 查看反馈 = new JButton("\u67E5\u770B\u4F1A\u5458\u53CD\u9988");
		查看反馈.setFont(new Font("宋体", Font.PLAIN, 28));
		查看反馈.setBounds(427, 352, 213, 55);
		frame.getContentPane().add(查看反馈);
		
		JButton 查看金额 = new JButton("\u67E5\u770B\u9500\u552E\u91D1\u989D");
		查看金额.setFont(new Font("宋体", Font.PLAIN, 28));
		查看金额.setBounds(427, 459, 213, 55);
		frame.getContentPane().add(查看金额);
	}

}
