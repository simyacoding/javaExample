import java.util.Scanner;

public class test001 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 간단한 조건문

        int year = 2004;
        //짝수, 홀수 해 판단 문 ( == 연산자를 사용하기 )
        if((year%2) == 0){
            System.out.println(year + "는 짝수 해입니다.");
        }
        else {
            System.out.println(year + "는 홀수 해입니다.");
        }

        //짝수, 홀수 해 판단 문 ( != 연산자를 사용하기 )
        if((year%2) != 1 ){
            System.out.println(year + "는 짝수 해입니다.");
        }
        else {
            System.out.println(year + "는 홀수 해입니다.");
        }

        //짝수, 홀수 해 판단 문 ( 삼항 연산자를 사용하기 )
        int a = (year%2 >0) ? 0:1 ;
        if( a == 1 ){
            System.out.println(year + "는 짝수 해입니다.");
        } else {
            System.out.println(year + "는 홀수 해입니다.");
        }
        //윤년 구하는 판단 문 ( 윤년 조건을 보고 만들기 )
        if((year%4) == 0 ) {
            System.out.println(year + "는 윤년입니다.");
        }
        else {
            System.out.println(year + "는 윤년이 아닙니다.");
        }
    }
}
