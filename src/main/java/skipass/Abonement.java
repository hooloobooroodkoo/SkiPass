package skipass;

import skipass.enums.DaysSkipassType;
import skipass.enums.DescendsType;
import skipass.enums.Type;

import java.util.Date;

import static skipass.enums.Type.ABONEMENT;

public class Abonement extends Skipass{
    private static Abonement thisAbonement = null;
    private Date validityDate;

    public Abonement(Type type) {
        super(type);
        this.unique_id += 1;
    }

    @Override
    public Boolean validate(){
        Date date = new Date();
        if (this.validityDate.after(date)) {
            this.block();
        }
        else{this.valid = true;}
        return this.valid;
    }


    public Abonement createAbonement() {
        if (thisAbonement == null) {
            return thisAbonement = new Abonement(this.type);
        }
        return thisAbonement;
    }
    @Override
    public Boolean check() {
        return this.validate();
    }
}
