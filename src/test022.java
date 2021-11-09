import java.util.Scanner;

public class test022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 횟수 확인 알고리즘 풀이 */
        String arr[] = sc.nextLine().split(" ");
        int input = Integer.parseInt(arr[0]);
        int input1 = Integer.parseInt(arr[1]);
        int i;
        for(i=0;input1<input;input1++){
            i++;
        }
        System.out.println(i);
        sc.close();
    }

}
