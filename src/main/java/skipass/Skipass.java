package skipass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import skipass.enums.Type;

@Getter @Setter @ToString
public class Skipass {

    protected int unique_id = 0;
    protected Type type;
    protected Boolean valid = true;

    public Skipass(Type skipassType) {
        this.type = skipassType;
        this.unique_id += 1;
    }

    public void block() {
        this.valid = false;
    }

    public Boolean validate() {
        return this.valid;
    }


    public Boolean check() {
        return this.validate();
    }
}

