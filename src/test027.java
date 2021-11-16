import java.util.Scanner;

public class test027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 약수 알고리즘 */
        int tc = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=tc; i++) {
            if(tc%i == 0)System.out.print(i+" ");
        }

        sc.close();
    }

}
