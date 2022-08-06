package com.ddd.sample.was.cargo_system.domain.model.cargo;

import com.ddd.sample.was.cargo_system.domain.model.location.Location;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Cargo {
    @EmbeddedId
    private CargoId cargoId;
    private Location originLocation;
    private RouteSpecification routeSpecification;
    private Itinerary itinerary;
    private Delivery delivery;
}
