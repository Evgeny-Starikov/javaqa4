public class BonusMilesService {

    public int calculate(int price) {

        int milesEquivalent = 20;

        int bonus = price / milesEquivalent;

        return  bonus;

    }

}


