//palintrome or not
import java.util.Scanner;
public class pro44 {

	public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          System.out.println("enter the string:");
          String a=in.nextLine();
          char arr2[]=new char[a.length()];
          char arr[]=a.toCharArray();
          for(int i=arr.length-1,j=0;i>=0;i--,j++) {
        	   arr2[j]=arr[i];
          }
           String b=new String(arr2).toString();
           System.out.println(b);
           if(a.equals(b)) {
        		  System.out.println("It is palintrome");
        	  }
        	  else {
        		  System.out.println("it is not palintrom");
        	  
          }
	}

}
