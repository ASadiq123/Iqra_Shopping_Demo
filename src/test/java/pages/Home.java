package pages;

public class Home {
    static String url = "https://uat-iqrashopingdemo.ml/";

    public void openBrowser(){

        System.out.println ("Browser open Successfully");
    }


    public static void main (String[] args){
        String pro_path = System.getProperty ("user.dir");
        System.out.println (pro_path);
        Home h = new Home();
        System.out.println (h.url);
        h.openBrowser();



    }

}


