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

    private int num1;
    private String opcode;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }



}
