package by.custom.site.repository;

import by.custom.site.models.Profile;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class ProfileRepository {
    private final Map<String, Profile> profiles = new HashMap<>();
}
