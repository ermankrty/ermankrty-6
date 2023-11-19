package com.assignment6.ermankurtay;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService3 {

    private int sum3;

    public List<Pojo> read3() {
        int numLines = 50;
        sum3 = 0;
        List<Pojo> model3 = new ArrayList<>();
        BufferedReader fileReader3 = null;

        try {
            fileReader3 = new BufferedReader(new FileReader("model3.csv"));
            int lineIndex = 1;

            // Read and discard the header line from each file
            fileReader3.readLine();

            while (lineIndex < numLines) {
                String line3 = fileReader3.readLine();
                if (line3 == null) {
                    break; // If modelS.csv reaches the end, exit the loop
                }

                String[] read3 = line3.split(",");

                // Assuming you want to create Pojo objects from each line.
                Pojo newCar3 = new Pojo(read3[0], read3[1]);

                // Store these Pojo objects as needed.
                model3.add(newCar3);
                sum3 += newCar3.getSales();


                // Update the sumS with the parsed sales value
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader3 != null) {
                    fileReader3.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return model3;
    }

    public int getSum3() {
        return sum3;
    }
}
