package by.custom.site.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Like {
    private String fromUserID;
    private String toUserID;
    private LocalDateTime timestamp;

}
