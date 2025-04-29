import java.util.Scanner;

public class Transferencia {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese su nombre por favor ");       
        int monto = 500000;
        System.out.println("Su saldo es de "+monto+" pesos");
        System.out.println("Ingrese el nombre de el destinatario: ");       
        System.out.println("Ingrese la cantidad a transferir: ");       
        int cantidad = scanner.nextInt();
        scanner.close();

        int dinero = resta(monto, cantidad);
        if (dinero < 0) {
            System.out.println("El saldo es insuficiente, por lo que la transaccion no fue exitosa");         
        }else{
            System.out.println("La transaccion fue exitosa, su saldo restante es de " + dinero + " pesos");
        }
    }

    public static int resta(int monto, int cantidad){
     int dinero = monto - cantidad;
     return dinero;

    }
    
}
