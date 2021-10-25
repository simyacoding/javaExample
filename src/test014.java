import java.util.Scanner;

public class test014 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 알고리즘 기초
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        String sign1[] = new String[tc];

        for(int i=0; i< tc; i++){
            String num = sc.nextLine();
            String ex[] = num.split(" ");
            int a  = Integer.parseInt(ex[0]);
            int b  = Integer.parseInt(ex[1]);
            if(a > b){
                sign1[i] = ">";
            }
            else if(a == b){
                sign1[i] = "=";
            }
            else if(a < b){
                sign1[i] = "<";
            }
        }
        for(int i=0; i< tc; i++){
            System.out.println(sign1[i]+" ");
        }
        sc.close();
    }
}
