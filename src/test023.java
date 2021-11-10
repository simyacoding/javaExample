import java.util.Scanner;

public class test023 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        int arr[] = new int[tc*2];
        for(int i=0; i<tc;i++){
            /* 몫, 나머지 알고리즘 풀이 */
            String num[] = sc.nextLine().split(" ");
            arr[i] = Integer.parseInt(num[0])/Integer.parseInt(num[1]);
            arr[i+1] = Integer.parseInt(num[0])%Integer.parseInt(num[1]);
        }
        for(int k=1; k<=tc;k++){
            /* 몫, 나머지 알고리즘 풀이 */
            System.out.println(k+"# "+arr[k-1]+" "+arr[k]);

        }

        sc.close();
    }

}
