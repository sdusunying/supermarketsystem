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
		JTextField ��д�û���;
		JLabel ����;
		JTextField ��д����;
		JButton ����;
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\a53eab07e9e34fd95efa91dc72_560.jpg"));
		frame.setTitle("\u8D27\u7269\u7BA1\u7406\u5458\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 706, 544);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel �û��� = new JLabel("\u7528\u6237\u540D");
		�û���.setHorizontalAlignment(SwingConstants.CENTER);
		�û���.setFont(new Font("����", Font.PLAIN, 28));
		�û���.setBounds(108, 109, 147, 65);
		frame.getContentPane().add(�û���);
		
		��д�û��� = new JTextField();
		��д�û���.setBounds(308, 126, 202, 38);
		frame.getContentPane().add(��д�û���);
		��д�û���.setColumns(10);
		
		���� = new JLabel("\u5BC6\u7801");
		����.setHorizontalAlignment(SwingConstants.CENTER);
		����.setFont(new Font("����", Font.PLAIN, 28));
		����.setBounds(108, 220, 147, 38);
		frame.getContentPane().add(����);
		
		��д���� = new JTextField();
		��д����.setBounds(308, 229, 202, 38);
		frame.getContentPane().add(��д����);
		��д����.setColumns(10);
		
		���� = new JButton("\u8865\u8D27");
		//������ȷ�����ɲ���
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean b=false;
				String name;
				String password;
				name = ��д�û���.getText();
				password = ��д����.getText();
				try {
					ConnectDb conn=new ConnectDb();
					b =conn.testLogin(name, password);

				} catch (Exception el) {
					el.printStackTrace();
				}
				if (b == true) {// �����ȷ�򿪲���������		
									
				goods_suply gs=new goods_suply();
				frame.setVisible(false);
			}
				else
					JOptionPane.showMessageDialog(null, "Ա���Ż��������", "����", 0);
			}
		});
		����.setFont(new Font("����", Font.PLAIN, 25));
		����.setBounds(496, 379, 133, 57);
		frame.getContentPane().add(����);
	}

}
