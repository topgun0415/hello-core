package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    // press "psvm" (Intellij helps to make public static void main)
    public static void main(String[] args) {

        // MemberService 인스턴스화
        MemberService memberService = new MemberServiceImpl();

        // id가 1인 memberA라고하는 VIP등급의 맴버를 만들어준다.
        Member member = new Member(1L, "memberA", Grade.VIP);

        // member 회원가입 실행
        memberService.join(member);

        // 회원가입한 맴버 찾기
        Member findMember = memberService.findMember(1L);

        System.out.println("member =" + member.getName());
        System.out.println("findMember =" + findMember.getName());


    }
}
