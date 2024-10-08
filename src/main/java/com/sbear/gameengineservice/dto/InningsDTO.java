package com.sbear.gameengineservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InningsDTO {
    private Long inningsId;
    private Long inningsNumber;
    private String battingTeamName;
    private String bowlingTeamName;
    private List<BallDTO> balls;
}
