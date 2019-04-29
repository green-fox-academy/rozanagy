import sun.tools.tree.ArrayAccessExpression;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Logs {
    public static void main(String[] args) {
        Path filePath = Paths.get("assets/logs.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(getIpAddresses(lines));
            System.out.println(calculateRatio(lines));
        } catch (IOException e) {
            System.out.println("File not found.");
        }

    }

    private static List<String> getIpAddresses(List<String> lines) {
        List<String> ipAddresses = new ArrayList<>();
        for(String line : lines) {
            line.split("\\s+");
            String[] splitLine = line.split("\\s+");
            ipAddresses.add(splitLine[5]);
        }
        return ipAddresses;
    }


    private static float calculateRatio(List<String> lines) {
        int getCounter = 0;
        int postCounter = 0;
        for(String line : lines) {
            line.split("\\s+");
            String[] splitLine = line.split("\\s+");
            String sixthColumn = splitLine[6];
            if("GET".equals(sixthColumn)) {
                getCounter++;

            } else if("POST".equals(sixthColumn)) {
                postCounter++;
            }
        }

        return postCounter == 0 ? 0.0f : getCounter / postCounter;
    }

}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.