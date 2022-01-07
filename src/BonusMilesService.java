public class BonusMilesService {
    public int calculate(int price) {
        int milesReward = 20;
        int miles = price / milesReward;
        return miles;
    }

}
