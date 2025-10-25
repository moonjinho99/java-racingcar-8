package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Play {
    private List<Car> carList;

    public Play(List<Car> carList)
    {
        this.carList = carList;
    }

    public void playGame()
    {
        for(Car car : carList)
        {
            int num = Randoms.pickNumberInRange(0, 9);

            if(num >= 4)
            {
                car.setMove(car.getMove()+1);
            }
        }
    }
}
