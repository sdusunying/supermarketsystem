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
	    JTextField ��Ա����д;
		JTextField ������д;
		JLabel ����;
		JTextField ������Ϣ;
		JLabel label;
		JLabel ����;
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\6608733_090856975000_2.jpg"));
		frame.setTitle("\u4F1A\u5458\u754C\u9762");
		frame.setBounds(100, 100, 1049, 863);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel ��Ա�� = new JLabel("\u4F1A\u5458\u53F7");
		��Ա��.setHorizontalAlignment(SwingConstants.CENTER);
		��Ա��.setFont(new Font("΢���ź�", Font.BOLD, 40));
		��Ա��.setBounds(146, 109, 153, 57);
		frame.getContentPane().add(��Ա��);
		
		JLabel ���� = new JLabel("\u5BC6\u7801");
		����.setHorizontalAlignment(SwingConstants.CENTER);
		����.setFont(new Font("΢���ź�", Font.BOLD, 40));
		����.setBounds(146, 249, 153, 64);
		frame.getContentPane().add(����);
		
		��Ա����д = new JTextField();
		��Ա����д.setFont(new Font("����", Font.PLAIN, 25));
		��Ա����д.setBackground(new Color(255, 228, 225));
		��Ա����д.setBounds(348, 118, 229, 57);
		frame.getContentPane().add(��Ա����д);
		��Ա����д.setColumns(10);
		
		������д = new JTextField();
		������д.setFont(new Font("����", Font.PLAIN, 25));
		������д.setBackground(new Color(255, 228, 225));
		������д.setBounds(348, 259, 229, 64);
		frame.getContentPane().add(������д);
		������д.setColumns(10);
		
		���� = new JLabel("\u60A8\u7684\u79EF\u5206\u6709");
		����.setFont(new Font("����", Font.BOLD, 30));
		����.setBounds(540, 438, 183, 57);
		frame.getContentPane().add(����);
		
		������Ϣ = new JTextField();
		������Ϣ.setFont(new Font("����", Font.PLAIN, 25));
		������Ϣ.setBounds(749, 452, 96, 38);
		frame.getContentPane().add(������Ϣ);
		������Ϣ.setColumns(10);
		
		���� = new JLabel("\u5728\u6B64\u8F93\u5165\u60A8\u7684\u5EFA\u8BAE");
		����.setFont(new Font("����", Font.PLAIN, 30));
		����.setBounds(64, 544, 279, 64);
		frame.getContentPane().add(����);
		
		JTextArea ������ = new JTextArea();
		������.setBounds(74, 623, 771, 57);
		frame.getContentPane().add(������);
		
		JButton ȷ�� = new JButton("\u786E\u5B9A");
		//��Ա��������ȷ�󼴿ɲ鿴����
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//boolean b=false;
				String vipnumber;
				vipnumber= ��Ա����д.getText();
				String password;
				password= ������д.getText();
				int score = 0;
				try {
					ConnectDb conn=new ConnectDb();
					score =conn.getScore(vipnumber, password);
				} catch (Exception el) {
					el.printStackTrace();
				}
				String scores=score+"";				
					������Ϣ.setText(scores);
					
				
				//if(b==false)
//					JOptionPane.showMessageDialog(null, "�û������������", "����", 0);
			}
				
				
				
				
				
			
		});
		ȷ��.setFont(new Font("����", Font.PLAIN, 24));
		ȷ��.setBounds(146, 438, 123, 57);
		frame.getContentPane().add(ȷ��);
		
		JButton �ύ = new JButton("\u63D0\u4EA4");
		�ύ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
				
				
				
				
				
			}
		});
		�ύ.setFont(new Font("����", Font.PLAIN, 25));
		�ύ.setBounds(64, 714, 123, 46);
		frame.getContentPane().add(�ύ);
		
		JButton ���� = new JButton("\u8FD4\u56DE");
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new shopperlogin();
			}
		});
		����.setFont(new Font("����", Font.PLAIN, 24));
		����.setBounds(876, 714, 123, 46);
		frame.getContentPane().add(����);
		
	
	}
}
