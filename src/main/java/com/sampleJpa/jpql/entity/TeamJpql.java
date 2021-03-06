package com.sampleJpa.jpql.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TEAM_JPQL")
public class TeamJpql {
    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "teamJpql")
    private List<MemberJpql> members = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MemberJpql> getMembers() {
        return members;
    }

    public void setMembers(List<MemberJpql> members) {
        this.members = members;
    }
}
