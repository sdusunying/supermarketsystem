package supermarketsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class casherlogin {

	  casherlogin(){
		JFrame frame;
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("\u6536\u94F6\u5458\u767B\u9646");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\12150545.jpg"));
		frame.setBounds(100, 100, 713, 503);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextField 员工号填写;
		JTextField 密码填写;
		JLabel 员工号 = new JLabel("\u5458\u5DE5\u53F7");
		员工号.setFont(new Font("宋体", Font.PLAIN, 30));
		员工号.setHorizontalAlignment(SwingConstants.CENTER);
		员工号.setBounds(138, 77, 133, 56);
		frame.getContentPane().add(员工号);
		
		JLabel 密码 = new JLabel("\u5BC6\u7801");
		密码.setHorizontalAlignment(SwingConstants.CENTER);
		密码.setFont(new Font("宋体", Font.PLAIN, 30));
		密码.setBounds(138, 185, 133, 56);
		frame.getContentPane().add(密码);
		
		员工号填写 = new JTextField();
		员工号填写.setBounds(317, 87, 228, 46);
		frame.getContentPane().add(员工号填写);
		员工号填写.setColumns(10);
		
		密码填写 = new JTextField();
		密码填写.setColumns(10);
		密码填写.setBounds(317, 195, 228, 46);
		frame.getContentPane().add(密码填写);
		
		JButton 收银 = new JButton("\u5F00\u59CB\u6536\u94F6");
		//密码正确，可以收银
		收银.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean b=false;
				String name;
				String password;
				name = 员工号填写.getText();
				password = 密码填写.getText();
				try {
					ConnectDb conn=new ConnectDb();
					b =conn.testLogin(name, password);

				} catch (Exception el) {
					el.printStackTrace();
				}
				if (b == true) {// 如果正确打开补货主窗口		
									
					cashing ching=new cashing();
					frame.setVisible(false);
			}
				else
					JOptionPane.showMessageDialog(null, "员工号或密码错误！", "警告", 0);
			}			
				
		});
		收银.setFont(new Font("宋体", Font.PLAIN, 28));
		收银.setBounds(461, 335, 171, 56);
		frame.getContentPane().add(收银);
	}

}
