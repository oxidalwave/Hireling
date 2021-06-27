package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
@Document("subclasses")
public class Subclass {
    @Id
    private String id;
    private String index;
    private String name;
    @Field("desc") private String[] description;
    private String url;

    public Subclass(String id, String index, String name, String[] description, String url) {
        this.id = id;
        this.index = index;
        this.name = name;
        this.description = description;
        this.url = url;
    }
}
