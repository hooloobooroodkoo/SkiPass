package skipass.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum DaysSkipassType {
    ONE(1), TWO(2), FIVE(5);

    public int numberOfDays;

    DaysSkipassType(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
