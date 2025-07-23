package by.custom.site.repository;

import by.custom.site.models.Message;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
public class MessageRepository {
    private Map<String, Set<Message>> messages = new HashMap<>();
}
