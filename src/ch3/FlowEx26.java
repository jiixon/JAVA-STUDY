package ch3;

public class FlowEx26 {
    public static void main(String[] args) {
       int sum=0, i=0;

       while((sum += ++i)<=100){ //i의 값을 1 증가시켜 sum에 누적하며 sum이 100보다 작거나 같을 떄 까지만
           System.out.printf("%d - %d%n",i,sum);
       }
    }
}
