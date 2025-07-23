package by.custom.site.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Match {
    private String userAID;
    private String userBID;
    private LocalDateTime createDate;

}

