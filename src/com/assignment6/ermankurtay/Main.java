package com.assignment6.ermankurtay;

import java.util.List;
import java.util.Map;

public class Main {

	
    public static void main(String[] args) {
    	
    	 FileService3 obj3 = new FileService3();
         List<Pojo> model3 = obj3.read3();

         System.out.println("Model 3 Yearly Sales Report");
         System.out.println("-----------------------");

         Map<Integer, Integer> salesByYear3 = calculateSum.SumByAllYears(model3);
         salesByYear3.forEach((year, sales) -> System.out.println(year + " -> " + sales));

         System.out.println("The best month for Model 3 was: " + calculateSale.bestSale(model3));
         System.out.println("The worst month for Model 3 was: " + calculateSale.worstSale(model3) + "\n");

  
     
         FileServiceS objS = new FileServiceS();
         List<Pojo> modelS = objS.readS();

         System.out.println("Model S Yearly Sales Report");
         System.out.println("-----------------------");

         Map<Integer, Integer> salesByYearS = calculateSum.SumByAllYears(modelS);
         salesByYearS.forEach((year, sales) -> System.out.println(year + " -> " + sales));

         System.out.println("The best month for Model S was: " + calculateSale.bestSale(modelS));
         System.out.println("The worst month for Model S was: " + calculateSale.worstSale(modelS) + "\n");

        
        
         FileServiceX objX = new FileServiceX();
         List<Pojo> modelX = objX.readX();

         System.out.println("Model X Yearly Sales Report");
         System.out.println("-----------------------");

         Map<Integer, Integer> salesByYearX = calculateSum.SumByAllYears(modelX);
         salesByYearX.forEach((year, sales) -> System.out.println(year + " -> " + sales));

         System.out.println("The best month for Model X was: " + calculateSale.bestSale(modelX));
         System.out.println("The worst month for Model X was: " + calculateSale.worstSale(modelX) + "\n");


      
        
      
        
        
        
    }}