package Milestone1;
import java.util.*;
public class act13 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int difference_lb = 23;
	    int perimeter = 206;
	    int sum_lb = perimeter/2;
	    int l=(difference_lb+sum_lb)/2;
	    int b=sum_lb-l;
	    int area=l*b;
	    System.out.print("The area of rectangle is : "+area);
	}
}
