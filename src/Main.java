import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.InputStream;
import java.util.List;

import com.google.gson.*;

public class Main {
    public static void main(String[] args) {
        String[] web = new String[2];
        web[0] = "https://fake-json-api.mock.beeceptor.com/users";
        web[1] = "https://fake-json-api.mock.beeceptor.com/companies";
        Gson gson = new GsonBuilder().create();
        for (int i = 0; i < 2; i++){
            try {
                String jsonstr = getString(web[i]);
                JsonParser parser = new JsonParser();
                JsonElement root = parser.parse(jsonstr);
                JsonArray jsonArray = root.getAsJsonArray();
                if (i == 0) {
                    Users[] users = gson.fromJson(jsonArray, Users[].class);
                    for (Users user : users) {
                        System.out.println("------------------");
                        System.out.println(user.toString());
                        System.out.println("------------------");
                    }
                }
                else {
                    Companies[] companies = gson.fromJson(jsonArray, Companies[].class);
                    for (Companies company : companies){
                        System.out.println("------------------");
                        System.out.println(company.toString());
                        System.out.println("------------------");
                    }
                }

            } catch (IOException e) {
                System.err.print(e.getMessage());
            }
        }
    }

    private static String getString(String web) throws IOException {
        URL u = new URL(web);
        InputStream in = u.openStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder jsonb = new StringBuilder();
        String theLine;
        while ((theLine = br.readLine()) != null) {
            jsonb.append(theLine);
        }
        br.close();
        String jsonstr = jsonb.toString();
        return jsonstr;
    }
}