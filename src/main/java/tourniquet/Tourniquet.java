package tourniquet;


import skipass.Skipass;
import system.System;

public class Tourniquet {
    private System system = new System();
    public void checkSkipass(Skipass skipass) {
        if (skipass.check() == true) {
            system.accepted.add(skipass);
        }
        else {
            system.notAccepted.add(skipass);
        }
    }
}
