package com.sungsuhan.api.member.controller;

import com.sungsuhan.api.member.domain.MemberDTO;
import com.sungsuhan.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

    @PostMapping("/bmi")
    public String bmi(@RequestBody MemberDTO bmi) {
        return service.bmi(bmi);
    }
    @PostMapping("/calc")
    public String calc(@RequestBody MemberDTO calc) {
        return service.calc(calc);
    }
    @PostMapping("/grade")
    public String grade(@RequestBody MemberDTO grade) {
        return service.grade(grade);
    }
    @PostMapping("/login")
    public String login(@RequestBody MemberDTO login) {
        return service.login(login);
    }
    @PostMapping("/info")
    public String info(@RequestBody MemberDTO info) {
        return service.info(info);
    }



}
