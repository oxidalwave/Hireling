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
@Document("ability-scores")
public class AbilityScore {

    @Id
    private String id;
    private String index;
    private String name;
    @Field("full_name") private String fullName;
    @Field("desc") private List<String> description;
    private List<Skill> skills;
    private String url;

    public AbilityScore(String id, String index, String name, String fullName, List<String> description, List<Skill> skills, String url) {
        this.id = id;
        this.index = index;
        this.name = name;
        this.fullName = fullName;
        this.description = description;
        this.skills = skills;
        this.url = url;
    }
}
