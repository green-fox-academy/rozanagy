import sun.tools.tree.ArrayAccessExpression;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Logs {
    public static void main(String[] args) {
        Path filePath = Paths.get("assets/log.txt");

        try {
            System.out.println(getIpAddresses(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static List<String> getIpAddresses(Path filePath) throws IOException {
        List<String> ipAddresses = new ArrayList<>();
        List<String> lines = Files.readAllLines(filePath);
        for(String line : lines) {
            line.split("\\s+");
            String[] splitLine = line.split("\\s+");
            ipAddresses.add(splitLine[5]);

        }



        return ipAddresses;

    }


    private static float ratioMethod(Path filePath) {
        return 0.0f;


    }


}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.