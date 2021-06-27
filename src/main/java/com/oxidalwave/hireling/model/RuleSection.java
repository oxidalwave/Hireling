package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("rule-sections")
public class RuleSection {
    @Id
    private String id;
    private String index;

    public RuleSection(String id, String index) {
        this.id = id;
        this.index = index;
    }
}
