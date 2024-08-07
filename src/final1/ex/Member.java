package final1.ex;

public class Member {
    //고객의 id를 변경하면 문제가 발생할 수 있기에 -> final로 선언 후 생성자로 값 할당
    private final String id; // final 키워드 사용
    private String name;

    public Member(String id, String name) { //생성자
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name){
        //this.id = id; // 컴파일 오류 발생
        this.name = name;
    }

    public void print(){
        System.out.println("id: " + id + ", name: " + name);
    }
}
