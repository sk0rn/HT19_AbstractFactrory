import army.soldiers.Soldier;
import factories.GermanSquadFactory;
import factories.SovietSquadFactory;
import factories.SquadFactory;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        String chooseYourNation = "soviet";

        SquadFactory squadFactory = null;
        if ("soviet".equalsIgnoreCase(chooseYourNation)) {
            squadFactory = new SovietSquadFactory();
        } else if ("german".equalsIgnoreCase(chooseYourNation)) {
            squadFactory = new GermanSquadFactory();
        }

        List<Soldier> soldiers = new ArrayList<>();
        if (squadFactory != null) {
            soldiers.add((Soldier) squadFactory.createAssault());
            soldiers.add((Soldier) squadFactory.createSniper());
            soldiers.add((Soldier) squadFactory.createSupport());
            soldiers.add((Soldier) squadFactory.createMedic());
        }

        soldiers.forEach(Soldier::makePrimaryAction);

    }
}
