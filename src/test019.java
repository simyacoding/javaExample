import java.util.Scanner;

public class test019 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 알고리즘 기초
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        /* 알파벳 숫자 출력 알고리즘 풀이 */
        for(int i = 0; i<input.length(); i++){
            char a = input.charAt(i);
            String b = (int)a+" ";
            sb.delete(i,i+1);
            sb.append(b);
        }
        System.out.println(sb.toString());
        sc.close();


    }
}
