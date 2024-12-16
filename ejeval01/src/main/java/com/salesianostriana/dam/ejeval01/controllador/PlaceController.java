package com.salesianostriana.dam.ejeval01.controllador;

import com.salesianostriana.dam.ejeval01.modal.Place;
import com.salesianostriana.dam.ejeval01.service.PlaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/place")
public class PlaceController {

    private PlaceService placeService;

    @GetMapping("/")
    public List<Place> getAllPlaces() {
        return placeService.getAll()
    }

    @GetMapping("/{id}")
    public Optional<Place> getPlaceById(PathVariable Long id) {
        return placeService.getPlaceById(id)
    }

    @PostMapping()
    public ResponseEntity<Place> create(@RequestBody Place place) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(placeService.create(place));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Place> getById(@PathVariable Long id) {
        return ResponseEntity.of(placeService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Place> edit(
            @RequestBody Place place,
            @PathVariable("id") Long placeId) {

        return ResponseEntity.of(placeService.edit(placeId, place));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        placeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
