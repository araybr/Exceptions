import java.util.InputMismatchException;
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int div,x,y;

        try{
            System.out.print("Introduce el numerador: ");
            x = scanner.nextInt();
            System.out.print("Introduce el denominador: ");
            y = scanner.nextInt();
            div = x / y;
            System.out.println("Resultado: " + div);
        } catch (ArithmeticException e){
            System.err.println("Error producido: " + e);
        } catch (InputMismatchException e){
            System.err.println("Vaya con las letras..." + e);
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("FIN");
        }


    }
}