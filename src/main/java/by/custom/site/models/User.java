package by.custom.site.models;

import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private Profile profile = new Profile();
    private final String email;
    private final String userID = UUID.randomUUID().toString();
    private String name;
    private int age;
    private String gender;
    private String as;
}
