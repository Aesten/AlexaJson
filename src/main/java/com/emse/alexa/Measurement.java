package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Measurement {
    private MeasurementType type;
    private UnitUnit unit;

    @JsonProperty("@type")
    public MeasurementType getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(MeasurementType value) {
        this.type = value;
    }

    @JsonProperty("unit")
    public UnitUnit getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(UnitUnit value) {
        this.unit = value;
    }
}
