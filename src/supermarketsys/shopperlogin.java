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
		
		JButton ����ѯ = new JButton("\u7C7B\u522B\u67E5\u8BE2");
		����ѯ.setFont(new Font("����", Font.PLAIN, 28));
		����ѯ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		//����ѯ.setBorder(BorderFactory.createRaisedBevelBorder());

		//����ѯ.setContentAreaFilled(false);
		JTextField ��Ʒ��Ϣ;
		JTextField ��Ʒλ��;

		����ѯ.setBounds(15, 146, 201, 122);
		frame.getContentPane().add(����ѯ);
		
		JButton ���Ʋ�ѯ = new JButton("\u540D\u79F0\u67E5\u8BE2");
		���Ʋ�ѯ.setFont(new Font("����", Font.PLAIN, 28));
		���Ʋ�ѯ.setBounds(15, 280, 201, 122);
		frame.getContentPane().add(���Ʋ�ѯ);
		
		JButton �������ѯ = new JButton("\u6761\u5F62\u7801\u67E5\u8BE2");
		�������ѯ.setFont(new Font("����", Font.PLAIN, 28));
		�������ѯ.setBounds(15, 417, 201, 122);
		frame.getContentPane().add(�������ѯ);
		
		��Ʒ��Ϣ = new JTextField();
		��Ʒ��Ϣ.setBounds(392, 161, 286, 93);
		frame.getContentPane().add(��Ʒ��Ϣ);
		��Ʒ��Ϣ.setColumns(10);
		
		JLabel ���� = new JLabel("\u8F93\u5165\u67E5\u8BE2\u5546\u54C1\u7684\u4FE1\u606F");
		����.setFont(new Font("����", Font.PLAIN, 25));
		����.setBounds(392, 101, 247, 35);
		frame.getContentPane().add(����);
		
		JLabel ��� = new JLabel("\u5546\u54C1\u7684\u4F4D\u7F6E\u4E3A");
		���.setFont(new Font("����", Font.PLAIN, 25));
		���.setBounds(392, 340, 183, 35);
		frame.getContentPane().add(���);
		
		��Ʒλ�� = new JTextField();
		��Ʒλ��.setBounds(392, 407, 286, 93);
		frame.getContentPane().add(��Ʒλ��);
		��Ʒλ��.setColumns(10);
		
		JButton ������ͼ = new JButton("\u8D85\u5E02\u603B\u56FE");
		������ͼ.setFont(new Font("����", Font.PLAIN, 28));
		������ͼ.setBounds(795, 74, 155, 62);
		frame.getContentPane().add(������ͼ);
		
		JButton viplogin = new JButton("\u4F1A\u5458\u767B\u5F55");
		//��Ա��¼
		viplogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				viplogin vip=new viplogin();
				frame.dispose();
			}
		});
		viplogin.setFont(new Font("����", Font.PLAIN, 28));
		viplogin.setBounds(795, 206, 155, 62);
		frame.getContentPane().add(viplogin);
		
//		JButton ���� = new JButton("\u8FD4\u56DE");
//		����.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				frame.dispose();
//				role_chose rc=new role_chose();
//			}
//		});
//		����.setFont(new Font("����", Font.PLAIN, 30));
//		����.setBounds(795, 564, 155, 55);
//		frame.getContentPane().add(����);
	}
}
