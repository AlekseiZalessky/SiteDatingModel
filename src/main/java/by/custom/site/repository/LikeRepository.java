package by.custom.site.repository;

import by.custom.site.models.Like;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
public class LikeRepository {
    private Map<String, Set<Like>> likes = new HashMap<>();

}
