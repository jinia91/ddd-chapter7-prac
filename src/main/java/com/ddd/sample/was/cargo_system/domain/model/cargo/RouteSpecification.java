package com.ddd.sample.was.cargo_system.domain.model.cargo;

import com.ddd.sample.shared.domain.ValueObject;
import com.ddd.sample.was.cargo_system.domain.model.location.Location;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.persistence.Embeddable;
import java.time.ZonedDateTime;

@Getter
@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
public class RouteSpecification implements ValueObject<RouteSpecification> {
    private Location origin;
    private Location destination;
    private ZonedDateTime arrivalDeadline;

    @Override
    public boolean sameValueAs(RouteSpecification o) {
        return o != null && new EqualsBuilder().
                append(this.origin, o.origin).
                append(this.destination, o.destination).
                append(this.arrivalDeadline, o.arrivalDeadline).
                isEquals();
    }
}
