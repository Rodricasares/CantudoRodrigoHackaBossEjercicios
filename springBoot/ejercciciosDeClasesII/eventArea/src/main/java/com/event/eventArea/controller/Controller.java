package com.event.eventArea.controller;

import com.event.eventArea.model.Event;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/event")
public class Controller {


    List<Event> listEvents = new ArrayList<>();

    @GetMapping
    public String main() {
        return "Main page";
    }

    //add event
    @PostMapping("/add-event")
    public String addEvent(@RequestBody Event newEvent) {
        listEvents.add(newEvent);
        return "Event added successfully  " + newEvent.getTitulo();
    }

    // list of the events
    @GetMapping("/listEvents")
    public List<Event> getAll() {
        return listEvents;
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getEventById(@PathVariable Long id) {
        Optional<Event> eventOptional = listEvents.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();

        if (eventOptional.isPresent()) {
            Event event = eventOptional.get();
           return ResponseEntity.ok( eventOptional.get());
            //return ResponseEntity.ok("Event/s found : " + event.getTitulo() + " - " + event.getDescripcion());
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Not found event with this Id: " + id);

        }

    }
}
