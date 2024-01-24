package com.example.springmvc.controllers;

import com.example.springmvc.models.Event;
import com.example.springmvc.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@AllArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping("/event")
    public String event(Model model){
        model.addAttribute("events", eventService.getAllEvent());
    return "event";
    }

    @PostMapping("/event")
    public String addEvent(Event e, Model model){
        eventService.addEvents(e);
        model.addAttribute("events", eventService.getAllEvent());
        return "event";
    }
}
