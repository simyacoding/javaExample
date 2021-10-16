import java.util.Scanner;

public class test008 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 아스키 코드 활용하기 3
        int arr[] = new int[26];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for(int k=0; k<input.length(); k++) {
            //input= input.toUpperCase(); == 소문자 -> 대문자로 변경 코드
            char c = input.charAt(k);
            if((int) c>=97 && (int) c<=122) {
                arr[c-'a']++;
            }
            else if((int) c>=65 && (int) c<=90) {
                arr[c-'A']++;
            }

        }

        int overlap = 0;			// 중복 체크
        int max = arr[0];			// 최대값
        char alp = 65;				// 알파벳

        for(int k=0; k<arr.length; k++) {
            if(max<arr[k]) {
                max = arr[k];
                int a = (int) alp +k;
                alp = (char) a;
            }
            else if(max !=0 && arr[k] !=0){
                if(k==0) {
                    continue;
                }
                else if(max == arr[k]){
                    overlap++;
                }
            }
            System.out.println(overlap);
        }

        if(overlap == 0) {
            System.out.println(alp+" : "+max);
        }
        else {
            System.out.println("?");
        }
    }

}
