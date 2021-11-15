package com.brdg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IndianCensusAnalyzer {

    /*
Method to analyse data from the indian census comma separated file
*/
    public void analyseCensusData() throws FileNotFoundException {
        String path = "C:\\Users\\Admin\\IdeaProjects\\IndianCensusAnalyzer\\src\\main\\resources\\state.csv";
        String line = "";
        String splits = ",";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(splits);
                System.out.println("State: " + data[0] + ", Population: " + data[1] + ", Area: " + data[2] + ", Density: " + data[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println(" Welcome to Indian State Census Analyser");
        IndianCensusAnalyzer indianCensusAnalyzer = new IndianCensusAnalyzer();
        indianCensusAnalyzer.analyseCensusData();

    }
}
