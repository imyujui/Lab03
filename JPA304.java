import java.util.Scanner;
public class JPA304 {
    public static void main(String[] args) {
        double t=0;
        int i=0,count=0;
        Scanner money=new Scanner(System.in);
        while(i!=-1){
            System.out.print("Please enter meal dollars or enter -1 to stop: ");
            int n1=money.nextInt();
            if (n1!=-1){
                t+=n1;
                count+=1;
            }
            i=n1;
        }
        System.out.printf("餐點費用:%.1f ",t);
        System.out.printf("\n%d 到餐點平均費用為: %.2f",count,(t/(count)));
        money.close();

    }
}
