import java.util.Scanner;

public class test005 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 아스키코드 출력하기
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println((int)input.charAt(0));
        sc.close();
    }
}
