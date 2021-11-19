package skipass;

import lombok.Getter;
import lombok.Setter;
import skipass.enums.DaysSkipassType;
import skipass.enums.DescendsType;
import skipass.enums.Type;

@Setter@Getter
public class DescendsSkipass extends Skipass{
    private static DescendsSkipass thisDescendsSkipass = null;
    private int numberOfDescends;
    private DescendsType typeOfDescends;

    public DescendsSkipass(Type skipassType, DescendsType descends) {
        super(skipassType);
        this.typeOfDescends = descends;
        this.numberOfDescends = descends.getNumberOfDescends();
        this.unique_id += 1;
    }
    @Override
    public Boolean validate(){
        if (this.numberOfDescends > 0) {
            this.valid = true;
        }
        else{this.block();}
        return this.valid;
    }

    public DescendsSkipass createDescendsSkipass() {
        if (thisDescendsSkipass == null) {
            return thisDescendsSkipass = new DescendsSkipass(this.type, this.getTypeOfDescends());
        }
        return thisDescendsSkipass;
    }

    @Override
    public Boolean check() {
        this.numberOfDescends -= 1;
        return this.validate();
    }
}
