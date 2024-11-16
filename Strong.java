public class Strong {
    public static int fact(int rem){
        int fact=1;
        for(int i=1;i<=rem;i++)
           fact*=i;
        return fact;   

    }
    public static void checkStrong(int num){
        int temp=num,sum=0;

        if(num<1){
        
          System.out.println("INVALID NUMBER");
          return;
        }
        else{
            int rem=0;
            while(num>0){
                rem=num%10;
                sum+=fact(rem);  
                num=num/10; 
            }
            if(sum==temp)
              System.out.println(sum);    

        }
    }
    public static void main(String[] args) {
        for(int i=1; i<=50000 ; i++)
           checkStrong(i);
        
    }
}


