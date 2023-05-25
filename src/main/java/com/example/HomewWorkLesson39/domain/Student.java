package com.example.HomewWorkLesson39.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;
    private String surname;
    private long id;
    private int course;


}
