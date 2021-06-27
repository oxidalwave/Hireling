package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("equipment")
public class Equipment {
    @Id
    private String id;
    private String index;
    private String name;
    private String url;

    public Equipment(String id, String index, String name, String url) {
        this.id = id;
        this.index = index;
        this.name = name;
        this.url = url;
    }
}
