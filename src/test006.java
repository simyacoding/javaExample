import java.util.Scanner;

public class test006 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 아스키코드 활용하기
        Scanner sc = new Scanner(System.in);
        try {

            int sum = 0;
            String input = sc.nextLine();
            for (int i = 0; i < input.length(); i++) {
                sum += (int) input.charAt(i) - 48;

            }
            System.out.println(sum);
        } catch (Exception e) {
        }
    }

}
