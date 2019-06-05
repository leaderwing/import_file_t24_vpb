import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ReadFileNames readFile = new ReadFileNames();
        List<String> listFile = new ArrayList<>();
        listFile = readFile.readListFileNames();
        listFile.forEach(fileName -> {
            Map<String, String> columnMap = new HashMap<>();
            List<List<String>> data = readFile.readDataFile(fileName);
            switch (fileName) {
                case "FX_SPOT.txt" :

            }
        });
        //Read file

        //Map data

        //Insert into data
    }
}
