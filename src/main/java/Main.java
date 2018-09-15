import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) {


        XMLHelper.ParseXml();

        //SqlHelper.Conn();

       // System.out.print("start download");
        //NetHelper.DownloadImg("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1536857673789&di=28c21cd03fa48bf6d5126391d8249de2&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fc75c10385343fbf2618015f7ba7eca8064388fb2.jpg");

       // System.out.print("end  download");

      System.out.print("type a char:");
        char i= 0;
        try {
            i = (char)System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("char you typed:"+i);
    }
}
