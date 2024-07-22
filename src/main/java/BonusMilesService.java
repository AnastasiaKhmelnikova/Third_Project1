public class BonusMilesService {
    public int calculate(int price){
        int quantityRubForOwnMili = 20; //переменная для хранения количества рублей для одной бонусной мили
        return (price / quantityRubForOwnMili);
    }
}
