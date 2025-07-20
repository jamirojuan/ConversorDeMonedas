import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaRatios {
public RatiosDeConversion ObtieneRatios(){
    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/210df791241c50a4379ab7fb/latest/USD");
//    Gson gson = new GsonBuilder()
//            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CASE_WITH_UNDERSCORES)
//            .setPrettyPrinting()
//            .create();
    try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), RatiosDeConversion.class);
    } catch (Exception e) {
        throw new RuntimeException("No se puede encontrar informacion sobre los ratios de conversion");
    }

}

public double convierteRatios(double montoAConvertir, double monedaDesde, boolean aDolar){
    if (aDolar){
        return (1/monedaDesde)* montoAConvertir;
    } else {
    return montoAConvertir * monedaDesde;
    }
}

public static void exhibirMenu(){
    System.out.println("*********************************");
    System.out.println("Sea bienvenido al conversor de moneda");
    System.out.println("1) Dólar ==> Peso argentino");
    System.out.println("2) Peso argentino ==> Dólar");
    System.out.println("3) Dólar ==> Real brasileño");
    System.out.println("4) Real brasileño ==> Dólar");
    System.out.println("5) Dólar ==> Peso colombiano");
    System.out.println("6) Peso colombiano ==> Dólar");
    System.out.println("7) salir");
    System.out.println("Elija una opción Válida");
    System.out.println("*********************************");
}

}
