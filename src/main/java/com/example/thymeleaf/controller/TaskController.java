package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Task;
import com.example.thymeleaf.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Controller
@AllArgsConstructor
public class TaskController {

    private final TaskRepository taskRepository;

    @GetMapping("/create")
    public String home(){
        return "create";
    }

    @PostMapping("/create")
    public String create(Task task){

        taskRepository.save(task);
        log.info("Task created: [{}] ", task);

        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView list(){
        List<Task> taskList = taskRepository.findAll();

        ModelAndView mv = new ModelAndView("list");

        mv.addObject("tasks", taskList);

        return mv;
    }
}
