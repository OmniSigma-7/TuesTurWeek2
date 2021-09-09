import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example4 {
    public static void main(String[] args) throws IOException{
        var fileName= "Students";
        var allLines = Files.readString(Paths.get(fileName));
        var listOfnames = allLines.split("/n");
        for (String name: listOfnames){
            System.out.println(name);

        }
    }
}
