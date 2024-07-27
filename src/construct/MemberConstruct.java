package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 오버로딩
    MemberConstruct(String name, int age){
        //this()는 자신의 생성자 호출, 생성자 코드에서 첫줄에 사용되어야함(-> 아닐시 컴파일 오류)
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
