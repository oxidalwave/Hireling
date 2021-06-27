package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("ability-scores")
public class AbilityScore {
    @Id
    private String id;

    public AbilityScore(String id) {
        this.id = id;
    }
}
