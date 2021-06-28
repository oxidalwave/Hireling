package com.oxidalwave.hireling.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.oxidalwave.hireling.repository.AbilityScoreDao;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@ToString
@Document("skills")
public class Skill {
    @Id
    private String id;
    private String index;
    private String name;
    @Field("desc") private List<String> description;
    private AbilityScore abilityScore;
    private String url;

    public Skill(String id, String index, String name, List<String> description, AbilityScore abilityScore, String url) {
        this.id = id;
        this.index = index;
        this.name = name;
        this.description = description;
        this.abilityScore = abilityScore;
        this.url = url;
    }
}
