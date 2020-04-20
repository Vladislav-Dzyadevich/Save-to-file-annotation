import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "D:\\temp\\file.txt")
public class Container {
    String str = "Hello world";
    @Saver
    public  void save(String path) throws IOException{
        FileWriter fileWriter = new FileWriter(path);
        try{
            fileWriter.write(str);
        }finally {
            fileWriter.close();
        }
    }
}
