package supermarketsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class goods_suply {

	goods_suply(){
		JFrame frame;
		frame = new JFrame();
		frame.setTitle("\u8865\u8D27\u754C\u9762");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\a53eab07e9e34fd95efa91dc72_560.jpg"));
		frame.setBounds(100, 100, 986, 759);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);		
				
		JTextArea ȱ����Ϣ = new JTextArea();
		ȱ����Ϣ.setLineWrap(true);
		ȱ����Ϣ.setFont(new Font("Monospaced", Font.PLAIN, 18));
		ȱ����Ϣ.setBounds(179, 15, 588, 515);
		frame.getContentPane().add(ȱ����Ϣ);
		

		JButton һ������ = new JButton("\u4E00\u952E\u8865\u8D27");
		һ������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ȱ����Ϣ.setText("");
			}
		});
		һ������.setFont(new Font("����", Font.PLAIN, 26));
		һ������.setBounds(781, 585, 148, 57);
		frame.getContentPane().add(һ������);
		
		JLabel ���� = new JLabel("New label");
		����.setIcon(new ImageIcon("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\20130905_e7d020a06e0d9bd94b01aem8k6ge2dwu.jpg"));
		����.setBounds(0, 0, 964, 697);
		frame.getContentPane().add(����);
		

		
	}
}
