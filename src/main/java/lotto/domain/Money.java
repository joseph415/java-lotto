package lotto.domain;

import lotto.utils.StringUtils;
import lotto.utils.ValidationUtils;

public class Money {

    private static final int LOTTO_UNIT = 1000;
    private Long money;


    public Money(String money) {
        validateMoney(money);

        this.money = StringUtils.stringToLong(money);
    }

    private void validateMoney(String money) {
        ValidationUtils.validateIntegerNumberFormat(money);
        ValidationUtils.validatePositiveNumber(money);
        ValidationUtils.validateLottoUnit(money);
    }

    public String changeMoney() {
        return String.valueOf(money % LOTTO_UNIT);
    }

    public String generateLottoTicketCount() {
        return String.valueOf(money / LOTTO_UNIT);
    }

    public Long getMoney() {
        return money;
    }
}
