package system;

import skipass.Abonement;
import skipass.DaysSkipass;
import skipass.DescendsSkipass;
import skipass.Skipass;
import skipass.enums.DaysSkipassType;
import skipass.enums.DescendsType;
import skipass.enums.Type;
import java.util.ArrayList;
public class System {
    public ArrayList<Skipass> accepted = new ArrayList<Skipass>();
    public ArrayList<Skipass> notAccepted = new ArrayList<Skipass>();


    public Abonement createAbonement() {
        Abonement abonement = new Abonement(Type.ABONEMENT);
        return abonement.createAbonement();
    }
    public DescendsSkipass createDescendsSkipass(Type weekdayOrWeekend, DescendsType descends) {
        DescendsSkipass descendsSkipass = new DescendsSkipass(weekdayOrWeekend, descends);
        return descendsSkipass.createDescendsSkipass();
    }
    public DaysSkipass createDaysSkipass(Type weekdayOrWeekend, DaysSkipassType days) {
        DaysSkipass daysSkipass = new DaysSkipass(weekdayOrWeekend, days);
        return daysSkipass.createDaysSkipass();
    }

    public void blockSkipass(Skipass skipass) {
        skipass.block();

    }


}
