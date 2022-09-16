package uz.nodir.market.model;

public enum ProductState {
    FRESH(1),
    WARNING(2),
    DANGER(3);



    private int stateId;

    ProductState(int stateId) {
        this.stateId = stateId;
    }

    public int getStateId() {
        return stateId;
    }
}
