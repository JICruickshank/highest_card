public class Card {
    private SuitType suitType;
    private ValueType valueType;

    public Card(SuitType suitType, ValueType valueType) {
        this.suitType = suitType;
        this.valueType = valueType;
    }

    public SuitType getSuitType() {
        return this.suitType;
    }

    public int getScore() {
        return this.valueType.getScore();
    }
}
