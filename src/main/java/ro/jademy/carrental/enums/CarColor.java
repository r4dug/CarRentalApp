package ro.jademy.carrental.enums;

import ro.jademy.carrental.model.Car;

public enum CarColor {

    WHITE,
    BLUE(true),
    RED(true),
    SILVER,
    BLACK(true);

    private boolean isPaintMetallic;

    CarColor () {}

    CarColor (boolean isPaintMetallic) {
        this.isPaintMetallic=isPaintMetallic;
    }

    public boolean isPaintMetallic() {
        return isPaintMetallic;
    }
}
