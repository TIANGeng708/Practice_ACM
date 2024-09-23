import java.util.Scanner;
import java.util.Stack;

public class B3642 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        tree_node[] jiedianmen=new tree_node[n+1];
        for (int i=1;i<=n;i++){
            jiedianmen[i]=new tree_node(i);
        }
        for (int i=1;i<=n;i++){
            int left_value=input.nextInt();
            int right_value=input.nextInt();
            jiedianmen[i].left=jiedianmen[left_value];
            jiedianmen[i].right=jiedianmen[right_value];
        }
        Stack<tree_node> zhan=new Stack<>();
        tree_node p=jiedianmen[1];
        while (p!=null||!zhan.isEmpty()){
            while (p!=null){
                System.out.print(p.value+" ");
                zhan.push(p);
                p=p.left;
            }
            if (!zhan.isEmpty()){
                p=zhan.pop();
                p=p.right;
            }
        }
//        qianxubianli(jiedianmen[1]);
//        System.out.println();
//        zhongxubianli(jiedianmen[1]);
//        System.out.println();
//        houxubianli(jiedianmen[1]);
    }

    public static void qianxubianli(tree_node a){
        System.out.print(a.value+" ");
        if (a.left!=null){
            qianxubianli(a.left);
        }if (a.right!=null){
            qianxubianli(a.right);
        }
    }
    public static void zhongxubianli(tree_node a){

        if (a.left!=null){
            zhongxubianli(a.left);
        }
        System.out.print(a.value+" ");
        if (a.right!=null){
            zhongxubianli(a.right);
        }
    }
    public static void houxubianli(tree_node a){
        if (a.left!=null){
            houxubianli(a.left);
        }if (a.right!=null){
            houxubianli(a.right);
        }
        System.out.print(a.value+" ");
    }
}

class tree_node{
    tree_node left;
    tree_node right;
    int value;

    public tree_node(int value) {
        this.value = value;
    }
}