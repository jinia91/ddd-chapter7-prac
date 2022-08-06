package com.ddd.sample.was.cargo_system.domain.model.cargo;

import com.ddd.sample.shared.domain.ValueObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.Collections;
import java.util.List;

@Getter
@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
public class Itinerary implements ValueObject<Itinerary> {
    private List<Leg> legs = Collections.emptyList();

    static final Itinerary EMPTY_ITINERARY = new Itinerary();

    public Itinerary(List<Leg> legs) {
        this.legs = legs;
    }

    @Override
    public boolean sameValueAs(Itinerary other) {
        return false;
    }
}
