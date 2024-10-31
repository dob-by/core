package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();  //구현체가 없으면 nullpointerexception Error발생가능

    @Override
    public void join(Member member) {
        memberRepository.save(member);  //다형성에 의해 MemoryMemnberRepository에 있는 save호출
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
