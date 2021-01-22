//simple program in Java to print first fifty prime number.
import java.io.*:
class PrimeNo
      {
            public static void main(String args[])
            {
            int flag=0,number,i,cnt,r;
            cnt=1;
            DataInputStream in =new DataInputStream (System.in);
            try
            {
            r=1;
            while (cnt<=50)
            {
                  number=r;
                  for (i=2; i<number; i++)
                  {
                        if(number% I==0)
                        {
                              flag=1;
                              break;
                        }
                   }
                  if(flag==0)
                  {
                        cnt++;
                        System.out.println (number);
                  }
            flag=0;
            r++;
           }
        }
catch (Exception e){}
}
}
