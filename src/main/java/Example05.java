import java.util.InputMismatchException;
import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int div,x,y;
        int[] vector = {0,1,2};

        try{
            System.out.print("Introduce el numerador: ");
            x = scanner.nextInt();
            System.out.print("Introduce el denominador: ");
            y = scanner.nextInt();
            div = x / y;
            System.out.println("Resultado: " + div);

            //pedir consultar un elemento del vector
            //capturar la excepción si está fuera de rango
            System.out.print("Introduce la posición en el vector: ");
            int posicion = scanner.nextInt();
            System.out.println("Elemento es: " + vector[posicion]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Acceso incorrecto al array: " + e);
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