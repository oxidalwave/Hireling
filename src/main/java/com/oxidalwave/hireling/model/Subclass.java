package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("subclasses")
public class Subclass {
    @Id
    private String id;
    private String index;

    public Subclass(String id, String index) {
        this.id = id;
        this.index = index;
    }
}
