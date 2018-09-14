import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetHelper {

    public  static  void DownloadImg(String imgurl)
    {

        int bytesum=0;
        int byteread=0;
        try {

            URL url=new URL(imgurl);
            URLConnection conn=url.openConnection();
            InputStream instream=conn.getInputStream();
            FileOutputStream fs=new FileOutputStream("D:/abc.png",false);
            byte[] buffer=new byte[1024];
            int length;
            while ((byteread=instream.read(buffer))!=-1)
            {
                bytesum+=byteread;
                System.out.println(bytesum);
                fs.write(buffer,0,byteread);

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
