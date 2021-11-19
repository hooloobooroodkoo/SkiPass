package skipass.enums;

import lombok.Getter;

@Getter
public enum DescendsType {
    TEN(10), TWENTY(20), FIFTY(50), HUNDREED(100);

    public int numberOfDescends;

    DescendsType(int numberOfDescends) {
        this.numberOfDescends = numberOfDescends;
    }
}
