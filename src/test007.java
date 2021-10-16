import java.util.Scanner;

public class test007 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 아스키코드 활용하기 2
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [26];
        for(int k=0; k<arr.length; k++) {
            arr[k] = -1;
        }
        String str = sc.nextLine();
        for(int k=0; k<str.length(); k++) {
            char c = str.charAt(k);

            if(arr[c-'a'] == -1) {
                arr[(c-'a')] = k;
            }
        }
        for(int k=0; k<arr.length; k++) {
            System.out.println((char)(k+97)+" : "+arr[k]);
        }
    }
}
