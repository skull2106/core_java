import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;  
public class JSOUP{  
    public static void main( String[] args ) throws IOException{  
    	 Document doc = Jsoup.connect("http://ceg.rajasthan.gov.in/").get();  
         Elements tr = doc.select("span#Label1");
         Elements links = tr.select("a");
         for (Element link : links) {  
             System.out.println("\nlink : " + link.attr("href"));  
             System.out.println("text : " + link.text());  
    }
    }
}
  