import java.util.Scanner;
public class firstdegequation {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        c = -b/a;
        if (a==0&&b!=0){
            System.out.println("PT vo nghiem");
        } else if (a==0&&b==0){
            System.out.println("PT co vo so nghiem");
        } else if (a!=0&&b==0){
            System.out.println("PT co nghiem x = 0");
        } else {
            System.out.println("PT co nghiem x:" +c);
        }
    }


}
