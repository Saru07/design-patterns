import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream fi = new FileInputStream("./decorator-pattern/file-read/test.txt");
            InputStream bs = new BufferedInputStream(fi);
            InputStream in = new LowerCaseInputStream(bs);
            while ( (c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }    
}
