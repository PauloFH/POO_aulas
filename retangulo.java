import java.util.Scanner;
public class retangulo{

 double Area(double x, double y ){
        return (x*y);
    }

 double Perimetro(double x, double y){
    return((2*x)+(2*y));
    }


    public static void main(String[] args) {
        
        double x,y,area, perim;
        Scanner in = new Scanner( System.in );
            retangulo ret = new retangulo();
        System.out.print("Digite os lados do retângulo \n");
        System.out.print("Lado 1: ");
        x= in.nextDouble();
        System.out.print("Lado 2: ");
        y=in.nextDouble();
        area = ret.Area(x,y);
        perim = ret.Perimetro(x, y);
        System.out.println("A area do rentangulo é: "+area);
        System.out.println("A area do perimetro é: "+perim);
    }

}


