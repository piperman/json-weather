
import java.io.StringWriter;

import org.json.simple.JSONObject;

class JsonEncoder {
    
    public static void main(String[] args){

        JSONObject jobj = new JSONObject();

        jobj.put("City", "Chicago");
        jobj.put("Temperature", new Integer(84));
        jobj.put("FTemp", new Double(72.10));
        jobj.put("Is_complete", new Boolean(true));

        System.out.println(jobj);
    }
}
