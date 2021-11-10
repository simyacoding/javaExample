import java.util.Scanner;

public class test025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 1부터 주어진 숫자 더하는 알고리즘 */
        int tr = sc.nextInt();
        int sum = tr*(tr+1)/2;
        System.out.println(sum);

    }

}
