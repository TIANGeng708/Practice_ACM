import java.util.Scanner;

public class P1163 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double w0=input.nextDouble();
        double w=input.nextDouble();
        double m=input.nextDouble();
        double l=0;
        double r=300;
        double mid=0;
        while (l<r){
            mid=(l+r)/2;
            if (check(mid,w0,w,m)){
                l=mid;
            }else {
                r=mid-0.05;
            }
        }
        System.out.printf("%.1f",mid);

//        System.out.println((w*m/w0-1)/m);
    }
    public static boolean check(double lilv,double w0,double w,double m){
        double qian=w0;
        for (int i=0;i<m;i++){
            qian=qian-w+qian*(lilv/100);
        }
        if (qian>0){
            return false;
        }else {
            return true;
        }
    }
}