package supermarketsys;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

import javax.swing.SwingConstants;


public class role_chose {
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					role_chose window = new role_chose();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public role_chose() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setForeground(new Color(106, 90, 205));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\318757-130Q010403754.jpg"));
		frame.setTitle("\u7528\u6237\u9009\u62E9\u754C\u9762");
		frame.setBounds(100, 100, 1012, 778);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton shoper = new JButton("\u6D88\u8D39\u8005\u767B\u9646");
		shoper.setForeground(new Color(46, 139, 87));
		//打开购物查询界面
		shoper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				shopperlogin slogin=new shopperlogin();
			}
		});
		shoper.setToolTipText("");
		shoper.setBackground(new Color(128, 128, 128));
		shoper.setFont(new Font("宋体", Font.BOLD, 40));
		shoper.setBounds(79, 208, 279, 210);
		shoper.setBorder(BorderFactory.createRaisedBevelBorder());
		shoper.setContentAreaFilled(false);
		frame.getContentPane().add(shoper);
		
		
		JButton goodsworker = new JButton("\u8D27\u7269\u7BA1\u7406\u5458\u767B\u9646");
		goodsworker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				suplyerlogin slogin=new suplyerlogin();
			}
		});
		goodsworker.setForeground(new Color(25, 25, 112));
		goodsworker.setFont(new Font("宋体", Font.BOLD, 34));
		goodsworker.setBackground(new Color(169, 169, 169));
		goodsworker.setBounds(357, 208, 279, 210);
		goodsworker.setContentAreaFilled(false);
		goodsworker.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.getContentPane().add(goodsworker);
		
		JButton casher = new JButton("\u6536\u94F6\u5458\u767B\u9646");
		casher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				casherlogin clogin=new casherlogin();
			}
		});
		casher.setForeground(new Color(218, 165, 32));
		casher.setFont(new Font("宋体", Font.BOLD, 40));
		casher.setBackground(new Color(169, 169, 169));
		casher.setBounds(79, 414, 279, 210);
		casher.setContentAreaFilled(false);
		casher.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.getContentPane().add(casher);
		
		JButton manager = new JButton("\u7ECF\u7406\u767B\u9646");
		manager.setForeground(new Color(0, 0, 255));
		manager.setFont(new Font("宋体", Font.BOLD, 40));
		manager.setBackground(new Color(169, 169, 169));
		manager.setBounds(357, 414, 279, 210);
		//按钮透明
		manager.setContentAreaFilled(false);
		manager.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.getContentPane().add(manager);
		manager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managerlogin mlogin=new managerlogin();
			}
		});
		
		JLabel welcomlabel = new JLabel("\u6B22 \u8FCE \u4F7F \u7528");
		welcomlabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomlabel.setFont(new Font("宋体", Font.PLAIN, 45));
		welcomlabel.setForeground(new Color(0, 191, 255));
		welcomlabel.setBounds(280, 41, 337, 52);
		frame.getContentPane().add(welcomlabel);
		
		JLabel rolechoicelabel = new JLabel("\u8BF7 \u9009 \u62E9 \u7528 \u6237 \u89D2 \u8272");
		rolechoicelabel.setHorizontalAlignment(SwingConstants.CENTER);
		rolechoicelabel.setForeground(new Color(220, 20, 60));
		rolechoicelabel.setFont(new Font("宋体", Font.PLAIN, 31));
		rolechoicelabel.setBounds(158, 108, 566, 52);
		frame.getContentPane().add(rolechoicelabel);
		
		JLabel 背景 = new JLabel("New label");
		背景.setIcon(new ImageIcon("C:\\Users\\apple\\Desktop\\\u8BFE\u8BBE\u56FE\u7247\\318757-130Q010403754.jpg"));
		背景.setBounds(0, 0, 1001, 716);
		frame.getContentPane().add(背景);
	}
	

}
