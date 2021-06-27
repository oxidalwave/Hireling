package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("damage-types")
public class DamageType {
    @Id
    private String id;

    public DamageType(String id) {
        this.id = id;
    }
}
