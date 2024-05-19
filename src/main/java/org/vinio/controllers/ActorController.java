package org.vinio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vinio.models.Actor;

import java.util.List;

@RestController
public class ActorController {
    Actor[] actorsArr = {
            new Actor(1, "name1"),
            new Actor(2, "name2"),
            new Actor(3, "name3"),
            new Actor(4, "name4"),
            new Actor(5, "name5"),
    };

    List<Actor> actors = List.of(actorsArr);

    @GetMapping("/getActors")
    public ResponseEntity<?> getAllActors(){
        return ResponseEntity.ok(actors);
    }

    @GetMapping("/getActors/{id}")
    public ResponseEntity<?> getActor(@PathVariable("id") int id) {
        List<Actor> filteredFilms = actors.stream().filter(actor -> actor.getId() == id).toList();
        return ResponseEntity.ok(filteredFilms.get(0));
    }
}
