package Practice;

//To generate the Pascal's triangle for a given number of rows
import java.util.Scanner;

class C{				
	int fact(int n){				//To calculate the factorial of a number
		int f=1;
		for(int i=1;i<=n;i++)
			f*=i;
		return f;
	}
	
	int ncr(int n,int r) {			//To find the combination i.e. the nCr for a given pair of numbers
		int c = fact(n)/(fact(n-r)*fact(r));
		return c;
	}
}

public class PascalTriangle {
	public static void main(String[] args) {
		C c=new C();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");		//Taking the no. of rows input from the user
		int n=sc.nextInt();
		int i,j;
		
		for(i=0 ; i<=n ; i++) {				//Loop to print the spaces at the start of each row
			for(j=0 ; j<=(n-i) ; j++)
				System.out.print(" ");
		
			for(j=0 ; j<=i ; j++)				//Loop to print the binomial coefficients i.e. the numbers of the Pascal's triangle
				System.out.print(" " + c.ncr(i,j));
			System.out.println();
		}
	}

}
