package Milestone1;
import java.util.*;
public class act5 {
	public static void main(String[] args) {
        int i,sum=0,num;
        float average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers :");
        for(i=0;i<10;i++){
            num=sc.nextInt();
            sum=sum+num;
        }
        average=sum/(float)10;
        System.out.println("The average of 10 numbers is :"+average);
    }
}
