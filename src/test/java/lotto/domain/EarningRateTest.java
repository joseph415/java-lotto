package lotto.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class EarningRateTest {
    @Test
    @DisplayName("수익률 테스트")
    void calculate_total_money_test() {
        LottoBall bonusBall = new LottoBall("7");
        LottoTicket winningTicketInput = new LottoTicket("1,2,3,4,5,6");

        LottoTickets.insertLottoTicket(new LottoTicket("1,2,3,4,5,6"));
        LottoTickets.insertLottoTicket(new LottoTicket("1,2,3,4,5,6"));
        LottoTickets.insertLottoTicket(new LottoTicket("1,2,3,4,5,6"));

        WinningTicket winningTicket = new WinningTicket(winningTicketInput.getLottoTicket(), bonusBall);
        Map<Rank,Long> eachRankCount = Rank.calculateEachRankCount(winningTicket);

        Assertions.assertThat(EarningRate.calculateEarningRate(eachRankCount, new Money("3000")))
                .isEqualTo(400_000_000);
    }
}