package Overriding.BrowserPractice;

public class FireFoxBrowser  extends  WebDriver{
    @Override
    public String getUrl(String Url) {

        System.out.println("Opening " + Url);


        return Url;

    }

    @Override
    public void close() {

        System.out.println("Closing");


    }
}
