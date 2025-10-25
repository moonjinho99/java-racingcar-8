package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    @DisplayName("자동차 이름 세팅")
    void settingCarName() {
        Car car = new Car("test");
        assertThat(car.getName()).isEqualTo("test");
    }

    @Test
    @DisplayName("이름이 5글자를 초과하면 예외발생")
    void validCarName(){
        assertThatThrownBy(() -> new Car("test1234"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 5글자 이하만 가능하다.");
    }
}
