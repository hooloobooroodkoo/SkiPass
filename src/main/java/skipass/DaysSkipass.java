package skipass;

import lombok.Getter;
import lombok.Setter;
import skipass.enums.DaysSkipassType;
import skipass.enums.Type;

import java.util.Date;
@Getter@Setter
public class DaysSkipass extends Skipass{
    private static DaysSkipass thisDaysSkipass = null;
    private Date validityTime;
    private int days;
    private DaysSkipassType typeOfDays;

    public DaysSkipass(Type skipassType, DaysSkipassType days) {
        super(skipassType);
        this.typeOfDays = days;
        this.days = days.getNumberOfDays();
        this.unique_id += 1;
    }
    @Override
    public Boolean validate(){
        Date date = new Date();
        if (this.validityTime.after(date)) {
            this.block();
        }
        else{this.valid = true;}
        return this.valid;
    }

    public DaysSkipass createDaysSkipass() {
        if (thisDaysSkipass == null) {
            return thisDaysSkipass = new DaysSkipass(this.type, this.typeOfDays);
        }
        return thisDaysSkipass;
    }
    @Override
    public Boolean check() {
        return this.validate();
    }
}
