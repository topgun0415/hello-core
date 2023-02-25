package hello.core.member;

public interface MemberRepository {

    // save Members' information
    void save(Member member);

    // find Members' ID
    Member findId(Long memberId);


}
