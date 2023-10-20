package ua.ithillel.oop.person;

public enum ContractType {
    CONTRACT(1),
    FREE(2);

    private int number;

    private ContractType(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
