package final1;

public class ConstructInit {
    final int value;

    //생성자를 통해 값 주입 -> final이라서 이 이외에 값 변경 불가능
    public ConstructInit(int value) {
        this.value = value;
    }
}
