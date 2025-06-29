package com.likelion.basecode.member.api.dto.response;

import com.likelion.basecode.member.domain.Member;
import com.likelion.basecode.member.domain.Part;
import lombok.Builder;

@Builder
public record MemberInfoResponseDto(
        String name,
        int age,
        Part part
) {
    public static MemberInfoResponseDto from(Member member) {
        return MemberInfoResponseDto.builder()
                .name(member.getName())
                .age(member.getAge())
                .part(member.getPart())
                .build();
    }
}
