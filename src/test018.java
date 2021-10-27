import java.util.Scanner;

public class test018 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 알고리즘 기초
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=tc; i++) {
            int error= 0;
            String date = sc.nextLine();               // 날짜 입력 받기
            // String.substring(int start, int end) -> 문자열을 start에서부터 end까지 자르는 함수

            String year = date.substring(0,4);      //0~3번째까지 잘라 year로 지정
            String month = date.substring(4,6);      //4~5번째까지 잘라 month로 지정
            String day = date.substring(6,8);      //6~7번째까지 잘라 day로 지정

            int year1 = Integer.parseInt(year);      //0~3번째까지 잘라 year로 지정
            int month1 = Integer.parseInt(month);      //4~5번째까지 잘라 month로 지정
            int day1 = Integer.parseInt(day);      //6~7번째까지 잘라 day로 지정

            if(month1 > 12 || month1 < 1) {                     // month = 12 이상 또는 1이하 일때
                error = -1;
            }
            else if(month1 == 2) {
                if(day1 >28) error = -1;
            }
            else if(month1 == 4 || month1 == 6|| month1 ==9||month1 ==11) {
                if(day1 >30) error = -1;
            }
            else if(day1 <1) error = -1;
            else {
                if(day1 >31) error = -1;
            }
            if(error == 0) {
                System.out.println("#"+i+" "+year+"/"+month+"/"+day);
            }
            else {
                System.out.println(error);
            }
        }
    }
}
