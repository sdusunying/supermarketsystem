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
		
		JTextField Ա������д;
		JTextField ������д;
		JLabel Ա���� = new JLabel("\u5458\u5DE5\u53F7");
		Ա����.setFont(new Font("����", Font.PLAIN, 30));
		Ա����.setHorizontalAlignment(SwingConstants.CENTER);
		Ա����.setBounds(138, 77, 133, 56);
		frame.getContentPane().add(Ա����);
		
		JLabel ���� = new JLabel("\u5BC6\u7801");
		����.setHorizontalAlignment(SwingConstants.CENTER);
		����.setFont(new Font("����", Font.PLAIN, 30));
		����.setBounds(138, 185, 133, 56);
		frame.getContentPane().add(����);
		
		Ա������д = new JTextField();
		Ա������д.setBounds(317, 87, 228, 46);
		frame.getContentPane().add(Ա������д);
		Ա������д.setColumns(10);
		
		������д = new JTextField();
		������д.setColumns(10);
		������д.setBounds(317, 195, 228, 46);
		frame.getContentPane().add(������д);
		
		JButton ���� = new JButton("\u5F00\u59CB\u6536\u94F6");
		//������ȷ����������
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean b=false;
				String name;
				String password;
				name = Ա������д.getText();
				password = ������д.getText();
				try {
					ConnectDb conn=new ConnectDb();
					b =conn.testLogin(name, password);

				} catch (Exception el) {
					el.printStackTrace();
				}
				if (b == true) {// �����ȷ�򿪲���������		
									
					cashing ching=new cashing();
					frame.setVisible(false);
			}
				else
					JOptionPane.showMessageDialog(null, "Ա���Ż��������", "����", 0);
			}			
				
		});
		����.setFont(new Font("����", Font.PLAIN, 28));
		����.setBounds(461, 335, 171, 56);
		frame.getContentPane().add(����);
	}

}
