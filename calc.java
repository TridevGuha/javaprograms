/*java calculator*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener
{
	JButton bc,bac,bpt,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bmin,bmul,bdiv,beq;
	JTextField t;
	JPanel p1,p2;
	String s="";
	String op;
	long num1,num2,ans;
	int c=0;
	Calculator(String st)
	{
		super(st);
		t=new JTextField(10);
		bc=new JButton("C");
		bac=new JButton("AC");
		bpt=new JButton(".");
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		badd=new JButton("+");
		bmin=new JButton("-");
		bmul=new JButton("*");
		bdiv=new JButton("/");
		beq=new JButton("=");
		t.setEditable(false);
		t.setCaretPosition(0);
		p1=new JPanel();
		p2=new JPanel();
		p1.setLayout(new FlowLayout());
		p2.setLayout(new GridLayout(6,3));
		p1.add(t);
		p2.add(bc);p2.add(bac);p2.add(b0);p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);
		p2.add(b5);p2.add(b6);p2.add(b7);p2.add(b8);p2.add(b9);
		p2.add(bpt);p2.add(badd);p2.add(bmin);p2.add(bmul);p2.add(bdiv);p2.add(beq);
		Container c=getContentPane();
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.SOUTH);
		setSize(300,300);
		setVisible(true);
		setResizable(false);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		badd.addActionListener(this);
		bmin.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		beq.addActionListener(this);
		bc.addActionListener(this);
		bac.addActionListener(this);
		bpt.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bc)
		{
			s="";
			t.setText("");
		}
		else if(ae.getSource()==bac)
		{
			s="";
			t.setText("");
			
		}
		else if(ae.getSource()==bpt)
		{
			if(c<10)
			{
				++c;
				s=s+".";
				t.setText(s);
			}
			
		}
		else if(ae.getSource()==b0)
		{
			if(c<10)
			{
				++c;
				s=s+"0";
				t.setText(s);
			}
			
		}
		else if(ae.getSource()==b1)
		{
			if(c<10)
			{
				++c;
				s=s+"1";
				t.setText(s);
			}
		}
		else if(ae.getSource()==b2)
		{
			if(c<10)
			{
				++c;
				s=s+"2";
				t.setText(s);
			}
		}
		else if(ae.getSource()==b3)
		{
			if(c<10)
			{
				++c;
				s=s+"3";
				t.setText(s);
			}
		}
		else if(ae.getSource()==b4)
		{
			if(c<10)
			{
				++c;
				s=s+"4";
				t.setText(s);
			}
		}
		else if(ae.getSource()==b5)
		{
			if(c<10)
			{
				++c;
				s=s+"5";
				t.setText(s);
			}
		}
		else if(ae.getSource()==b6)
		{
			if(c<10)
			{
				++c;
				s=s+"6";
				t.setText(s);
			}
		}
		else if(ae.getSource()==b7)
		{
			if(c<10)
			{
				++c;
				s=s+"7";
				t.setText(s);
			}
		}
		else if(ae.getSource()==b8)
		{
			if(c<10)
			{
				++c;
				s=s+"8";
				t.setText(s);
			}
		}
		else if(ae.getSource()==b9)
		{
			if(c<10)
			{
				++c;
				s=s+"9";
				t.setText(s);
			}
		}
		else if(ae.getSource()==badd)
		{
			op="+";
			num1=Long.parseLong(s);
			s="";
		}
		else if(ae.getSource()==bmin)
		{
			op="-";
			num1=Long.parseLong(s);
			s="";
		}
		else if(ae.getSource()==bmul)
		{
			op="*";
			num1=Long.parseLong(s);
			s="";
		}
		else if(ae.getSource()==bdiv)
		{
			op="/";
			num1=Long.parseLong(s);
			s="";
		}
		else
		{
			num2=Long.parseLong(s);
			s="";
			if(op=="+")
			{
				ans=num1+num2;
				t.setText(""+ans);
			}
			else if(op=="-")
			{
				ans=num1-num2;
				t.setText(""+ans);
			}
			else if(op=="*")
			{
				ans=num1*num2;
				t.setText(""+ans);
			}
			else
			{
				ans=num1/num2;
				t.setText(""+ans);
			}
		}
	}

}

class Calc
{
	public static void main(String args[])
	{
		Calculator c=new Calculator("Calculator");
	}
}
