package basicjava;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		
		int i,n,s2=0,s3=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 integer :");
		for(i=1;i<=10;i++)
		{
			n=sc.nextInt();
			if(n>=10 && n<=99) {
				//Check if the number is two-digit
			s2+=n;
			}else if(n>=100 && n<999) {
				//Check  if the number is three-digit
			s3+=n;
		}
			
		}
			System.out.println("Sum of 2 digit numbers:"+s2);
			System.out.println("Sum of 3 digit numbers:"+s3);
			
			


	}


	}

