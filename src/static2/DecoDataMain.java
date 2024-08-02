package static2;

//import static static2.DecoData.*; -> Alt + Enter

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.staticCall(); //staticValue = 1

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();
        //instanceValue = 1
        //staticValue = 2

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
        /*
        출력
        instanceValue = 1 -> 인스턴스는 다시 생성되어 1
        staticValue = 3 -> 정적변수는 계속해서 +1
        */

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); //권장을 안할 뿐이지 가능은

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
