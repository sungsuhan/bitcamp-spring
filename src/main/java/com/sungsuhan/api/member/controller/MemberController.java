package com.sungsuhan.api.member.controller;

import com.sungsuhan.api.member.domain.MemberDTO;
import com.sungsuhan.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @GetMapping("/member/bmi/{name}/{height}/{weight}")
    public String getBmi(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight) {
        System.out.println("리액트에서 넘어온 이름 : " + name);
        System.out.println("리액트에서 넘어온 키 : " + height);
        System.out.println("리액트에서 넘어온 몸무게 : " + weight);
        return "BMI 정상";
    }

}
