package com.sungsuhan.api.member.domain;

import com.sungsuhan.api.member.service.MemberService;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName:com.sungsuhan.api.member.domain
 * fileName        :CalcDTO.java
 * author          : sungsuhan
 * date            :2022-02-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-25           sungsuhan      최초 생성
 **/
@Data
@Component
public class CalcDTO {

    private final MemberService service;

    private int res;
    private int num1;
    private String opcode;
    private int num2;


}
