package com.ddd.sample.was.cargo_system.domain.model.location;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.Validate;

import javax.persistence.*;

@Getter
@Entity
@Table(indexes = {})
@NoArgsConstructor
public class Location {
    @EmbeddedId
    private LocationId locationId;
    @Embedded
    private ZipCode zipCode;
    @Column(columnDefinition = "VARCHAR(50)")
    private String name;

    public Location(LocationId id, ZipCode zipCode, String name) {
        Validate.notNull(id);
        Validate.notNull(zipCode);
        Validate.notNull(name);

        this.locationId = id;
        this.zipCode = zipCode;
        this.name = name;
    }
}
