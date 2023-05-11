package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.PubSubInboundMessage;
import com.example.thymeleaf.service.InboundMessageService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@AllArgsConstructor
public class FrontEndController {

    private final InboundMessageService inboundMessageService;

    @PostMapping("/create")
    public String create(PubSubInboundMessage message){

        //taskRepository.save(task);
        log.info("Task created: [{}] ", message);

        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView list(){
        return new ModelAndView("list")
                .addObject("messages", inboundMessageService.findAll());
    }
}
