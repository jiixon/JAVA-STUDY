package ch5;

public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i=0; i<src.length(); i++){
            char ch = src.charAt(i); //charAt(int index) => 문자열에서 해당 위치에 있는 문자를 반환
            System.out.println("src.charAt("+i+"):"+ch);
        }

        //String을 char[]로 변환
        char[] chArr = src.toCharArray();

        //char배열(char[])을 출력
        System.out.println(chArr);

        //char배열 -> String
        char[] cArr = {'A','B','C'};
        String str = new String(chArr);
        System.out.println(str);
    }
}
