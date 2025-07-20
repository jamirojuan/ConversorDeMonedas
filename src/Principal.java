import java.security.spec.InvalidKeySpecException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaRatios ratios = new ConsultaRatios();
        RatiosDeConversion ratiosActuales = ratios.ObtieneRatios();
        int opcion = 0;
        while(opcion != 7) {
            Scanner lectura = new Scanner(System.in);
            ConsultaRatios.exhibirMenu();
            opcion = lectura.nextInt();
            switch (opcion){
                case 1:
                    Scanner lectura1 = new Scanner(System.in);
                    System.out.println("Ingresa el monto a convertir");
                    double valor1 = lectura1.nextDouble();
                    double total = ratios
                            .convierteRatios(valor1,ratiosActuales.conversionRates()
                                    .get("ARS"), false  );
                    System.out.println("El total es: " + total );
                    break;
                case 2:
                    Scanner lectura2 = new Scanner(System.in);
                    System.out.println("Ingresa el monto a convertir");
                    double valor2 = 0;
                    try {
                        valor2 = lectura2.nextDouble();
                    } catch (InputMismatchException e) {
                        throw new RuntimeException("ingresa un valor valido, con comas puede ser");
                    }
                    double total2 = ratios
                            .convierteRatios(valor2,ratiosActuales.conversionRates()
                                    .get("ARS"),true);
                    System.out.println("El total es: " + total2 );
                    break;
                case 3:
                    Scanner lectura3 = new Scanner(System.in);
                    System.out.println("Ingresa el monto a convertir");
                    double valor3 = lectura3.nextDouble();
                    double total3 = ratios
                            .convierteRatios(valor3,ratiosActuales.conversionRates()
                                    .get("BRL"), false  );
                    System.out.println("El total es: " + total3 );
                    break;
                case 4:
                    Scanner lectura4 = new Scanner(System.in);
                    System.out.println("Ingresa el monto a convertir");
                    double valor4 = 0;
                    try {
                        valor4 = lectura4.nextDouble();
                    } catch (InputMismatchException e) {
                        throw new RuntimeException("ingresa un valor valido, con comas puede ser");
                    }
                    double total4 = ratios
                            .convierteRatios(valor4,ratiosActuales.conversionRates()
                                    .get("BRL"),true);
                    System.out.println("El total es: " + total4 );
                    break;
                case 5:
                    Scanner lectura5 = new Scanner(System.in);
                    System.out.println("Ingresa el monto a convertir");
                    double valor5 = lectura5.nextDouble();
                    double total5 = ratios
                            .convierteRatios(valor5,ratiosActuales.conversionRates()
                                    .get("COP"), false  );
                    System.out.println("El total es: " + total5 );
                    break;
                case 6:
                    Scanner lectura6 = new Scanner(System.in);
                    System.out.println("Ingresa el monto a convertir");
                    double valor6 = 0;
                    try {
                        valor6 = lectura6.nextDouble();
                    } catch (InputMismatchException e) {
                        throw new RuntimeException("ingresa un valor valido, con comas puede ser");
                    }
                    double total6 = ratios
                            .convierteRatios(valor6,ratiosActuales.conversionRates()
                                    .get("COP"),true);
                    System.out.println("El total es: " + total6 );
                    break;
                default:
                    System.out.println("Conversor de monedas, elija entre opciones 1 a 7");
                    break;

            }
        }

    }
}
