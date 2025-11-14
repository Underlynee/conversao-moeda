package convertordemoedas;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conversao {

    public double converterMoedas(String moedaOrigem, String moedaDestino) throws IOException {


        String url_str = "https://v6.exchangerate-api.com/v6/6d006784ed856445f0cfe4e9/pair/"
                + moedaOrigem + "/" + moedaDestino;

        URL url = new URL(url_str);

        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();


        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();
        double taxaDeConversao = jsonobj.get("conversion_rate").getAsDouble();

        return taxaDeConversao;

    }


}
