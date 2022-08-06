package com.ddd.sample.was.cargo_system.domain.model.location;

import com.ddd.sample.shared.domain.ValueObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.Validate;

import javax.persistence.Embeddable;
import java.util.Objects;
import java.util.regex.Pattern;

@Getter
@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
public class ZipCode implements ValueObject<ZipCode> {
    private static final Pattern VALID_PATTERN = Pattern.compile("[a-zA-Z]{2}[a-zA-Z2-9]{3}");

    private String zipCode;

    public ZipCode(String zipCode) {
        Validate.notNull(zipCode, "zipCode can't be null");
        Validate.isTrue(VALID_PATTERN.matcher(zipCode).matches(),
                zipCode + " is not a valid zipCode (does not match pattern)");
        this.zipCode = zipCode;
    }

    @Override
    public boolean sameValueAs(ZipCode o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return Objects.equals(zipCode, o.zipCode);
    }

    @Override
    public String toString() {
        return String.valueOf(this.zipCode);
    }
}
