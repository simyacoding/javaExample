import java.util.Scanner;

public class test026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 기본 사칙연산 알고리즘 */
        String[] input = sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
        System.out.println(Integer.parseInt(input[0]) - Integer.parseInt(input[1]));
        System.out.println(Integer.parseInt(input[0]) * Integer.parseInt(input[1]));
        System.out.println(Integer.parseInt(input[0]) / Integer.parseInt(input[1]));
        System.out.println(Integer.parseInt(input[0]) % Integer.parseInt(input[1]));
        sc.close();
    }

}
