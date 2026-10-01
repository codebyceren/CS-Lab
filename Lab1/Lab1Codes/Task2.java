package Lab1.Lab1Codes;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Task2 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(
            new FileReader("Lab1/scores.txt"))){
            

            ArrayList<Double> scores = new ArrayList<>();
            while(br.ready()) {
                String line = br.readLine().trim();
                if(!line.isEmpty()) {
                    double score = Double.parseDouble(line);
                    scores.add(score);
                }
                
            }
            if(scores.isEmpty()) {
                System.out.println("No scores found in the file.");
                return;
            }
            double sum = 0;
            for( double score : scores) {
                sum += score;
               
            }
            double average = sum / scores.size();
            System.out.println("Average of scores: " + average);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing score: " + e.getMessage());
        }

    }
}