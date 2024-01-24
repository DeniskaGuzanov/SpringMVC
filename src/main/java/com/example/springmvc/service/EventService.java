package com.example.springmvc.service;

import com.example.springmvc.models.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    List<Event> events = new ArrayList<>();

    public void addEvents(Event event){
        events.add(event);
    }

    public List<Event> getAllEvent(){
        return events;
    }
}
