package Milestone1;
import java.util.*;
public class act11 {
	public static void main(String args[])
    {
	    int r=32,k=40,h1=6,h2=5;
	    float ravi=r/(float)h1;
	    float kumar=k/(float)h2;
        float c=(ravi+kumar);
	    float time=110/c;
	    int hr=(int)time;int mins = (int)((time-hr)*100);
	    int min = (mins*60/100);
	    System.out.println("The time taken by both to complete 110 pages is : "+hr+" hours "+min+" minutes");
    }
}
