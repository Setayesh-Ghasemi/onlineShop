package ir.maktab.enums;

public enum TypeOfReadable {

    BOOK("book"),
    JOURNAL("journal"),
    NOT_SET("not_set");

    private String abbr;

    TypeOfReadable(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }
}
