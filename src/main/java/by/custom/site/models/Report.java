package by.custom.site.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Report {
    private String reporterID;
    private String reportedID;
    private String reason;
    private LocalDateTime timestamp;
}
