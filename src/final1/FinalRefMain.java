package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //참조형 변수 final
        //data = new Data(); //final 변경 불가 컴파일 오류

        //참조 대상의 값은 변경 가능
        data.value = 10; //value는 final이 아니므로 변경 가능
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
