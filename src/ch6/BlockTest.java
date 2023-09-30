package ch6;

import java.sql.SQLOutput;

public class BlockTest {

    static { //클래스 초기화 블럭이 가장 먼저 수행
        System.out.println("static {  }");
    }
    {
        System.out.println("{  }"); //이후 BlockTest 인스턴스가 생성 -> 인스턴스 초기화 블럭 수행
    }
    public BlockTest(){
        System.out.println("생성자"); //생성자 수행
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();

    }
}
