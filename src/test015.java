import java.util.Scanner;

public class test015 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 알고리즘 기초
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        int max1[] = new int[tc];
        for(int i = 0; i < tc; i++) {
            int max = 0;
            String num = sc.nextLine();
            String arr[] = num.split(" ");
            for(int k = 0; k < arr.length; k++){
                int ex = Integer.parseInt(arr[k]);
                if(ex > max) {
                    max = ex;
                    max1[i] = max;
                }
            }
        }

        for(int k = 0; k < tc; k++) {
            System.out.println(max1[k]);
        }


    }
}
