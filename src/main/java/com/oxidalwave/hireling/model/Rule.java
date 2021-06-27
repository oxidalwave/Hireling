package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("rules")
public class Rule {
    @Id
    private String id;
    private String index;

    public Rule(String id, String index) {
        this.id = id;
        this.index = index;
    }
}
