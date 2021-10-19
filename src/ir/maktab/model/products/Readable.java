package ir.maktab.model.products;

import ir.maktab.enums.TypeOfReadable;

public class Readable extends Product {

    private int numberOfPage;
    private TypeOfReadable typeOfReadable;

    public Readable(int count, double amount, int numberOfPage, TypeOfReadable typeOfReadable) {
        super(count, amount);
        this.numberOfPage = numberOfPage;
        this.typeOfReadable = typeOfReadable;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public TypeOfReadable getTypeOfReadable() {
        return typeOfReadable;
    }

    public void setTypeOfReadable(TypeOfReadable typeOfReadable) {
        this.typeOfReadable = typeOfReadable;
    }
}
