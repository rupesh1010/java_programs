import java.io.*;
public class fibonacci{
	  public static void main(String args[])throws IOException
	  {
		  DataInputStream in=new DataInputStream(System.in);
		  int x,y,z;
		  System.out.print("Enter any number: ");
	  	int n=Integer.parseInt(in.readLine());
		  x=0;
		  y=1;
		  z=0;
		  while(z<=n)
		  {
			  System.out.println(z);
			  x=y;
			  y=z;
			  z=x+y;
		  }
	  }
}
