package com.code.springdemo;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements IFortuneService {

    private List<String> theFortunes;
    private Random rand = new Random();

    public FileFortuneService() {
        File theFile = new File("fortune-data.txt");

        System.out.println("Reading fortunes from the file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        theFortunes = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(
                new FileReader(theFile))) {
            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = rand.nextInt(theFortunes.size());
        String tempFortune = theFortunes.get(index);
        return tempFortune;
    }
}
