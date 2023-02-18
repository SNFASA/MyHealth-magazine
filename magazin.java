import java.util.Scanner;
public class magazin{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of quantity :");
        int qyt = sc.nextInt();
        double total;
        if (qyt >= 5)
            total = qyt * 5 ;
        else 
            total = qyt * 7 ;
        System.out.println("Total amount =" + total);
    }
    
}