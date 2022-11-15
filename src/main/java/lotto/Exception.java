package lotto;

import java.util.List;

public class Exception {
    private static final int ZERO = 0;
    private static final int TICKET_PRICE = 1000;
    private static final int WINNING_NUMBER_SIZE = 6;
    private static final int MAX_VALUE_OF_WINNING_NUMBER = 45;
    private static final int MIN_VALUE_OF_WINNING_NUMBER = 1;
    private static final String SEPARATED_CHARACTER = ",";

    // TODO : 로또 구매 금액을 입력 받아 검증 후 반환한다.
    public static int isCorrectAmount(String purchaseAmount) {
        int amount = isContainCharacter(purchaseAmount);
        isDividedByTicketPrice(amount);
        return amount;
    }

    // TODO : 입력 값이 1,000으로 나누어 떨어지지 않는 경우 예외 처리 한다.
    static void isDividedByTicketPrice(int purchaseAmount) throws IllegalArgumentException{
        if (purchaseAmount % TICKET_PRICE != ZERO)
            throw new IllegalArgumentException("[ERROR] The unit of the purchase amount is not 1,000.");
    }

    // TODO : 입력 값에 문자가 포함되어 있는 경우 예외 처리 한다.
    static int isContainCharacter(String number) throws IllegalArgumentException{
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("[ERROR] Characters exist in the input value.");
        }
    }

    // TODO: 담첨 번호 6자리를 입력받아 검증 후 리스트로 변환하여 반환한다.

    // TODO: 입력 값의 문자 혹은 숫자가 6개가 아닌 경우 예외 처리한다.
    private static List<String> isSixInputValues(List<String> winningNumbers) throws IllegalArgumentException{
        if (winningNumbers.size() != WINNING_NUMBER_SIZE)
            throw new IllegalArgumentException("[ERROR] The number of input values does not match 6.");
        return winningNumbers;
    }

    // TODO: 입력 값에 중복된 값이 존재하는 경우 예외 처리한다.
    // TODO: 입력 값(보너스 번호)이 리스트(winningNumber)에 포함되어 있는 숫자일 경우 예외처리한다.
}
