package ch3;

import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        int num;

        outer:
        while(true){
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
            String input = scanner.nextLine();
            menu=Integer.parseInt(input);

            if(menu==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if(!(1<=menu && menu<=3)){
                System.out.println("메뉴를 잘못 선택하셨습니다.");
                continue;
            }

            for(;;){
                System.out.println("계산할 값을 입력하세요.(계산 종료:0, 전체종료:99)>");
                input=scanner.nextLine();
                num=Integer.parseInt(input);

                if(num==0){
                    break;
                }else if(num==99){
                    break outer;
                }
                switch (menu){
                    case 1:
                        System.out.println("result="+num*num);
                        break;
                    case 2:
                        System.out.println("result="+Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result="+Math.log(num));
                        break;
                }
            }


        }
    }
}
