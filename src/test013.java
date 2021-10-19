import java.util.Scanner;

public class test013 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 조건 계산 2
        Scanner sc = new Scanner(System.in);

        int tc = Integer.parseInt(sc.nextLine());
        int sum[] = new int[tc];
        double avg[] = new double[tc];

        for(int i = 0; i < tc; i++) {
            String[] input = sc.nextLine().split(" ");
            sum[i]=0;

            for(int k=0; k<input.length; k++) {
                sum[i] = sum[i] + Integer.parseInt(input[k]);
            }
            
            avg[i] = Math.round((double)sum[i]/input.length);
        
        }
        for(int k=0; k<tc; k++) {
            System.out.println(avg[k]);
        }
    }

}
