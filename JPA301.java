import java.util.Scanner;
public class JPA301 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Input:");
        int a=num.nextInt();
        int number=0;
        for(int i=1;i<=a;i++){
            number+=i;
        }
        System.out.printf("1+...+ %d = %d",a,number);
        num.close();
    }
}
