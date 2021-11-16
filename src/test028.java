import java.util.Scanner;

public class test028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 가위바위보 알고리즘 */
        /* 1. 가위 2.바위 3.보*/
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if((a==1 && b==3)||(a==2 && b==1)||(a==3 && b==2))System.out.println("A");
        else if((b==2 && a==1)||(b==3 && a==2)||(b==1 && a==3))System.out.println("B");
        else System.out.println("C");
        sc.close();
    }
}
