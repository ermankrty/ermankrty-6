package com.assignment6.ermankurtay;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileServiceX {

    private int sumX;

    public List<Pojo> readX() {
        int numLines = 50;
        sumX = 0;
        List<Pojo> modelX = new ArrayList<>();
        BufferedReader fileReaderX = null;

        try {
            fileReaderX = new BufferedReader(new FileReader("modelX.csv"));
            int lineIndex = 0;

            // Read and discard the header line from each file
            fileReaderX.readLine();

            while (lineIndex < numLines) {
                String lineX = fileReaderX.readLine();
                if (lineX == null) {
                    break; // If modelS.csv reaches the end, exit the loop
                }

                String[] readX = lineX.split(",");

                // Assuming you want to create Pojo objects from each line.
                Pojo newCarX = new Pojo(readX[0], readX[1]);

                // Store these Pojo objects as needed.
                modelX.add(newCarX);

                // Update the sumS with the parsed sales value
                sumX += newCarX.getSales();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReaderX != null) {
                    fileReaderX.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return modelX;
    }

    public int getSumX() {
        return sumX;
    }
}
