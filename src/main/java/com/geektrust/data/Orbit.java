package com.geektrust.data;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orbit {

    private String orbitType;
    private Integer orbitLength;
    private Integer numberOfCraters;
}
