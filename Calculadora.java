import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) {
   try (Scanner scanner = new Scanner(System.in)) {
    System.out.println("ingrese su año de nacimiento: ");
       int nacimiento = scanner.nextInt();
       System.out.println("ingrese el año actual: ");
       int actual = scanner.nextInt();
    
    int edad = calcularedad(nacimiento, actual);
    
    System.out.println("Tu edad es: " + edad + " años");
   }
}
public static int calcularedad(int nacimiento, int actual){
    int edad = actual - nacimiento;
    return edad;
}
}