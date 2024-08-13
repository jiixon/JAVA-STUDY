package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a){
        super(); //기본생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b){
        super(); //기본생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a + ", b=" + b);
    }

    //1. super()는 부모클래스의 생성자 호출
    //2. 상속을 받으면 생성자에 반드시 부모 생성자를 호출해야함. (3번의 경우 이미 호출된거임)
    //3. 이때 부모의 생성자가 기본생성자일경우 super()는 생략 가능함. == ClassA(부모)를 상속받은 ClassB(자식)
    //4. 부모클래스의 생성자가 기본생성자가 아닐 경우 생략 불가능함. == ClassB(부모)를 상속받은 ClassC(자식)
}
