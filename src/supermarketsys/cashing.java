package supermarketsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cashing {
	private JTextField ��Ա����д;
	private JTextField �ܽ����д;
	private JTextField ��Ʒ�����д;
	private JTextField ������д;

	
	cashing(){
		JFrame frame;
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 745, 578);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel ��Ա�� = new JLabel("\u4F1A\u5458\u53F7");
		��Ա��.setFont(new Font("����", Font.PLAIN, 24));
		��Ա��.setHorizontalAlignment(SwingConstants.CENTER);
		��Ա��.setBounds(51, 77, 115, 35);
		frame.getContentPane().add(��Ա��);
		
		��Ա����д = new JTextField();
		��Ա����д.setBounds(181, 77, 222, 35);
		frame.getContentPane().add(��Ա����д);
		��Ա����д.setColumns(10);
		
		
		JLabel ���� = new JLabel("\u540D\u79F0");
		����.setHorizontalAlignment(SwingConstants.CENTER);
		����.setFont(new Font("����", Font.PLAIN, 24));
		����.setBounds(51, 285, 115, 35);
		frame.getContentPane().add(����);
		
		������д = new JTextField();
		������д.setBounds(181, 285, 222, 35);
		frame.getContentPane().add(������д);
		������д.setColumns(10);
		
		JLabel ��Ʒ��� = new JLabel("\u91D1\u989D");
		��Ʒ���.setHorizontalAlignment(SwingConstants.CENTER);
		��Ʒ���.setFont(new Font("����", Font.PLAIN, 24));
		��Ʒ���.setBounds(51, 361, 115, 52);
		frame.getContentPane().add(��Ʒ���);
		
		��Ʒ�����д = new JTextField();
		��Ʒ�����д.setBounds(181, 375, 115, 43);
		frame.getContentPane().add(��Ʒ�����д);
		��Ʒ�����д.setColumns(10);
		
		JLabel �ܽ�� = new JLabel("\u603B\u91D1\u989D");
		�ܽ��.setFont(new Font("����", Font.PLAIN, 22));
		�ܽ��.setHorizontalAlignment(SwingConstants.CENTER);
		�ܽ��.setBounds(424, 378, 95, 35);
		frame.getContentPane().add(�ܽ��);
		
		�ܽ����д = new JTextField();
		�ܽ����д.setFont(new Font("����", Font.PLAIN, 22));
		�ܽ����д.setBounds(519, 378, 96, 35);
		frame.getContentPane().add(�ܽ����д);
		�ܽ����д.setColumns(10);		
				
		JLabel ������ = new JLabel("\u6761\u5F62\u7801");
		������.setHorizontalAlignment(SwingConstants.CENTER);
		������.setFont(new Font("����", Font.PLAIN, 24));
		������.setBounds(51, 180, 115, 35);
		frame.getContentPane().add(������);
		
		JTextField ��������д;
		��������д = new JTextField();
		//���������룬�س�����ʾ�����ƣ��������Զ���ʧ
		��������д.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code=��������д.getText();
				String Money=null;
				String Name=null;
				try {
					ConnectDb conn1=new ConnectDb();
					Money =conn1.getMoney(code);
					ConnectDb conn2=new ConnectDb();
					Name=conn1.getName(code);
				} catch (Exception el) {
					el.printStackTrace();
				}
				������д.setText(Name);
				��Ʒ�����д.setText(Money);
				/*String total_Money="0";
				total_Money = (Integer.parseInt(total_Money)+Integer.parseInt(Money_Name[1]))+"";
				�ܽ����д.setText(total_Money);*/
				��������д.setText("");
			}
		});
		��������д.setBounds(181, 182, 222, 35);
		frame.getContentPane().add(��������д);
		��������д.setColumns(10);
		
		
		
		JButton ֧����ť = new JButton("\u652F\u4ED8");
		//֧����ȫ���Զ���գ�������뵽���ݿ���
		֧����ť.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				��Ա����д.setText("");
				��Ʒ�����д.setText("");
				�ܽ����д.setText("");
				������д.setText("");
//				
//				
//				
			}
		});
		
		
		֧����ť.setFont(new Font("����", Font.PLAIN, 22));
		֧����ť.setBounds(613, 449, 95, 52);
		frame.getContentPane().add(֧����ť);
		
		
	}
}
