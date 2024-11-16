import java.util.Scanner;;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ranks =  new int[n];

        for(int i =0; i<n; i++){
            ranks[i] = sc.nextInt();
        }

        int cuts =0; 

        int currentLowest = ranks[0];

        for(int i= 1; i<n; i++){
            if(ranks[i] < currentLowest){

                cuts++;
                currentLowest= ranks[i];
            }
        }

        System.out.println(cuts);
        sc.close();

    }
}


