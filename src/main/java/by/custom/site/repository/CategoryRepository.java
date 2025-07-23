package by.custom.site.repository;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class CategoryRepository {
    private Set<String> categories = new HashSet<>();

}
