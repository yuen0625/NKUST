import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Objects;



public class youtube {
    String[] dog = new String[3];
    String[] element = new String[3];
try {
        for (int i = 0; i < 3; i++){
//                System.out.println(apple[i]);
            String json = Jsoup.connect("https://www.googleapis.com/youtube/v3/videos?part=snippet&key=AIzaSyDUKYPZIaz4O3t5dyqClNuppGp3V9m-fPI&id=" + apple[i] + "&maxResults=3").ignoreContentType(true).execute().body();
//                  System.out.println(json);

            JSONObject Object = new JSONObject(json);
            var items = Object.getJSONArray("items");
//                System.out.println(items);
            var array = items.getJSONObject(0);
//              System.out.println(array);
            var snippet = array.getJSONObject("snippet");
//                   System.out.println(snippet);
            var publishedAt = snippet.getString("publishedAt");
//                  System.out.println(publishedAt);
            dog[i] = publishedAt;
            var title = snippet.getString("title");
            System.out.println(title);
            element[i]=title;
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}
