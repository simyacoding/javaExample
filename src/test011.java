import java.util.Scanner;

public class test011 {
    public static void main(String[] args) {
        // 아스키코드 활용 6
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        int result = 0;
        for (int i = 0; i < testCase; i++) {
            String input = sc.nextLine();
            boolean[] arr = new boolean[26];
            char curChar = input.charAt(0);
            arr[curChar - 97] = true;

            int count = 0;                                                        // 중복 체크 하기위한 변수 count
            for (int k = 0; k < input.length() - 1; k++) {                                // input(입력값)의 길이 -1 만큼 반복을 한다.
                char curChar1 = input.charAt(k);                                // 입력값의 k번째를 char로 변환
                char curChar2 = input.charAt(k + 1);                                // 입력값의 (k+1)번째를 char로 변환
                if (curChar - 97 != curChar1 - 97) {                                    // curChar1(입력값의 k번째)값이 0 = 'a'가 아니면
                    arr[curChar1 - 97] = true;                                    // arr[curChar1(입력값의 k번째)]값에 true 값을 입력
                }
                if (curChar1 - 97 != curChar2 - 97 && arr[curChar2 - 97] == true) {    // curChar1와 curChar2이 서로 같지 문자가 아니고 curChar2가 이미 true(값을 입력 받으)면
                    count++;                                                    // count를 증가시킨다
                }
            }
            if (count == 0) result++;                                            // count가 0이면(중복이 없으면) result 값을 증가시킨다
        }
        System.out.println(result);
        sc.close();

    }
}