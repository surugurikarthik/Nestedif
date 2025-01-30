import java.util.Scanner;

public class NestedIfLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number = ");
        int y = sc.nextInt();
        System.out.print("Enter Third Number = ");
        int z = sc.nextInt();
        if(x>=y){
            if(x>=z){
                System.out.println("x is greatest");
            }else{
                System.out.println("z is greatest");
            }
        }else{
            if(y>=z){
                System.out.println("y is greatest");

            }else{
                System.out.println("z is greatest");
            }
        }
        sc.close();

        }

    }
    

