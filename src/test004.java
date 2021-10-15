public class test004 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 유니코드 값 확인
        String str = "Hi, my name is Samuel. My git is Samuel-Lee-Kr. Thank you";
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            char c = str.charAt(i);
            //소문자 조건문
            if ((int) c >= 97 && (int) c <= 122) {
                arr[(int) c - 97]++;
            }
            //대문자 조건문
            if ((int) c == 65 && (int) c <= 90) {
                arr[(int) c - 65]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int a = 97 + i;
            System.out.println((char) a + " : " + arr[i]);
        }
    }
}
