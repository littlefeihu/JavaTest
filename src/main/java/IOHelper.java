import java.io.*;

public class IOHelper {

    public static  void InputStreamWrite() throws IOException {
        InputStream in=new FileInputStream("D:\\1.txt") ;
        OutputStream out=new FileOutputStream("D:\\2.txt");
        byte[] bytes=new byte[2048];
        int readlength=-1;
        while ((readlength=in.read(bytes,0,bytes.length))!=-1)
        {
            String str=new String(bytes,0,readlength,"GBK");
            System.out.print(str);
            out.write(bytes,0,readlength);
        }
        in.close();
    }
}
