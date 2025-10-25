package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayTest {

    @Test
    @DisplayName("자동차 이동")
    void settingCarName() {
        List<Car> carList = new ArrayList<>();

        for(int i=1; i<=2; i++)
        {
            carList.add(new Car("test"+i));
        }
        Play play = new Play(carList);

        int move = 5;

        for(int i=0; i<5; i++)
        {
            play.playGame();
        }

    }
}
