package supermarketsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class suplyerlogin {

	suplyerlogin(){
		JFrame frame;
		JTextField 填写用户名;
		JLabel 密码;
		JTextField 填写密码;
		JButton 补货;
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\a53eab07e9e34fd95efa91dc72_560.jpg"));
		frame.setTitle("\u8D27\u7269\u7BA1\u7406\u5458\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 706, 544);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel 用户名 = new JLabel("\u7528\u6237\u540D");
		用户名.setHorizontalAlignment(SwingConstants.CENTER);
		用户名.setFont(new Font("宋体", Font.PLAIN, 28));
		用户名.setBounds(108, 109, 147, 65);
		frame.getContentPane().add(用户名);
		
		填写用户名 = new JTextField();
		填写用户名.setBounds(308, 126, 202, 38);
		frame.getContentPane().add(填写用户名);
		填写用户名.setColumns(10);
		
		密码 = new JLabel("\u5BC6\u7801");
		密码.setHorizontalAlignment(SwingConstants.CENTER);
		密码.setFont(new Font("宋体", Font.PLAIN, 28));
		密码.setBounds(108, 220, 147, 38);
		frame.getContentPane().add(密码);
		
		填写密码 = new JTextField();
		填写密码.setBounds(308, 229, 202, 38);
		frame.getContentPane().add(填写密码);
		填写密码.setColumns(10);
		
		补货 = new JButton("\u8865\u8D27");
		//密码正确，即可补货
		补货.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean b=false;
				String name;
				String password;
				name = 填写用户名.getText();
				password = 填写密码.getText();
				try {
					ConnectDb conn=new ConnectDb();
					b =conn.testLogin(name, password);

				} catch (Exception el) {
					el.printStackTrace();
				}
				if (b == true) {// 如果正确打开补货主窗口		
									
				goods_suply gs=new goods_suply();
				frame.setVisible(false);
			}
				else
					JOptionPane.showMessageDialog(null, "员工号或密码错误！", "警告", 0);
			}
		});
		补货.setFont(new Font("宋体", Font.PLAIN, 25));
		补货.setBounds(496, 379, 133, 57);
		frame.getContentPane().add(补货);
	}

}
