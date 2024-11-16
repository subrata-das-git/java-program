public class Palindrome {
    public static void checkPalindrome(int num){
        int temp=num;
        if(num<10 && num>1)
          System.out.println("Number is single digit");
        else if(num<1)
           System.out.println("invalid input");
        else{
            int rem=0,rev=0;
            while(num>0){
                rem = num%10;
                rev= rev*10+rem;
                num= num/10;
            }
            if(temp == rev)    
                 System.out.println(temp+" is palindrome");
            else
                 System.out.println(temp+" is not palindrome");    
        }  
    }
    public static void main(String[] args) {
        
        checkPalindrome(121);
        checkPalindrome(127);
        checkPalindrome(3);
        checkPalindrome(-43);
    }
}
