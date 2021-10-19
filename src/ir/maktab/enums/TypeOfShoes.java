package ir.maktab.enums;

public enum TypeOfShoes {

    SPORT("sport"),
    FORMAL("formal"),
    NOT_SET("not_set");

    private String abbr;

    TypeOfShoes(String abbr) {
        this.abbr = abbr;
    }
}
