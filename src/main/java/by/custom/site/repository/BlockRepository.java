package by.custom.site.repository;

import by.custom.site.models.Block;
import by.custom.site.utils.JsonUtil;
import lombok.Getter;
import lombok.Setter;

import java.nio.file.Path;
import java.util.*;

@Setter
@Getter
public class BlockRepository {
    private Map<String, Set<Block>> userBlocks = new HashMap<>();

}
