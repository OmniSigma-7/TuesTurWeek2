import java.awt.image.ImagingOpException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class OnyourOwn {
    public static void main(String[] args) throws IOException {
        var Names= new ArrayList<String>();
        var Numbers = new ArrayList<Integer>();
        var filename = "TestData.txt";
        var filepath = Paths.get(filename);
        var allLines = Files.readAllLines(filepath);
        for (var line : allLines){
            var splitline = line.split(",");
           Names.add(splitline[0]);
           Numbers.add(Integer.parseInt(splitline[1]));
        }
        for(int i = 0; i< Names.size(); i++){
            System.out.println("Student" + Names.get(i) + " has Jersey Number"+ Numbers.get(i));
        }

    }
}
