package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("levels")
public class Level {
    @Id
    private String id;
    private String index;
    private String url;

    public Level(String id, String index, String url) {
        this.id = id;
        this.index = index;
        this.url = url;
    }
}
