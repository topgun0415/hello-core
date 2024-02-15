package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야한다")
    void vip_o() {
        //given
        Member memberA = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discountPrice = discountPolicy.discount(memberA, 10000);
        //then
        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 10% 할인이 적용되면 안된다")
    void vip_x() {
        //given
        Member memberB = new Member(1L, "memberBASIC", Grade.BASIC);
        //when
        int discountPrice = discountPolicy.discount(memberB, 10000);
        //then
        Assertions.assertThat(discountPrice).isEqualTo(0);
    }

}