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
@Document("alignments")
public class Alignment {
    @Id
    private String id;
    private String index;
    private String name;
    private String abbreviation;
    @Field("desc") private String description;
    private String url;

    public Alignment(String id, String index, String name, String abbreviation, String description, String url) {
        this.id = id;
        this.index = index;
        this.name = name;
        this.abbreviation = abbreviation;
        this.description = description;
        this.url = url;
    }
}
