public class prime {
    public static void checkPrime(int num){
        if(num<=1)
           return;
        else{
            for(int i=2; i*i <= num ; i++){
                if(num%i==0)
                   return;
            }
            System.out.print(num+" ");
        }   
    }
    public static void main(String[] args) {
        for(int j=1 ; j<= 100 ; j++)
            checkPrime(j);
    }
}
