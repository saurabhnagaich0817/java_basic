import java.util.Scanner;
public class boston{


	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ; 
       long x= sc.nextLong();

       
       int y=0;
       long temp=x ;
       while(temp!=0)
       {
           y+=temp%10;
           temp/=10;
       }
       for(int i=2;i*i<=x;i++)
           if(y%i==0)
           {
               int count=0;
               while(x%i==0)
               {
                   x/=i;
                   count++;
               }
               int sum=0;
                temp=i;
               while(temp!=0)
               {
                   sum+=temp%10;
                   temp/=10;
               }
               y-=sum*count;
           }
       if(x!=1)
       {
           int sum=0;
               temp=x;
               while(temp!=0)
               {
                   sum+=temp%10;
                   temp/=10;
               }
           y-=sum;
       }
       if(y==0)
       System.out.println("1");
       else 
    	   System.out.println("0");
    
    
}

}