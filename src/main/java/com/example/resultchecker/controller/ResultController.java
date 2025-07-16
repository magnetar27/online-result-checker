
package com.example.resultchecker.controller;

import com.example.resultchecker.model.StudentResult;
import com.example.resultchecker.repository.StudentResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ResultController {

    @Autowired
    private StudentResultRepository repository;

    @GetMapping("/")
    public String showForm() {
        return "result-form";
    }

    @PostMapping("/result")
    public String getResult(@RequestParam("rollNo") Long rollNo, Model model) {
        StudentResult result = repository.findByRollNo(rollNo);
        model.addAttribute("result", result);
        return "result-view";
    }
}
