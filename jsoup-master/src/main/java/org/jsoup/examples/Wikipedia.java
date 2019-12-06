package org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * A simple example, used on the jsoup website.
 */
public class Wikipedia {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://34.84.237.242:8080/test3").get();
        //log(doc.title());

        // Elements newsHeadlines = doc.select("#mp-itn b a");
        Elements newsHeadlines = doc.select("h1");
        // Make markdown method.
        doc.markdown("cookietest.md");
        for (Element headline : newsHeadlines) {
            log("%s %s\n\t%s", headline.tag().toString(), headline.attr("title"), headline.absUrl("href"));
        }


        for(Element element: newsHeadlines) {
            System.out.println(element.text());
        }


    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}
