package com.kob.backend.consumer.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private Integer id;
    private Integer sx; // 起点的坐标(sx, sy)
    private Integer sy;
    private List<Integer> steps;  // 玩家每一步走的方向

}
