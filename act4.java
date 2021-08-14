package Milestone1;
import java.util.*;
public class act4 {
		public static void main(String[] args) {
			int N,fact=1;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of N:");
			N=sc.nextInt();
			for(int i=1;i<=N;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);

		}
}

