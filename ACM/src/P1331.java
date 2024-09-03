import java.util.Scanner;

public class P1331 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        int c=input.nextInt();
        char[][] ship=new char[r+2][c+2];
        for(int i=0;i<r+2;i++){
            for(int j=0;j<c+2;j++){
                ship[i][j]='.';
            }
        }
        String[] shuru=new String[c+2];
        for(int i=1;i<=r;i++){
            shuru[i]=input.next();
        }
        for (int i =1;i<=r;i++){
            for (int j=0;j<c;j++){
//                System.out.println(shuru[i]);
                ship[i][j+1]=shuru[i].charAt(j);
            }
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if (ship[i][j]=='#'&&ship[i][j-1]=='#'&&ship[i-1][j]=='#'&&ship[i-1][j-1]=='.'){
                    System.out.println("Bad placement.");
                    return;
                }if (ship[i][j]=='#'&&ship[i][j-1]=='#'&&ship[i-1][j]=='.'&&ship[i-1][j-1]=='#'){
                    System.out.println("Bad placement.");
                    return;
                }if (ship[i][j]=='#'&&ship[i][j-1]=='.'&&ship[i-1][j]=='#'&&ship[i-1][j-1]=='#'){
                    System.out.println("Bad placement.");
                    return;
                }if (ship[i][j]=='.'&&ship[i][j-1]=='#'&&ship[i-1][j]=='#'&&ship[i-1][j-1]=='#'){
                    System.out.println("Bad placement.");
                    return;
                }
            }
        }
        int ans=0;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if (ship[i][j]=='#'&&ship[i][j-1]=='.'&&ship[i-1][j]=='.'){
                    ans++;
                }
            }
        }
        System.out.printf("There are %d ships.",ans);
    }
}
