import java.util.Scanner;

public class B3612 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int[] store=new int[n];
        int [] sum_store=new int[n];
        int leiji=0;
        for (int i=0;i<n;i++){
            store[i]=input.nextInt();
            leiji=leiji+store[i];
            sum_store[i]=leiji;
        }
        int m=input.nextInt();
        int[][] tuple=new int[m][2];
        for (int i=0;i<m;i++){
            tuple[i][0]=input.nextInt();
            tuple[i][1]=input.nextInt();
        }
        for (int i=0;i<m;i++){
            System.out.println(sum_store[tuple[i][1]-1]-sum_store[tuple[i][0]-1]+store[tuple[i][0]-1]);
//            System.out.println(tuple[i][1]);
//            System.out.println(tuple[i][0]);
        }
    }
}
