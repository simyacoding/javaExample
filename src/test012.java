import java.util.Scanner;

public class test012 {
    public static void main(String[] args) {
        // 조건 계산 1
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        int sum[] = new int[tc];

        for (int i = 0; i < tc; i++) {
            sum[i] = 0;
            String[] input = sc.nextLine().split(" ");

            for(int k = 0; k<input.length; k++) {
                if (Integer.parseInt(input[k]) % 2 == 1) {
                    sum[i] = sum[i] + Integer.parseInt(input[k]);
                }
            }
        }
        for (int i = 0; i < tc; i++) {
            System.out.println(sum[i]);
        }
        sc.close();
    }
}