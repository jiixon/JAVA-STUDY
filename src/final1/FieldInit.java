package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; //static 영역에 존재
    final int value = 10; //heap 영역에 존재 + 초깃값 넣었기 때문에 생성자로도 값변경 불가
    //final로 잇느턴스 초기화 하면 -> 같은값으로만 인스턴스 생성 됨 == 메모리 낭비
    //그러므로 공유필드인 static final을 사용한 것!
}
