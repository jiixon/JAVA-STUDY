package ch5;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};

        //배열 abc와 num을 붙여서 하나의 배열(result)를 만들기
        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc,0,result,0,abc.length); //abc[0]에서 result[0]으로 abc.length개의 데이터를 복사
        System.arraycopy(num,0,result,abc.length,num.length); //num[0]에서 result(abc복사된 뒤부터)로 데이터 복사
        System.out.println(result);

        //배열 abc을 배열 num의 첫번째 위치부터 배열 abc의 길이만큼
        System.arraycopy(abc,0,num,0,abc.length);
        System.out.println(num);

        //number의 인덱스6 위치에 3개를 복사
        System.arraycopy(abc,0,num,6,3);
        System.out.println(num);
    }
}
