package com.practice.querydsl.domain;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

    private String username;
    private int age;

    public MemberDTO() {
    }

    @QueryProjection
    public MemberDTO(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
