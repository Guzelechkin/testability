public class BonusMilesService {
    /**
     * Мили начисляются - 1 миля за каждые 20 руб. в стоимости билета.
     * cost - стоимость билета
     * return - количество бонусных миль
     */

    public int calculate(int cost) {
        int bonus;
        if (cost >= 20) {
            bonus = cost / 20;
        } else {
            bonus = 0;
        }
        return bonus;
    }
}