package xupt.se.ttms.view.clerk;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;  
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import xupt.se.ttms.view.sellticket.SaleFrame;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LoginFrame{
		
	JFrame mainFrame = new JFrame("星空剧院票务管理系统");
	
	public LoginFrame(){
	            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;  
				try {
					org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
				//	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
		int FWIDTH = 1024;
		int FHEIGHT = 768;
		mainFrame.setSize(1024, 768);
		mainFrame.setLocation(150, 0);
		mainFrame.setResizable(false);
		mainFrame.setLayout(null);
		mainFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		JPanel pwelcomeimg = new JPanel();
		JPanel plogin = new JPanel();
		pwelcomeimg.setSize(FWIDTH, FHEIGHT*3/4);
		plogin.setSize(FWIDTH, FHEIGHT/4);
		pwelcomeimg.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		plogin.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		plogin.setLocation(0, FHEIGHT*3/4);
		
		ImageIcon imgwelcome = new ImageIcon("resource/image/main.jpg");
		ImageIcon imglogin = new ImageIcon("resource/image/main1.jpg");
		JLabel jLabelwel = new JLabel(imgwelcome);
		JLabel jLabellogin = new JLabel(imglogin);
		jLabellogin.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
		
		JButton blogin = new JButton("登陆");
		blogin.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		blogin.setForeground(Color.white); 
		JButton breset = new JButton("重置");
		breset.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));
		breset.setForeground(Color.white); 
		final JTextField usernametext = new JTextField(10);
		final JPasswordField passwordtext = new JPasswordField(10);
		JLabel username = new JLabel("用户名");
		JLabel password = new JLabel("密码");	
		
		breset.addMouseListener(new MouseListener() {  
            public void mouseClicked(MouseEvent e) {  
            	usernametext.setText("");  
            	passwordtext.setText("");  
            }  
            public void mousePressed(MouseEvent e) { }   
            public void mouseReleased(MouseEvent e) { }  
            public void mouseEntered(MouseEvent e) { }  
            public void mouseExited(MouseEvent e) { }  
        });
		jLabellogin.add(username);
		username.setFont(new Font("微软雅黑 Light", Font.BOLD, 16));
		username.setForeground(Color.BLACK);
		jLabellogin.add(usernametext);
		jLabellogin.add(password);
		password.setFont(new Font("微软雅黑 Light", Font.BOLD, 16));
		password.setForeground(Color.BLACK);
		jLabellogin.add(passwordtext);
		jLabellogin.add(blogin);
		jLabellogin.add(breset);		
		
		pwelcomeimg.add(jLabelwel);
		plogin.add(jLabellogin);
		blogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(usernametext.getText().equals("admin") && passwordtext.getText().equals("admin"))
						{
							JOptionPane.showMessageDialog(null, "登录成功，尊贵的会员 " + usernametext.getText()+"欢迎您");
							SaleFrame frmStuMgr = new SaleFrame();
							frmStuMgr.setVisible(true);
							mainFrame.dispose();							
						}else if(usernametext.getText().equals("system") && passwordtext.getText().equals("system"))
						{
							JOptionPane.showMessageDialog(null, "登录成功，尊贵的管理员" + usernametext.getText()+"欢迎您");
							Administrator administrator = new Administrator();
							mainFrame.dispose();							
						}
						else
							JOptionPane.showMessageDialog(null, "用户名或密码错误，请重试。");
					}
				});
		mainFrame.add(pwelcomeimg);
		mainFrame.add(plogin);
		pwelcomeimg.setVisible(true);
		plogin.setVisible(true);
		mainFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.put("RootPane.setupButtonVisible",false); 
					new LoginFrame();
				} catch (Exception e) {
					javax.swing.JOptionPane.showMessageDialog(null, e, "Exception", 0);
					e.printStackTrace();
				}
			}
		});

	}

}
