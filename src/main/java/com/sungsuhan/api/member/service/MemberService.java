package com.sungsuhan.api.member.service;

import com.sungsuhan.api.member.domain.MemberDTO;

public interface MemberService {

    String calc(MemberDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);
}
