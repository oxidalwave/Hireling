package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("backgrounds")
public class Background {
    @Id
    private String id;
    private String index;
    private String name;

    public Background(String id, String index, String name) {
        this.id = id;
        this.index = index;
        this.name = name;
    }
}
