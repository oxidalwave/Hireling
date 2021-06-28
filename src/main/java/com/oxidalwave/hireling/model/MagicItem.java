package com.oxidalwave.hireling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@ToString
@Document("magic-items")
public class MagicItem {
    @Id
    private String id;
    private String index;
    private String name;
    @Field("desc") private List<String> description;
    private String url;

    public MagicItem(String id, String index, String name, List<String> description, String url) {
        this.id = id;
        this.index = index;
        this.name = name;
        this.description = description;
        this.url = url;
    }
}
