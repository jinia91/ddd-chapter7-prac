package com.ddd.sample.was.cargo_system.domain.model.cargo;

import com.ddd.sample.shared.domain.ValueObject;
import com.ddd.sample.was.cargo_system.domain.model.location.Location;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.time.ZonedDateTime;

@Getter
@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
public class Leg implements ValueObject<Leg> {
    private Location loadLocation;
    private Location unloadLocation;
    private ZonedDateTime loadTime;
    private ZonedDateTime unloadTime;

    @Override
    public boolean sameValueAs(Leg other) {
        return false;
    }
}
