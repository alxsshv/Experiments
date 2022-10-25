import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.net.URIBuilder;

import java.util.List;
import java.util.Scanner;

public class HTTPGetter {
    private static final String USER_AGENT = "Mozilla/5.0";
    private static String rows = "100 "; // количество элементов на страницу

    public List<Element> sendGet(String searchString, String year) throws Exception {

        String url = "https://fgis.gost.ru/fundmetrology/eapi/vri/";
        URIBuilder builder = new URIBuilder(url);
        builder.addParameter("year", year);
        builder.addParameter("rows", rows);
        builder.addParameter("search", searchString);
        System.out.println(builder);


        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(builder.toString());
        request.setHeader("User-Agent", USER_AGENT);


        CloseableHttpResponse response = client.execute(request);
        System.out.println("Ответ " + response.getCode());
        Scanner sc = new Scanner(response.getEntity().getContent());




        List<Element> resp =  Reader.getElementFromJson(sc.nextLine());
        return resp;
    }


}
