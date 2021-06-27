package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("conditions")
public class Condition {
    @Id
    private String id;

    public Condition(String id) {
        this.id = id;
    }
}
