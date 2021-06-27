package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("starting-equipment")
public class StartingEquipment {
    @Id
    private String id;

    public StartingEquipment(String id) {
        this.id = id;
    }
}
