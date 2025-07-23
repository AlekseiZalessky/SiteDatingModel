package by.custom.site.repository;

import by.custom.site.models.Interest;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class InterestRepository {
    private Set<Interest> interests;

}
