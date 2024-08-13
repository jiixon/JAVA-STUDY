package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        //super() //기본생성자는 호출 불가능 : 이미 사용자 정의 생성자가 있기 떄문
        super(10,20); //두 생성자 중 하나만을 선택해야함.
        System.out.println("ClassC 생성자");
    }
}
