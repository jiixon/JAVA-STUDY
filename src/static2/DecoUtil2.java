package static2;

public class DecoUtil2 {
    //정적메서드 - 정적변수처럼 인스턴스 생성없이 클래스명을 통해서 호출이 가능
    public static String deco(String str){ //정적 메서드 혹은 클래스 메서드
        String result = "*" + str + "*";
        return result;
    }

    //마찬가지로, static 붙지 않은 메서드 -> 인스턴스 메서드
}
