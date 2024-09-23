import java.util.Scanner;

public class tb_P1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String[][] store=new String[n][2];
        for (int i=0;i<n;i++){
            store[i][0]=input.next();
            store[i][1]=input.next();
        }

        for (int i=0;i<n;i++){
            String ans="";
            ans=ans+store[i][0]+store[i][1];
            System.out.println(ans);
        }

    }
}
