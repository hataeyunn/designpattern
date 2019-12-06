package org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class testcase {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://webglue.me").get();
        // log(doc.title());

        Elements newsHeadlines = doc.select(".logo-text");
        for (Element headline : newsHeadlines) {
            log(headline.tagName());
        }
    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}
