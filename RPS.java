package RockPaperScissors;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RPS extends JFrame
{
	Container c;
	JLabel textyou;
	JLabel textcomputer;
	JLabel yourimage;
	JLabel computerimage;
	JLabel VS;
	JButton Scissors;
	JButton Rock;
	JButton Paper;
	JLabel result;
	RPS()
	{
		setTitle("RPS game");
		c=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(550,500);
		setVisible(true);
		setLayout(null);
		c.setBackground(Color.white);
		

		Scissors = new JButton("가위");
		Scissors.setForeground(Color.magenta);
		Scissors.setLocation(30,30);
		Scissors.setBackground(Color.white);
		Scissors.setOpaque(true);
		Scissors.setSize(100,24);
		Scissors.setFont(new Font("궁서체",Font.BOLD, 22));
		Scissors.addActionListener(new MyMouseListener());
		c.add(Scissors);
		
		Rock = new JButton("바위");
		Rock.setForeground(Color.GREEN);
		Rock.setLocation(200,30);
		Rock.setBackground(Color.white);
		Rock.setOpaque(true);
		Rock.setSize(100,24);
		Rock.setFont(new Font("궁서체",Font.BOLD, 22));
		Rock.addActionListener(new MyMouseListener());
		c.add(Rock);
		
		Paper = new JButton("보");
		Paper.setForeground(Color.blue);
		Paper.setLocation(370,30);
		Paper.setBackground(Color.white);
		Paper.setOpaque(true);
		Paper.setSize(100,24);
		Paper.setFont(new Font("궁서체",Font.BOLD, 22));
		Paper.addActionListener(new MyMouseListener());
		c.add(Paper);
		
		textyou = new JLabel("당신의 선택");
		textyou.setForeground(Color.blue);
		textyou.setLocation(30,150);
		textyou.setSize(500,51);
		textyou.setFont(new Font("바탕체",Font.BOLD, 22));
		c.add(textyou);
		
		textcomputer = new JLabel("컴퓨터");
		textcomputer.setForeground(Color.RED);
		textcomputer.setLocation(350,150);
		textcomputer.setSize(200,51);
		textcomputer.setFont(new Font("바탕체",Font.BOLD, 22));
		c.add(textcomputer);
		
		yourimage = new JLabel("시작전");
		yourimage.setForeground(Color.blue);
		yourimage.setLocation(30,180);
		yourimage.setSize(150,200);
		yourimage.setFont(new Font("궁서체",Font.BOLD, 40));
		c.add(yourimage);
		
		computerimage = new JLabel("시작전");
		computerimage.setForeground(Color.red);
		computerimage.setLocation(325,180);
		computerimage.setSize(150,200);
		computerimage.setFont(new Font("궁서체",Font.BOLD, 40));
		c.add(computerimage);
		
		VS = new JLabel("VS");
		VS.setLocation(210,230);
		VS.setSize(200,51);
		VS.setFont(new Font("궁서체",Font.BOLD, 50));
		c.add(VS);
		
		result = new JLabel("");
		result.setLocation(15,380);
		result.setForeground(Color.black);
		result.setSize(500,51);
		result.setBackground(Color.green);
		result.setOpaque(true);
		result.setFont(new Font("바탕체",Font.BOLD, 20));
		c.add(result);
	}
	class MyMouseListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int number=(int)(Math.random()*3+1);
			
			
			if(number==1) 
			{
				computerimage.setText("");
				computerimage.setIcon(new ImageIcon("C:\\Users\\minch\\OneDrive\\사진\\Java 사진/Scissors.jpg"));
			}
			if(number==2) 
			{
				computerimage.setText("");
				computerimage.setIcon(new ImageIcon("C:\\Users\\minch\\OneDrive\\사진\\Java 사진/Rock.jpg"));
			}
			if(number==3) 
			{
				computerimage.setText("");
				computerimage.setIcon(new ImageIcon("C:\\Users\\minch\\OneDrive\\사진\\Java 사진/Paper.jpg"));
			}
			
			
			
			String getText = ((JButton)e.getSource()).getText();
			
			
			if(getText.equals("가위")) 
			{
				yourimage.setText("");
				yourimage.setIcon(new ImageIcon("C:\\Users\\minch\\OneDrive\\사진\\Java 사진/Scissors.jpg"));
				if(number==1)
				{
					result.setText("비겼습니다..");
				}
				if(number==2)
				{
					result.setText("졌습니다ㅠㅠ");
				}
				if(number==3)
				{
					result.setText("이겼습니다!!");
				}
			}
			if(getText.equals("바위")) 
			{
				yourimage.setText("");
				yourimage.setIcon(new ImageIcon("C:\\Users\\minch\\OneDrive\\사진\\Java 사진/Rock.jpg"));
				if(number==2)
				{
					result.setText("비겼습니다..");
				}
				if(number==3)
				{
					result.setText("졌습니다ㅠㅠ");
				}
				if(number==1)
				{
					result.setText("이겼습니다!!");
				}
			}
			if(getText.equals("보")) 
			{
				yourimage.setText("");
				yourimage.setIcon(new ImageIcon("C:\\Users\\minch\\OneDrive\\사진\\Java 사진/Paper.jpg"));
				if(number==3)
				{
					result.setText("비겼습니다..");
				}
				if(number==1)
				{
					result.setText("졌습니다ㅠㅠ");
				}
				if(number==2)
				{
					result.setText("이겼습니다!!");
				}
			}
		}
	}
	public static void main(String[] args) {
		new RPS();
	}
}
