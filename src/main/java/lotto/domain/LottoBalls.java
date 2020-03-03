package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoBalls {

    private static final List<LottoBall> LOTTO_BALLS;
    private static final int START_BALL_NUMBER = 1;
    private static final int END_BALL_NUMBER = 45;
    private static final int LOTTO_TICKET_SIZE = 6;
    private static final String OUT_OF_RANGE_LOTTO_BALL = "로또볼_범위를_벗어났습니다";

    private LottoBalls() {
    }

    static {
        LOTTO_BALLS =
                IntStream.rangeClosed(START_BALL_NUMBER, END_BALL_NUMBER)
                        .mapToObj(lottoBall -> new LottoBall(String.valueOf(lottoBall)))
                        .collect(Collectors.toList());
    }

    public static void shuffle() {
        Collections.shuffle(LOTTO_BALLS);
    }

    public static List<LottoBall> generateLottoTicket() {
        List<LottoBall> lottoTicket = new ArrayList<>();

        for (int i = 0; i < LOTTO_TICKET_SIZE; i++) {
            lottoTicket.add(LOTTO_BALLS.get(i));
        }

        Collections.sort(lottoTicket);
        return Collections.unmodifiableList(lottoTicket);
    }

    public static LottoBall findLottoBall(int findLottoBall) {
        return LOTTO_BALLS.stream()
                .filter(ball -> ball.getLottoBall() == findLottoBall)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(OUT_OF_RANGE_LOTTO_BALL));
    }

}
