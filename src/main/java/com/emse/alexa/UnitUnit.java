package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum UnitUnit {
    AU_TABLESPOON, CUBIC_CENTIMETER, CUBIC_FOOT, CUBIC_INCH, CUBIC_METER, CUBIC_YARD, DRAM, GRAM, KILOGRAM, LITER, METRIC_CUP, METRIC_POUND, METRIC_TEASPOON, MICROGRAM, MILLIGRAM, MILLILITER, OUNCE, POUND, UK_CUP, UK_FLUID_DRAM, UK_FLUID_OUNCE, UK_GALLON, UK_GILL, UK_PINT, UK_QUART, UK_TABLESPOON, US_DRAM, US_DRY_GALLON, US_DRY_PINT, US_DRY_QUART, US_FLUID_CUP, US_FLUID_GALLON, US_FLUID_OUNCE, US_FLUID_PINT, US_FLUID_QUART, US_GILL, US_TABLESPOON, US_TEASPOON;

    @JsonValue
    public String toValue() {
        return switch (this) {
            case AU_TABLESPOON -> "AU_TABLESPOON";
            case CUBIC_CENTIMETER -> "CUBIC_CENTIMETER";
            case CUBIC_FOOT -> "CUBIC_FOOT";
            case CUBIC_INCH -> "CUBIC_INCH";
            case CUBIC_METER -> "CUBIC_METER";
            case CUBIC_YARD -> "CUBIC_YARD";
            case DRAM -> "DRAM";
            case GRAM -> "GRAM";
            case KILOGRAM -> "KILOGRAM";
            case LITER -> "LITER";
            case METRIC_CUP -> "METRIC_CUP";
            case METRIC_POUND -> "METRIC_POUND";
            case METRIC_TEASPOON -> "METRIC_TEASPOON";
            case MICROGRAM -> "MICROGRAM";
            case MILLIGRAM -> "MILLIGRAM";
            case MILLILITER -> "MILLILITER";
            case OUNCE -> "OUNCE";
            case POUND -> "POUND";
            case UK_CUP -> "UK_CUP";
            case UK_FLUID_DRAM -> "UK_FLUID_DRAM";
            case UK_FLUID_OUNCE -> "UK_FLUID_OUNCE";
            case UK_GALLON -> "UK_GALLON";
            case UK_GILL -> "UK_GILL";
            case UK_PINT -> "UK_PINT";
            case UK_QUART -> "UK_QUART";
            case UK_TABLESPOON -> "UK_TABLESPOON";
            case US_DRAM -> "US_DRAM";
            case US_DRY_GALLON -> "US_DRY_GALLON";
            case US_DRY_PINT -> "US_DRY_PINT";
            case US_DRY_QUART -> "US_DRY_QUART";
            case US_FLUID_CUP -> "US_FLUID_CUP";
            case US_FLUID_GALLON -> "US_FLUID_GALLON";
            case US_FLUID_OUNCE -> "US_FLUID_OUNCE";
            case US_FLUID_PINT -> "US_FLUID_PINT";
            case US_FLUID_QUART -> "US_FLUID_QUART";
            case US_GILL -> "US_GILL";
            case US_TABLESPOON -> "US_TABLESPOON";
            case US_TEASPOON -> "US_TEASPOON";
        };
    }

    @JsonCreator
    public static UnitUnit forValue(String value) throws IOException {
        if (value.equals("AU_TABLESPOON")) return AU_TABLESPOON;
        if (value.equals("CUBIC_CENTIMETER")) return CUBIC_CENTIMETER;
        if (value.equals("CUBIC_FOOT")) return CUBIC_FOOT;
        if (value.equals("CUBIC_INCH")) return CUBIC_INCH;
        if (value.equals("CUBIC_METER")) return CUBIC_METER;
        if (value.equals("CUBIC_YARD")) return CUBIC_YARD;
        if (value.equals("DRAM")) return DRAM;
        if (value.equals("GRAM")) return GRAM;
        if (value.equals("KILOGRAM")) return KILOGRAM;
        if (value.equals("LITER")) return LITER;
        if (value.equals("METRIC_CUP")) return METRIC_CUP;
        if (value.equals("METRIC_POUND")) return METRIC_POUND;
        if (value.equals("METRIC_TEASPOON")) return METRIC_TEASPOON;
        if (value.equals("MICROGRAM")) return MICROGRAM;
        if (value.equals("MILLIGRAM")) return MILLIGRAM;
        if (value.equals("MILLILITER")) return MILLILITER;
        if (value.equals("OUNCE")) return OUNCE;
        if (value.equals("POUND")) return POUND;
        if (value.equals("UK_CUP")) return UK_CUP;
        if (value.equals("UK_FLUID_DRAM")) return UK_FLUID_DRAM;
        if (value.equals("UK_FLUID_OUNCE")) return UK_FLUID_OUNCE;
        if (value.equals("UK_GALLON")) return UK_GALLON;
        if (value.equals("UK_GILL")) return UK_GILL;
        if (value.equals("UK_PINT")) return UK_PINT;
        if (value.equals("UK_QUART")) return UK_QUART;
        if (value.equals("UK_TABLESPOON")) return UK_TABLESPOON;
        if (value.equals("US_DRAM")) return US_DRAM;
        if (value.equals("US_DRY_GALLON")) return US_DRY_GALLON;
        if (value.equals("US_DRY_PINT")) return US_DRY_PINT;
        if (value.equals("US_DRY_QUART")) return US_DRY_QUART;
        if (value.equals("US_FLUID_CUP")) return US_FLUID_CUP;
        if (value.equals("US_FLUID_GALLON")) return US_FLUID_GALLON;
        if (value.equals("US_FLUID_OUNCE")) return US_FLUID_OUNCE;
        if (value.equals("US_FLUID_PINT")) return US_FLUID_PINT;
        if (value.equals("US_FLUID_QUART")) return US_FLUID_QUART;
        if (value.equals("US_GILL")) return US_GILL;
        if (value.equals("US_TABLESPOON")) return US_TABLESPOON;
        if (value.equals("US_TEASPOON")) return US_TEASPOON;
        throw new IOException("Cannot deserialize UnitUnit");
    }
}
