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
				
		JTextArea 缺货信息 = new JTextArea();
		缺货信息.setLineWrap(true);
		缺货信息.setFont(new Font("Monospaced", Font.PLAIN, 18));
		缺货信息.setBounds(179, 15, 588, 515);
		frame.getContentPane().add(缺货信息);
		

		JButton 一键补货 = new JButton("\u4E00\u952E\u8865\u8D27");
		一键补货.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				缺货信息.setText("");
			}
		});
		一键补货.setFont(new Font("宋体", Font.PLAIN, 26));
		一键补货.setBounds(781, 585, 148, 57);
		frame.getContentPane().add(一键补货);
		
		JLabel 背景 = new JLabel("New label");
		背景.setIcon(new ImageIcon("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\20130905_e7d020a06e0d9bd94b01aem8k6ge2dwu.jpg"));
		背景.setBounds(0, 0, 964, 697);
		frame.getContentPane().add(背景);
		

		
	}
}
