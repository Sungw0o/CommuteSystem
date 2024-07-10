package com.company.empmanage.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Getter
@Builder
@AllArgsConstructor
public class Team {

    @Id
    @Column(nullable = false)
    private String name;
    @Setter
    private String manager;
    private int memberCount;

    public void setManager(String name) {
        this.manager = name;
    }

    public void addMember() {
        this.memberCount++;
    }
}
