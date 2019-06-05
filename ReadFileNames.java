import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadFileNames {
    public List<List<String>> readDataFile (String dealType) {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("A://t24/"+dealType))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("#");
                records.add(Arrays.asList(values));
            }
        }catch (
                IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return  records;
    }

    public List<String> readListFileNames() {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("A://t24//filename.txt"))) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
                result.add(line);
            }
        } catch (
                IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println(sb);
        return result;
    }
}
