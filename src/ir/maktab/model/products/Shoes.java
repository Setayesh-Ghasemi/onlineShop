package ir.maktab.model.products;

import ir.maktab.enums.TypeOfShoes;

public class Shoes extends Product {

    private int size;
    private String color;
    private TypeOfShoes typeOfShoes;

    public Shoes(int count, double amount, int size, String color, TypeOfShoes typeOfShoes) {
        super(count, amount);
        this.size = size;
        this.color = color;
        this.typeOfShoes = typeOfShoes;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TypeOfShoes getTypeOfShoes() {
        return typeOfShoes;
    }

    public void setTypeOfShoes(TypeOfShoes typeOfShoes) {
        this.typeOfShoes = typeOfShoes;
    }
}
