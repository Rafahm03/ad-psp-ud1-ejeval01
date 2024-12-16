package com.salesianostriana.dam.ejeval01.service;

import com.salesianostriana.dam.ejeval01.modal.Place;
import com.salesianostriana.dam.ejeval01.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceService {


    @Autowired
    private  PlaceRepository placeRepository;

    public List<Place> getAll(String ciudad, String sortDirection) {
        return placeRepository.query(ciudad, sortDirection);
    }

    public Place create(Place place) {

        return placeRepository.add(place);
    }

    public Optional<Place> getById(Long id) {
        return placeRepository.get(id);
    }

    public Optional<Place> edit(Long id, Place newplace) {
        return placeRepository.edit(id, newplace);
    }

    public void delete(Long id) {
        placeRepository.delete(id);
    }

}
