import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter Array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i<j){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
            System.out.println(a[i]);
        }
    }
}
