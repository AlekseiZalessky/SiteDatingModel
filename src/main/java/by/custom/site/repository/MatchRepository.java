package by.custom.site.repository;

import by.custom.site.models.Match;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
public class MatchRepository {
    private Map<String, Set<Match>> matches = new HashMap<>();
}
