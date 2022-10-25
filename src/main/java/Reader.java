import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static List<Element> getElementFromJson(String s){

        List<Element> resultElements = new ArrayList<>();
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonData = (JSONObject) parser.parse((s));

            JSONObject result = (JSONObject) jsonData.get("result");
            Long count = (Long) result.get("count");

            JSONArray items = (JSONArray) result.get("items");
            for (int i = 0; i < items.size(); i++){
                JSONObject item = (JSONObject) items.get(i);
                resultElements.add(getElementFromItem(item));
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return resultElements;
    }

    private static Element getElementFromItem(JSONObject item){
        Element element = new Element();
        element.setVri_id(item.get("vri_id").toString());
        element.setOrg_title(item.get("org_title").toString());
        element.setMit_number(item.get("mit_number").toString());
        element.setMit_title(item.get("mit_title").toString());
        element.setMit_notation(item.get("mit_notation").toString());
        element.setMi_modification(item.get("mi_modification").toString());
        element.setMi_number(item.get("mi_number").toString());
        element.setVerification_date(item.get("verification_date").toString());
        element.setValid_date(item.get("valid_date").toString());
        element.setResult_docnum(item.get("result_docnum").toString());
        element.setApplicability((boolean) item.get("applicability"));
        return element;
    }
}
