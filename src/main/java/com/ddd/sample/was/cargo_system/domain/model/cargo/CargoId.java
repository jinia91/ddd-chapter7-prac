package com.ddd.sample.was.cargo_system.domain.model.cargo;

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
public class CargoId implements ValueObject<CargoId> {
    private long id;

    public CargoId(long id) {
        this.id = id;
    }

    @Override
    public boolean sameValueAs(CargoId o) {
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
