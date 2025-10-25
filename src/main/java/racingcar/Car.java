package racingcar;


public class Car {

    private static final int MAX_NAME_LENGTH = 5;

    private String name;

    public Car(String name)
    {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 5글자 이하만 가능하다.");
        }

        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

}
