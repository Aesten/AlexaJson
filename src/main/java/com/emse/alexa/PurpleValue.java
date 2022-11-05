package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurpleValue {
    private Brightness brightness;
    private Hue hue;
    private Brightness saturation;
    private ScaleUnion scale;
    private ValueValueUnion value;
    private AffiliateCallSign affiliateCallSign;
    private AffiliateCallSign callSign;
    private AffiliateCallSign number;
    private AffiliateCallSign uri;
    private DetectionMethods detectionMethods;
    private ValueMedia media;
    private Experience experience;
    private AffiliateCallSign identifier;
    private AffiliateCallSign name;
    private TypeUnion type;
    private UnitUnion unit;
    private AffiliateCallSign duration;
    private AffiliateCallSign end;
    private AffiliateCallSign start;
    private CustomName customName;
    private FoodCategoryUnion foodCategory;
    private AffiliateCallSign foodName;
    private FoodQuantity foodQuantity;
    private FoodStateUnion foodState;
    private FoodThickness foodThickness;

    @JsonProperty("brightness")
    public Brightness getBrightness() { return brightness; }
    @JsonProperty("brightness")
    public void setBrightness(Brightness value) { this.brightness = value; }

    @JsonProperty("hue")
    public Hue getHue() { return hue; }
    @JsonProperty("hue")
    public void setHue(Hue value) { this.hue = value; }

    @JsonProperty("saturation")
    public Brightness getSaturation() { return saturation; }
    @JsonProperty("saturation")
    public void setSaturation(Brightness value) { this.saturation = value; }

    @JsonProperty("scale")
    public ScaleUnion getScale() { return scale; }
    @JsonProperty("scale")
    public void setScale(ScaleUnion value) { this.scale = value; }

    @JsonProperty("value")
    public ValueValueUnion getValue() { return value; }
    @JsonProperty("value")
    public void setValue(ValueValueUnion value) { this.value = value; }

    @JsonProperty("affiliateCallSign")
    public AffiliateCallSign getAffiliateCallSign() { return affiliateCallSign; }
    @JsonProperty("affiliateCallSign")
    public void setAffiliateCallSign(AffiliateCallSign value) { this.affiliateCallSign = value; }

    @JsonProperty("callSign")
    public AffiliateCallSign getCallSign() { return callSign; }
    @JsonProperty("callSign")
    public void setCallSign(AffiliateCallSign value) { this.callSign = value; }

    @JsonProperty("number")
    public AffiliateCallSign getNumber() { return number; }
    @JsonProperty("number")
    public void setNumber(AffiliateCallSign value) { this.number = value; }

    @JsonProperty("uri")
    public AffiliateCallSign getURI() { return uri; }
    @JsonProperty("uri")
    public void setURI(AffiliateCallSign value) { this.uri = value; }

    @JsonProperty("detectionMethods")
    public DetectionMethods getDetectionMethods() { return detectionMethods; }
    @JsonProperty("detectionMethods")
    public void setDetectionMethods(DetectionMethods value) { this.detectionMethods = value; }

    @JsonProperty("media")
    public ValueMedia getMedia() { return media; }
    @JsonProperty("media")
    public void setMedia(ValueMedia value) { this.media = value; }

    @JsonProperty("experience")
    public Experience getExperience() { return experience; }
    @JsonProperty("experience")
    public void setExperience(Experience value) { this.experience = value; }

    @JsonProperty("identifier")
    public AffiliateCallSign getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(AffiliateCallSign value) { this.identifier = value; }

    @JsonProperty("name")
    public AffiliateCallSign getName() { return name; }
    @JsonProperty("name")
    public void setName(AffiliateCallSign value) { this.name = value; }

    @JsonProperty("@type")
    public TypeUnion getType() { return type; }
    @JsonProperty("@type")
    public void setType(TypeUnion value) { this.type = value; }

    @JsonProperty("unit")
    public UnitUnion getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(UnitUnion value) { this.unit = value; }

    @JsonProperty("duration")
    public AffiliateCallSign getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(AffiliateCallSign value) { this.duration = value; }

    @JsonProperty("end")
    public AffiliateCallSign getEnd() { return end; }
    @JsonProperty("end")
    public void setEnd(AffiliateCallSign value) { this.end = value; }

    @JsonProperty("start")
    public AffiliateCallSign getStart() { return start; }
    @JsonProperty("start")
    public void setStart(AffiliateCallSign value) { this.start = value; }

    @JsonProperty("customName")
    public CustomName getCustomName() { return customName; }
    @JsonProperty("customName")
    public void setCustomName(CustomName value) { this.customName = value; }

    @JsonProperty("foodCategory")
    public FoodCategoryUnion getFoodCategory() { return foodCategory; }
    @JsonProperty("foodCategory")
    public void setFoodCategory(FoodCategoryUnion value) { this.foodCategory = value; }

    @JsonProperty("foodName")
    public AffiliateCallSign getFoodName() { return foodName; }
    @JsonProperty("foodName")
    public void setFoodName(AffiliateCallSign value) { this.foodName = value; }

    @JsonProperty("foodQuantity")
    public FoodQuantity getFoodQuantity() { return foodQuantity; }
    @JsonProperty("foodQuantity")
    public void setFoodQuantity(FoodQuantity value) { this.foodQuantity = value; }

    @JsonProperty("foodState")
    public FoodStateUnion getFoodState() { return foodState; }
    @JsonProperty("foodState")
    public void setFoodState(FoodStateUnion value) { this.foodState = value; }

    @JsonProperty("foodThickness")
    public FoodThickness getFoodThickness() { return foodThickness; }
    @JsonProperty("foodThickness")
    public void setFoodThickness(FoodThickness value) { this.foodThickness = value; }
}