import java.util.Scanner;

public class nota{

    boolean conf_nota(Double n){
       boolean cf; 
        if (n < 0 || n > 10 ){
            cf = true;
            System.out.println("Número invalido");
        }else{
            cf = false;
        }
        return cf;
    }


    public static void main(String[] args) {
        double x;
        Scanner in = new Scanner(System.in);
        nota Teste = new nota();
        System.out.println("Digite uma nota de 0 a 10");
        do
        x = in.nextDouble();
        while(Teste.conf_nota(x));
    }
}