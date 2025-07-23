package by.custom.site.repository;

import by.custom.site.models.Interest;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
public class UserInterestRepository {
    private Map<String, Set<Interest>> userInterests = new HashMap<>();

}
