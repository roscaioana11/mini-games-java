package exercises.codingcontest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExoplanetFinderTransit {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\java\\cloudflighttraining\\codingcontest\\resources\\level1-5.in";
        String fileContents = Files.readAllLines(Path.of(path)).get(0);
        String[] data = fileContents.split(" ");

        int planetCount = Integer.parseInt(data[0]);
        int currentDataIndex = 0;
        for(int i = 0; i < planetCount; i++){
            HashMap<Integer, LightCurveElement> lightCurveArray = new HashMap<>();

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
                    lightCurveArray.put(count, new LightCurveElement(currentNumber, 0));
                }else if (!data[currentDataIndex].equals(data[currentDataIndex - 1])){
//                    System.out.print(currentNumber + " ");
//                    System.out.print(count + " ");

                    currentNumber = data[currentDataIndex];
                    count++;
                    lightCurveArray.put(count, new LightCurveElement(currentNumber, 0));
                }
                lightCurveArray.get(count).count++;
            }
//            System.out.print(currentNumber + " ");
//            System.out.print(count + " ");

            HashMap<String, Integer> lightCurveCounter = new HashMap<>();
            lightCurveArray.values().stream()
                    .forEach(element -> {
                        if (lightCurveCounter.containsKey(element.value)) {
                            lightCurveCounter.put(element.value,lightCurveCounter.get(element.value) + element.count);
                        } else {
                            lightCurveCounter.put(element.value,element.count);
                        }
                    });

            String averageElement = lightCurveCounter.values()
                    .stream()
                    .max(Integer::compare)
                    .map(max -> lightCurveCounter.entrySet().stream()
                            .filter(entry -> entry.getValue() == max)
                            .findFirst()
                            .get())
                    .get()
                    .getKey();

            int max = lightCurveArray.values()
                    .stream()
                    .filter(element -> Integer.parseInt(element.value) >= Integer.parseInt(averageElement))
                    .map(element -> element.count)
                    .max(Integer::compare)
                    .get();
//            System.out.println(max);
            int defaultPeriods = (int) lightCurveArray.values()
                    .stream()
                    .filter(element -> Integer.parseInt(element.value) >= Integer.parseInt(averageElement))
                    .count();

            int eventPeriods = (int) lightCurveArray.values()
                    .stream()
                    .filter(element -> Integer.parseInt(element.value) <=
                    ((double) Integer.parseInt(averageElement) * 0.995) &&
                    element.count <= 15)
                    .collect(Collectors.groupingBy(element -> element.value))
                    .entrySet()
                    .stream()
                    .count();

            boolean candidate = eventPeriods == 1;
            if(candidate){
                System.out.print("YES ");
            }else{
                System.out.print("NO ");
            }
        }
    }
}

