import java.util.*;
public class Addition_within_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner in=new Scanner(System.in);
       int sum=0;
       int [][]a= {{1,2,3},{4,5,6}};
       System.out.println(a);
       System.out.print("Entered the pper limit for the range ");
       int Uppr_lmt=in.nextInt();
       System.out.print("Entered the pper limit for the range ");
       int Lwr_lmt=in.nextInt();
      for(int i=Uppr_lmt;i<=Lwr_lmt;i++) {
    	  sum=sum+i;
      }
      System.out.println("Addition of given range is "+sum);
       in.close();
	}

}
