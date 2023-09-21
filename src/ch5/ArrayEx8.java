package ch5;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45]; //45개의 정수값을 저장하기 위한 배열 생성

        //배열의 각 요소에 1~45의 값을 저장
        for (int i=0; i<ball.length; i++){
            ball[i]=i+1;
        }

        int j=0;
        int temp=0;

        //배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        for(int i=0; i<6; i++){
            j=(int)(Math.random()*45); //0~44범위의 임의의 값을 얻는다.
            temp = ball[i];
            ball[i]=ball[j];
            ball[j]=temp;
        }

        //출력
        for (int i=0; i<6; i++){
            System.out.printf("ball[%d]=%d%n",i,ball[i]);
        }
    }
}
