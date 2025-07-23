package by.custom.site.models;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Message {
    private String messageID;
    private String senderID;
    private String recieverID;
    private LocalDateTime timestamp;
    private String text;
    private boolean isRead;
}
