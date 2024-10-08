package com.sbear.gameengineservice.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MatchDetailsDTO {


    private Long matchId;
    private String teamA;
    private String teamB;
    private LocalDateTime matchDateTime;
    private String location;// Include the stage of the match in the DTO
    private String matchType; // Match type (e.g., IPL, T20, ODI, Test)
    private String matchStage; // Match stage (e.g., Playoffs, Semifinals, Finals)
    private String matchGroup; // Group A or Group B
    private boolean live;
    private String matchStatus;


    public MatchDetailsDTO(Long matchId, String teamName, Integer points, String location, String matchType, String matchStage, String matchGroup, String ongoing) {
        this.matchId = matchId;
        this.teamA = teamName;
        this.teamB = teamName;
        this.matchDateTime = LocalDateTime.now();
        this.location = location;
        this.matchType = matchType;
        this.matchStage = matchStage;
        this.matchGroup = matchGroup;
        this.live = true;
        this.matchStatus = ongoing;
    }

    public MatchDetailsDTO(String number, String teamA, String teamB ) {
        this.matchId = Long.parseLong(number);
        this.teamA = teamA;
        this.teamB = teamB;
    }
}
