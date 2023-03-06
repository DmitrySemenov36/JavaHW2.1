public class BonusMilesService {
    public int calculate (int cost) {
        int percentInRubles = 20;
        int bonusMiles = cost / percentInRubles;
        return bonusMiles;
    }
}
