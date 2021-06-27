package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("subraces")
public class Subrace {
    @Id
    private String id;
    private String index;

    public Subrace(String id, String index) {
        this.id = id;
        this.index = index;
    }
}
