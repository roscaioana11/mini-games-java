package exercises.codingcontest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class ExoplanetFinder {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\java\\cloudflighttraining\\codingcontest\\resources\\level1-3.in";
        String fileContents = Files.readAllLines(Path.of(path)).get(0);
        String[] data = fileContents.split(" ");

        int planetCount = Integer.parseInt(data[0]);
        int currentDataIndex = 0;
        for(int i = 0; i < planetCount; i++){
            currentDataIndex++;

            String planetName = data[currentDataIndex];
            System.out.print(planetName + " ");

            currentDataIndex++;

            int lightCurveCount = Integer.parseInt(data[currentDataIndex]);
            int count = 0;
            String currentNumber = null;
            for(int j = 0; j < lightCurveCount; j++){
                currentDataIndex++;
                if(currentNumber == null){
                    currentNumber = data[currentDataIndex];
                }else if (!data[currentDataIndex].equals(data[currentDataIndex - 1])){
                    System.out.print(currentNumber + " ");
                    System.out.print(count + " ");

                    currentNumber = data[currentDataIndex];
                    count = 0;
                }
                count++;
            }
            System.out.print(currentNumber + " ");
            System.out.print(count + " ");
        }
    }
}
