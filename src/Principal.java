import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaRatios ratios = new ConsultaRatios();
        RatiosDeConversion ratiosActuales = ratios.ObtieneRatios();
        int opcion = 0;
        DecimalFormat df = new DecimalFormat("#.00");
        while(opcion != 7) {
            Scanner lectura = new Scanner(System.in);
            ConsultaRatios.exhibirMenu();
            String mensaje = "Ingresa el monto a convertir";
            opcion = (int) (ConsultaRatios.leerDoubleSeguro(lectura, ""));
            //opcion = lectura.nextInt();
            switch (opcion){
                case 1:
                    String nacionalidadHacia = "ARS";
                    Scanner lectura1 = new Scanner(System.in);
                    double valor1 = ConsultaRatios.leerDoubleSeguro(lectura1, mensaje );
                    double total = ratios
                            .convierteRatios(valor1,ratiosActuales.conversionRates()
                                    .get(nacionalidadHacia), false  );
                    System.out.println("El total es: " + df.format(total) + " " + nacionalidadHacia);
                    break;
                case 2:
                    String nacionalidadHacia2 = "USD", nacionalidadDe2 = "ARS";
                    Scanner lectura2 = new Scanner(System.in);
                    double valor2 = ConsultaRatios.leerDoubleSeguro(lectura2, mensaje );
                    double total2 = ratios
                            .convierteRatios(valor2,ratiosActuales.conversionRates()
                                    .get(nacionalidadDe2),true);
                    System.out.println("El total es: " + df.format(total2) + " " + nacionalidadHacia2);
                    break;
                case 3:
                    String nacionalidadHacia3 = "BRL";
                    Scanner lectura3 = new Scanner(System.in);
                    double valor3 = ConsultaRatios.leerDoubleSeguro(lectura3, mensaje );
                    double total3 = ratios
                            .convierteRatios(valor3,ratiosActuales.conversionRates()
                                    .get(nacionalidadHacia3), false  );
                    System.out.println("El total es: " + df.format(total3) + " " + nacionalidadHacia3 );
                    break;
                case 4:
                    String nacionalidadDe4 = "BRL", nacionalidadHacia4 = "USD";
                    Scanner lectura4 = new Scanner(System.in);
                    double valor4 = ConsultaRatios.leerDoubleSeguro(lectura4, mensaje );
                    double total4 = ratios
                            .convierteRatios(valor4,ratiosActuales.conversionRates()
                                    .get(nacionalidadDe4),true);
                    System.out.println("El total es: " + df.format(total4)  + " " + nacionalidadHacia4);
                    break;
                case 5:
                    String nacionalidadDe5 = "COP";
                    Scanner lectura5 = new Scanner(System.in);
                    double valor5 = ConsultaRatios.leerDoubleSeguro(lectura5, mensaje );
                    double total5 = ratios
                            .convierteRatios(valor5,ratiosActuales.conversionRates()
                                    .get(nacionalidadDe5), false  );
                    System.out.println("El total es: " + df.format(total5) + " " + nacionalidadDe5);
                    break;
                case 6:
                    String nacionalidadHacia6 = "USD", nacionalidadDe6 = "COP";
                    Scanner lectura6 = new Scanner(System.in);
                    double valor6 = ConsultaRatios.leerDoubleSeguro(lectura6, mensaje );
                    double total6 = ratios
                            .convierteRatios(valor6,ratiosActuales.conversionRates()
                                    .get(nacionalidadDe6),true);
                    System.out.println("El total es: " + df.format(total6) + " " + nacionalidadHacia6);
                    break;
                default:
                    System.out.println("Conversor de monedas, elija entre opciones 1 a 7");
                    break;

            }
        }

    }
}
