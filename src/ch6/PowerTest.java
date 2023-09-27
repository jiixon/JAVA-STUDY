package ch6;

import java.util.Scanner;

public class PowerTest {
    public static void main(String[] args) {
        int x, n;
        long result =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("x를 입력하세요(x^1, x^2, ..:");
        x=scanner.nextInt();
        System.out.println("n를 입력하세요(제곱수):");
        n=scanner.nextInt();

        for(int i=1; i<=n; i++){
            result += power(x,i);
        }
        System.out.printf("%d의 %d제곱까지의 합: %d%n",x,n,result);
    }
    static long power(int x, int n){
        if(n==1) return x;
        return x*power(x,n-1);
    }
}
