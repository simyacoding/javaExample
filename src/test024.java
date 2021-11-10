import java.util.Scanner;

public class test024 {
    public static void main(String[] args){
        /* 출력 풀이 */
        for(int i=1; i<=5;i++){
            for(int k=1; k<5; k++){
                if(i==k) System.out.print("#");
                System.out.print("+");
                if(i==5 && k==4)System.out.print("#");
            }
            System.out.print("\n");
        }
    }

}
