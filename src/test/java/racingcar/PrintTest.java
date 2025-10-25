package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class PrintTest {

    @Test
    @DisplayName("게임보드 출력 테스트")
    void printGameBoardTest() {
        // given
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("car1");
        car1.setMove(3);
        Car car2 = new Car("car2");
        car2.setMove(1);
        carList.add(car1);
        carList.add(car2);

        Print print = new Print(carList);

        // 출력 결과를 가로채기 위한 준비
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // when
        print.printGameBoard();

        // then
        String printed = output.toString().trim();
        assertThat(printed).contains("car1 : ---");
        assertThat(printed).contains("car2 : -");
    }

    @Test
    @DisplayName("우승자 한 명 출력 테스트")
    void printWinnerSingleTest() {
        // given
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("a");
        car1.setMove(2);
        Car car2 = new Car("b");
        car2.setMove(5);
        carList.add(car1);
        carList.add(car2);

        Print print = new Print(carList);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // when
        print.printWinner();

        // then
        String printed = output.toString().trim();
        assertThat(printed).isEqualTo("b");
    }

    @Test
    @DisplayName("공동 우승자 출력 테스트")
    void printWinnerMultipleTest() {
        // given
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("a");
        car1.setMove(3);
        Car car2 = new Car("b");
        car2.setMove(5);
        Car car3 = new Car("c");
        car3.setMove(5);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        Print print = new Print(carList);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // when
        print.printWinner();

        // then
        String printed = output.toString().trim();
        assertThat(printed).isEqualTo("b, c");
    }

}
