package com.ddd.sample.was.cargo_system.domain.model.location;

import com.ddd.sample.shared.domain.ValueObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.Objects;

@Getter
@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
public class LocationId implements ValueObject<LocationId> {
    private long id;

    public LocationId(long id) {
        this.id = id;
    }

    @Override
    public boolean sameValueAs(LocationId o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return Objects.equals(id, o.id);
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}
