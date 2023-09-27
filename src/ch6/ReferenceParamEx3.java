package ch6;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum="+sumArr(arr));
    }

    static void printArr(int[] arr){
        System.out.printf("[");
        for(int i:arr){
            System.out.print(i+",");
        }
        System.out.println("]");
    }

    static int sumArr(int[] arr){
        int sum=0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
