package com.sungsuhan.api.member.controller;

import com.sungsuhan.api.member.domain.MemberDTO;
import com.sungsuhan.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

    @PostMapping("/bmi")
    public String getBmi(@RequestBody MemberDTO member) {
        System.out.println("리액트에서 넘어온 이름 : " + member.getName());
        System.out.println("리액트에서 넘어온 키 : " + member.getHeight());
        System.out.println("리액트에서 넘어온 몸무게 : " + member.getWeight());
        return "BMI 정상";
    }
    @GetMapping("/calc")
    public String calc(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight) {
        System.out.println("리액트에서 넘어온 이름 : " + name);
        System.out.println("리액트에서 넘어온 키 : " + height);
        System.out.println("리액트에서 넘어온 몸무게 : " + weight);
        return "BMI 정상";
    }
    @GetMapping("/grade")
    public String getGrade(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight) {
        System.out.println("리액트에서 넘어온 이름 : " + name);
        System.out.println("리액트에서 넘어온 키 : " + height);
        System.out.println("리액트에서 넘어온 몸무게 : " + weight);
        return "BMI 정상";
    }
    @GetMapping("/login")
    public String login(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight) {
        System.out.println("리액트에서 넘어온 이름 : " + name);
        System.out.println("리액트에서 넘어온 키 : " + height);
        System.out.println("리액트에서 넘어온 몸무게 : " + weight);
        return "BMI 정상";
    }
}
