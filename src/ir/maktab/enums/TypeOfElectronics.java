package ir.maktab.enums;

public enum TypeOfElectronics {

    RADIO("radio"),
    TV("tv"),
    NOT_SET("not_set");

    private String abbr;

    TypeOfElectronics(String abbr) {
        this.abbr = abbr;
    }
}
