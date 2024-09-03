import java.util.Scanner;

public class P3741 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String m=input.next();
        int ans=0;
        for(int i=0;i<n-1;i++){
            if (m.charAt(i)=='V'&&m.charAt(i+1)=='K'){
                ans++;
                i++;
            }
        }
        String new_m=m.replace("VK","XX");
        for (int i=0;i<n-1;i++){
            if ((new_m.charAt(i)=='K'&&new_m.charAt(i+1)=='K')||(new_m.charAt(i)=='V'&&new_m.charAt(i+1)=='V')){
                ans++;
                break;
            }
        }
        System.out.println(ans);
    }
}
