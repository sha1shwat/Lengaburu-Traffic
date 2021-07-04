package com.geektrust.enums;

import com.geektrust.data.Orbit;

import java.util.ArrayList;
import java.util.List;

public enum OrbitInfo {

    ORBIT1(new Orbit("Orbit1",18,20)),
    ORBIT2(new Orbit("Orbit2",20,10));

    private Orbit orbitType;

    OrbitInfo(Orbit orbit1) {
        this.orbitType = orbitType;
    }

    public List<com.geektrust.data.Orbit> getAllOrbits(){

        List<Orbit> orbitList = new ArrayList<>();

        for (OrbitInfo o :OrbitInfo.values()){
            orbitList.add(o.orbitType);
        }
        return orbitList;

    }
}
