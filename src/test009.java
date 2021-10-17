import java.util.Scanner;

public class test009 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 아스키코드 활용하기 4
        Scanner sc = new Scanner(System.in);
        // 문장 스플릿 방법
        String[] input = sc.nextLine().split(" ");
        //문자열 로직
        if(input.length == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(input.length);
        }
        sc.close();


    }
}
