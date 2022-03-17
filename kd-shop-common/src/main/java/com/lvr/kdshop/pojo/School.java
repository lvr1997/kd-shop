package com.lvr.kdshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private Integer id;
    private String schoolId;
    private String schoolName;
    private String schoolLocation;
    private LocalDateTime createAt;
}
