package static1;

public class Data3 { //아래 두개는 모두 멤버변수(필드)
    public String name; //인스턴스 변수 (인스턴스 생성할 때마다 만들어짐)
    public static int count; //정적변수 혹은 클래스변수 (자바 실행시에 하나 만들어짐)
    public Data3(String name) {
        this.name = name;
        count++;
    }
}
