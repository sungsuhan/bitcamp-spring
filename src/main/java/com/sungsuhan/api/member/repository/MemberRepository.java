package com.sungsuhan.api.member.repository;

import com.sungsuhan.api.member.domain.MemberDTO;

public interface MemberRepository {
    String calc(MemberDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);
}
