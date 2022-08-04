import java.util.Scanner;

public class valm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y;
        System.out.print("Digite o 1° numero: ");
        x = in.nextInt();
        System.out.print("Digite o 2° numero: ");
        y = in.nextInt();
        if((x-y) == 0 ){
        System.out.println("Primeiro é maior");
        }else{
            System.out.println("Segundo é maior");
        }

    }
}
