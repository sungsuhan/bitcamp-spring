package com.sungsuhan.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MemberDTO {

    private final static MemberDTO memberDTO = new MemberDTO();
    private MemberDTO() {}
    public static MemberDTO getInstance() {return memberDTO;}

    private String userId;
    private String name;
    private String phone;
    private String address;
    private double height;
    private double weight;
    private String regdate;


}
