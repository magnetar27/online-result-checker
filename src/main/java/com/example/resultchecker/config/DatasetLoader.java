
package com.example.resultchecker.config;

import com.example.resultchecker.model.StudentResult;
import com.example.resultchecker.repository.StudentResultRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Component
public class DatasetLoader {

    @Autowired
    private StudentResultRepository studentResultRepository;

    @PostConstruct
    public void loadDataFromCSV() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("/StudentDatasetMain.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            String line;
            reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                StudentResult student = new StudentResult();
                student.setRollNo(Long.parseLong(data[0]));
                student.setStudentName(data[1]);
                student.setMath(Integer.parseInt(data[2]));
                student.setPhysics(Integer.parseInt(data[3]));
                student.setChemistry(Integer.parseInt(data[4]));
                student.setGrade(data[5]);

                studentResultRepository.save(student);
            }

            System.out.println("📥 Dataset Loaded from CSV Successfully!");
        } catch (Exception e) {
            System.out.println("❌ Failed to load CSV: " + e.getMessage());
        }
    }
}
