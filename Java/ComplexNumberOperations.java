package Practice;
import java.util.*;
class Complex
{
	double a,b,c,d;
	Complex(double a,double b,double c,double d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	void add()			//addition	
	{
		double x;
		double y;
		x=a+c;
		y=b+d;
		System.out.println("sum of two numbers\n"+x+"+"+y+"i");
	}
	
	void sub()			//subtraction	
	{
		double w;	
		double z;
		w=a-c;
		z=b-d;
		if(z>0)
			System.out.println("subtraction of two numbers\n"+w+"+"+z+"i");
		else
			System.out.println("subtraction of two numbers\n"+w+z+"i");
	}
	
	void mul()			//multiplication	
	{
		double m;
		double n;
		m=a*c-b*d;
		n=a*d+b*c;
		System.out.println("multiplication of two numbers\n"+m+"+"+n+"i");
	}
	
	void div()			//division	
	{
		double p;
		double q;
		p=(a*c+b*d)/(c*c+d*d);
		q=(b*c-a*d)/(c*c+d*d);
		System.out.println("division of two numbers\n"+p+"+"+q+"i");
	}
}

public class ComplexNumberOperations
	{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part of the first number");
		double a=sc.nextDouble();
		System.out.println("Enter the imaginary part of the first number");
		double b=sc.nextDouble();
		System.out.println("Enter the real part of the second number");
		double c=sc.nextDouble();
		System.out.println("Enter the imaginaray part of the second number");
		double d=sc.nextDouble();
		
		Complex n=new Complex(a,b,c,d);
		int choice;
		do{
			System.out.println("\n\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nChoose your desired operation");
			int ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:n.add();break;
				case 2:n.sub();break;
				case 3:n.mul();break;
				case 4:n.div();break;
				default:System.out.println("Invalid choice");break;
			}
			System.out.println("If you wishto continue with the same numbers, press 1. Else press 0");
			choice=sc.nextInt();
		}while(choice==1);
	}
}
