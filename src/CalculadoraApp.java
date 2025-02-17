import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            //Mostramos el Menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion,consola);
                } else if (operacion == 5) {//Salir
                    System.out.println("Hasta Pronto...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                System.out.println();
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }//fin while
    }

    private  static void mostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Operacion a realizar? ");
    }

    private static void ejecutarOperacion(int operacion,Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Integer.parseInt(consola.nextLine());
        int resultado;
        switch (operacion) {
            case 1 -> {//Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> {//Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> {//Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicacion: " + resultado);
            }
            case 4 -> {//Division
                resultado = operando1 / operando2;
                System.out.println("Resultado Division: " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);

        }
    }

}
