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
		
		JLabel Ա���� = new JLabel("\u5458\u5DE5\u53F7");
		Ա����.setFont(new Font("����", Font.PLAIN, 30));
		Ա����.setHorizontalAlignment(SwingConstants.CENTER);
		Ա����.setBounds(141, 96, 148, 55);
		frame.getContentPane().add(Ա����);
		
		JLabel ���� = new JLabel("\u5BC6\u7801");
		����.setHorizontalAlignment(SwingConstants.CENTER);
		����.setFont(new Font("����", Font.PLAIN, 30));
		����.setBounds(141, 217, 148, 55);
		frame.getContentPane().add(����);
		
		JTextField Ա������д;
		JTextField ������д;
		Ա������д = new JTextField();
		Ա������д.setBounds(347, 109, 232, 37);
		frame.getContentPane().add(Ա������д);
		Ա������д.setColumns(10);
		
		������д = new JTextField();
		������д.setColumns(10);
		������д.setBounds(347, 230, 232, 37);
		frame.getContentPane().add(������д);
		
		JButton �޸Ļ��� = new JButton("\u4FEE\u6539\u8D27\u7269\u4FE1\u606F");
		�޸Ļ���.setFont(new Font("����", Font.PLAIN, 28));
		�޸Ļ���.setBounds(113, 352, 213, 55);
		frame.getContentPane().add(�޸Ļ���);
		
		JButton �޸�Ա�� = new JButton("\u4FEE\u6539\u5458\u5DE5\u4FE1\u606F");
		�޸�Ա��.setFont(new Font("����", Font.PLAIN, 28));
		�޸�Ա��.setBounds(113, 459, 213, 55);
		frame.getContentPane().add(�޸�Ա��);
		
		JButton �鿴���� = new JButton("\u67E5\u770B\u4F1A\u5458\u53CD\u9988");
		�鿴����.setFont(new Font("����", Font.PLAIN, 28));
		�鿴����.setBounds(427, 352, 213, 55);
		frame.getContentPane().add(�鿴����);
		
		JButton �鿴��� = new JButton("\u67E5\u770B\u9500\u552E\u91D1\u989D");
		�鿴���.setFont(new Font("����", Font.PLAIN, 28));
		�鿴���.setBounds(427, 459, 213, 55);
		frame.getContentPane().add(�鿴���);
	}

}
