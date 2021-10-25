import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test016 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 알고리즘 기초
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        int mid[] = new int[tc];

        String num = sc.nextLine();
        String arr[] = num.split(" ");

        for(int i = 0; i < tc; i++) {
            mid[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(mid);
        System.out.println(mid[tc/2]);
        sc.close();
    }
}
