package com.ddd.sample.was.cargo_system.domain.model.cargo;

import com.ddd.sample.was.cargo_system.domain.model.location.Location;

import java.time.ZonedDateTime;

public class Delivery {
    private TransportStatus transportStatus;
    private Location lastKnownLocation;
    private Voyage currentVoyage;
    private boolean misdirected;
    private ZonedDateTime eta;
    private HandlingActivity nextExpectedActivity;
    private boolean isUnloadedAtDestination;
    private RoutingStatus routingStatus;
    private ZonedDateTime calculatedAt;
    private HandlingEvent lastEvent;

}
