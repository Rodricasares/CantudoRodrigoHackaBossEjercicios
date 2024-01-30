package com.event.eventArea.controller;

import com.event.eventArea.model.Event;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/event")
public class Controller {



List<Event>listEvents = new ArrayList<>();
    @GetMapping
    public String main(){
        return "Main page";
    }

//add event
@PostMapping("/add-event")
public String addEvent(@RequestBody Event newEvent) {
    listEvents.add(newEvent);
    return "List of events in area: " + newEvent.getTitulo();
}

// list of the events
    @GetMapping("/listEvents")
    public List<Event>getAll(){
        return listEvents;
    }


@GetMapping("/{id}")
    public Event getEventId(@PathVariable Long id){
        return listEvents.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .get();
}

}
