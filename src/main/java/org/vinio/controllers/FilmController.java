package org.vinio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vinio.models.Film;

import java.util.List;

@RestController
public class FilmController {
    Film[] filmsArr = {
            new Film(1, "name1"),
            new Film(2, "name2"),
            new Film(3, "name3"),
            new Film(4, "name4"),
            new Film(5, "name5"),
    };

    List<Film> films = List.of(filmsArr);

    @GetMapping("/getFilms")
    public ResponseEntity<?> getAllFilms(){
        return ResponseEntity.ok(films);
    }

    @GetMapping("/getFilms/{id}")
    public ResponseEntity<?> getFilm(@PathVariable("id") int id) {
        List<Film> filteredFilms = films.stream().filter(film -> film.getId() == id).toList();
        return ResponseEntity.ok(filteredFilms.get(0));
    }
}
