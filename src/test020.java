import java.util.Scanner;

public class test020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 대문자 출력 알고리즘 풀이 */
        String input = sc.nextLine();
        String change = input.toUpperCase();

        System.out.println(change);

        sc.close();
    }
}
