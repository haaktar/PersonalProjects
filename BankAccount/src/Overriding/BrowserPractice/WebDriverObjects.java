package Overriding.BrowserPractice;

public class WebDriverObjects {

    public static void main(String[] args) {
        ChromeBrowser chromeBrowser = new ChromeBrowser();

        chromeBrowser.getUrl("www.twitter.com");
        chromeBrowser.close();
    }


}
