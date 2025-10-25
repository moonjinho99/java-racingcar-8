package racingcar;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Print {

    private List<Car> carList;
    public Print(List<Car> carList)
    {
        this.carList = carList;
    }

    public void printGameBoard()
    {
        for(Car car : carList)
        {
            System.out.println(car.getName()+
                    " : "+String.join("", Collections.nCopies(car.getMove(),"-")));
        }
    }

    public void printWinner()
    {
        int max = -1;
        String result="";

        for(Car car : carList)
        {
            int move = car.getMove();
            if(max == move)
                result += ", "+car.getName();

            if(max < move)
            {
                max = move;
                result = car.getName();
            }
        }

        System.out.println(result);
    }


}
