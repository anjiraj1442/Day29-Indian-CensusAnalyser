package com.brdg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IndianCensusAnalyzerTest {
    @Test
    void checkForExactNumberOfStates() throws IOException {
        List<String[]> myList = new ArrayList<>();
        String path = "C:\\Users\\Admin\\IdeaProjects\\IndianCensusAnalyzer\\src\\main\\resources\\state.csv";
        String line = "";
        String splits = ",";
        String[] data = null;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while ((line = bufferedReader.readLine()) != null) {
            data = line.split(splits);
            myList.add(data);
        }
        long counter = myList.stream().count();
        Assertions.assertEquals(11, counter, 0);
    }


}