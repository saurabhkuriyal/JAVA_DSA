import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<b;i++){
            if(i%2==0){
            System.out.println("even ="+i);
        }
        else
        System.out.println("odd ="+i);
    }
    }
}
