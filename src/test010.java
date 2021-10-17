import java.util.Scanner;

public class test010 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 아스키코드 활용하기5
        Scanner sc = new Scanner(System.in);
        String[] input= sc.nextLine(). split(" ");
        int [] inputs = new int[2];

        inputs[0] = Integer.parseInt(new StringBuffer(input[0]).reverse().toString());
        inputs[1] = Integer.parseInt(input[1]);


        if(inputs[0]>inputs[1]) {
            System.out.println(inputs[0]);
        }
        else {
            System.out.println(inputs[1]);
        }
        sc.close();


    }
}
