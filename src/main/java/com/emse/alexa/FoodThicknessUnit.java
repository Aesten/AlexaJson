package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum FoodThicknessUnit {
    CENTIMETER, FOOT, INCH, KILOMETER, METER, MILE, MILLIMETER, SPAN, YARD;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case CENTIMETER -> "CENTIMETER";
            case FOOT -> "FOOT";
            case INCH -> "INCH";
            case KILOMETER -> "KILOMETER";
            case METER -> "METER";
            case MILE -> "MILE";
            case MILLIMETER -> "MILLIMETER";
            case SPAN -> "SPAN";
            case YARD -> "YARD";
        };
    }

    @JsonCreator
    public static FoodThicknessUnit forValue(String value) throws IOException {
        if (value.equals("CENTIMETER")) return CENTIMETER;
        if (value.equals("FOOT")) return FOOT;
        if (value.equals("INCH")) return INCH;
        if (value.equals("KILOMETER")) return KILOMETER;
        if (value.equals("METER")) return METER;
        if (value.equals("MILE")) return MILE;
        if (value.equals("MILLIMETER")) return MILLIMETER;
        if (value.equals("SPAN")) return SPAN;
        if (value.equals("YARD")) return YARD;
        throw new IOException("Cannot deserialize FoodThicknessUnit");
    }
}
