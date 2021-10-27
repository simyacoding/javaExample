import java.util.Scanner;

public class test017 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 알고리즘 기초
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = 0;
        for(int i = 0; i < input.length(); i++){
            int num = Integer.parseInt(input.substring(i,i+1));
            result = result + num;
        }


        System.out.println(result);
        sc.close();


    }
}
