package com.assignment6.ermankurtay;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileServiceS {

    private int sumS;

    public List<Pojo> readS() {
        int numLines = 50;
        sumS = 0;
        List<Pojo> modelS = new ArrayList<>();
        BufferedReader fileReaderS = null;

        try {
            fileReaderS = new BufferedReader(new FileReader("modelS.csv"));
            int lineIndex = 0;

            // Read and discard the header line from each file
            fileReaderS.readLine();

            while (lineIndex < numLines) {
                String lineS = fileReaderS.readLine();
                if (lineS == null) {
                    break; // If modelS.csv reaches the end, exit the loop
                }

                String[] readS = lineS.split(",");

                // Assuming you want to create Pojo objects from each line.
                Pojo newCarS = new Pojo(readS[0], readS[1]);

                // Store these Pojo objects as needed.
                modelS.add(newCarS);
                sumS += newCarS.getSales();


                // Update the sumS with the parsed sales value
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace(); 
        } finally {
            try {
                if (fileReaderS != null) {
                    fileReaderS.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return modelS;
    }

    public int getSumS() {
        return sumS;
    }
}
