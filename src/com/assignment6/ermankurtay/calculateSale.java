package com.assignment6.ermankurtay;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class calculateSale {

    public static String bestSale(List<Pojo> model) {
        int bestMonthSales = 0;
        String bestMonth = null;
        int bestYearSales = 0;

        for (Pojo pojo : model) {
            if (pojo.getSales() > bestMonthSales) {
                bestMonthSales = pojo.getSales();
                bestMonth = pojo.getDate().format(DateTimeFormatter.ofPattern("MM"));
                bestYearSales = pojo.getDate().getYear();
            }
        }

        return bestYearSales + "-" + bestMonth;
    }
    
    public static String worstSale(List<Pojo> model) {
    	
    	int worstMonthSales = Integer.MAX_VALUE;
    	String worstMonth = null;
    	int worstYearSales = 0;
    	
    	for(Pojo pojo : model) {
    		if(pojo.getSales() < worstMonthSales) {
    			
    			worstMonthSales = pojo.getSales();
    			worstMonth = pojo.getDate().format(DateTimeFormatter.ofPattern("MM"));
    			worstYearSales = pojo.getDate().getYear();
    		}
    	}
        return worstYearSales + "-" + worstMonth;

    }
}