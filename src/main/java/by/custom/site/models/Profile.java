package by.custom.site.models;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Profile {
    private String biography;
    private Set<String> interests = new HashSet<>();
    private String city;
    private String relationshipGoal;
    private String avatarUrl;
    private String userID;
}
