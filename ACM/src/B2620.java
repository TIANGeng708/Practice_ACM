import java.util.Scanner;

public class B2620 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        if (a>b){
            System.out.print(1);
            System.out.print(" ");
        }else {
            System.out.print(0);
            System.out.print(" ");
        }

        if (a<=b){
            System.out.print(1);
            System.out.print(" ");
        }else {
            System.out.print(0);
            System.out.print(" ");
        }

        if (a!=b){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
//        System.out.print(a>b);
//        System.out.print(" ");
//        System.out.print(a<=b);
//        System.out.print(" ");
//        System.out.print(a!=b);

    }
}
