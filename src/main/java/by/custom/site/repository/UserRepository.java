package by.custom.site.repository;

import by.custom.site.models.User;
import by.custom.site.utils.JsonUtil;
import lombok.Getter;
import lombok.Setter;

import java.nio.file.Path;
import java.util.*;

@Setter
@Getter
public class UserRepository {
    private Map<String, User> users = new HashMap<>();

}
