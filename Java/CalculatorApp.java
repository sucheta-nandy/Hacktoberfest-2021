import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CalculatorApp extends Applet implements ActionListener
{
	TextField text1,text2;
	Button Addition,Subtraction,Multiplication,Division;
	String s,s1="";
	float a,b,c;
	public void init()
	{
		Addition = new Button("Addition");
		Subtraction = new Button("Subtraction");
		Multiplication = new Button("Multiplication");
		Division = new Button("Division");
		text1 = new TextField(10);
		text2 = new TextField(10);
		add(text1);
		add(text2);
		text1.setText("0");
		text2.setText("0");

		add(Addition);
		add(Subtraction);
		add(Multiplication);
		add(Division);

		Addition.addActionListener(this);
		Subtraction.addActionListener(this);
		Multiplication.addActionListener(this);
		Division.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str == "Addition")
		{
			a=Integer.parseInt(text1.getText());
			b=Integer.parseInt(text2.getText());
			c=a+b;
			s1="The Sum is: ";
			s = String.valueOf(c);
		}
		else if(str == "Subtraction")
		{
			a=Integer.parseInt(text1.getText());
			b=Integer.parseInt(text2.getText());
			c=a-b;
			s1="The Difference is: ";
			s = String.valueOf(c);
		}
		else if(str == "Multiplication")
		{
			a=Integer.parseInt(text1.getText());
			b=Integer.parseInt(text2.getText());
			c=a*b;
			s1="Multiplied value is: ";
			s = String.valueOf(c);
		}
		else
		{
			a=Integer.parseInt(text1.getText());
			b=Integer.parseInt(text2.getText());
			c=a/b;
			s1="The quotient is: ";
			s = String.valueOf(c);
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(s1,100,200);
		g.drawString(s,200,200);
	}
}