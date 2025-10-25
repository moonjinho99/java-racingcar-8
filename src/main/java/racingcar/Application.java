package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        String[] carNames = Console.readLine().split(",");
        List<Car> carList = new ArrayList<>();

        //1. 자동차 이름 세팅
        for(String name : carNames) {

            if(name.length() > 5)
            {
                throw new IllegalArgumentException("자동차의 이름은 5글자 이하만 가능합니다.");
            }

            Car car = new Car(name);
            carList.add(car);
        }


    }
}
