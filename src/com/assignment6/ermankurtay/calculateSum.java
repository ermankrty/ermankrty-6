package com.assignment6.ermankurtay;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class calculateSum {

    public static int SumbyYear(List<Pojo> carSS, int year) {
        List<Pojo> carSSForYear = carSS.stream()
                .filter(carS -> carS.getDate().getYear() == year)
                .collect(Collectors.toList());

        int sumSales = carSSForYear.stream()
                .mapToInt(carS -> Integer.valueOf(carS.getSales()))
                .sum();
        
        

        return sumSales;
    }
    
    public static Map<Integer, Integer> SumByAllYears(List<Pojo> carSS) {
        return carSS.stream()
                .collect(Collectors.groupingBy(
                        carS -> carS.getDate().getYear(),
                        Collectors.summingInt(Pojo::getSales)
                ));
}}
