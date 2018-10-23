import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setBounds(600,300,800,400);
		//setBounds(켜지는 x좌표, 켜지는 y좌표, 창 가로 크기, 창 세로 크기)
		//켜지는 x좌표와 y좌표는 창의 가장 왼쪽 모서리 기준
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("1");
		btn1.setIcon(null);
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		
		frm.setVisible(true);
	}
}
