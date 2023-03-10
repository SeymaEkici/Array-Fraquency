import java.util.HashMap;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] series = {10, 20, 20, 10, 10, 20, 5, 20};

        // Creating a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Counting the frequency of each element in the array
        for (int i = 0; i < series.length; i++) {
            int count = frequencyMap.getOrDefault(series[i], 0);
            frequencyMap.put(series[i], count + 1);
        }

        // Displaying the frequency of each element in the array
        for (int i : frequencyMap.keySet()) {
            System.out.printf("The number %d was repeated %d times.\n", i, frequencyMap.get(i));
        }
    }
}
