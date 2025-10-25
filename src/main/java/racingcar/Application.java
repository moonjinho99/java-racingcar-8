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
            Car car = new Car(name);
            carList.add(car);
        }

        //2. 이동횟수
        int moveAll = Integer.parseInt(Console.readLine());
        Play play = new Play(carList);

        for(int i=0; i < moveAll; i++)
        {
            play.playGame();
        }

    }
}
