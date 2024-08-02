package static2;

public class ValueDataMain {
    public static void main(String[] args) { // 가장 대표적인 인스턴스 없이 실행되는 메서드 -> main 메서드
        ValueData valueData = new ValueData();
        add(valueData); //정적 메서드에서는 정적 메서드만 호출 가능

    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
