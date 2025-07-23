package by.custom.site.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Block {
    private String blockerID;
    private String blockedID;
    private LocalDateTime timestamp;
}
