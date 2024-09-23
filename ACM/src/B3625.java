import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B3625 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
        String[] store_num = new String[l];
        for (int i = 0; i < l; i++) {
            store_num[i] = input.next();

        }
        node[][] store_node = new node[l + 2][r + 2];
        for (int i = 0; i <= l+1; i++) {
            for (int j = 0; j <= r+1; j++) {
                store_node[i][j] = new node('#',0,0);
            }
        }
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= r; j++) {
                store_node[i][j] = new node(store_num[i-1].charAt(j-1),0,0);
            }
        }
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= r; j++) {
                store_node[i][j].left = store_node[i - 1][j];
                store_node[i][j].right = store_node[i + 1][j];
                store_node[i][j].upper = store_node[i][j - 1];
                store_node[i][j].lower = store_node[i][j + 1];
            }
        }
        store_node[l][r].biaoji=1;
        List<node> lianbiao = new ArrayList<>();
        lianbiao.add(store_node[1][1]);
        store_node[1][1].fangwen=1;
        while (lianbiao.size()>0){
            if (lianbiao.get(0).biaoji==1){
                System.out.println("Yes");
                return;
            }
            if (lianbiao.get(0).left.type=='.'&&lianbiao.get(0).left.fangwen==0){
                lianbiao.addLast(lianbiao.get(0).left);
                lianbiao.get(0).left.fangwen=1;
            }
            if (lianbiao.get(0).right.type=='.'&&lianbiao.get(0).right.fangwen==0){
                lianbiao.addLast(lianbiao.get(0).right);
                lianbiao.get(0).right.fangwen=1;
            }
            if (lianbiao.get(0).upper.type=='.'&&lianbiao.get(0).upper.fangwen==0){
                lianbiao.addLast(lianbiao.get(0).upper);
                lianbiao.get(0).upper.fangwen=1;
            }
            if (lianbiao.get(0).lower.type=='.'&&lianbiao.get(0).lower.fangwen==0){
                lianbiao.addLast(lianbiao.get(0).lower);
                lianbiao.get(0).lower.fangwen=1;
            }
            lianbiao.remove(0);
        }
        System.out.println("No");

    }
}

class node {
    char type;
    int biaoji;
    int fangwen;
    node left;
    node right;
    node upper;
    node lower;

    public node(char type,int biaoji,int fangwen) {
        this.type = type;
        this.biaoji=biaoji;
        this.fangwen=fangwen;
    }

    public node getRight() {
        return right;
    }

    public node getLeft() {
        return left;
    }

    public node getUpper() {
        return upper;
    }

    public node getLower() {
        return lower;
    }

    public void setRight(node right) {
        this.right = right;
    }

    public void setLeft(node left) {
        this.left = left;
    }

    public void setUpper(node upper) {
        this.upper = upper;
    }

    public void setLower(node lower) {
        this.lower = lower;
    }
}