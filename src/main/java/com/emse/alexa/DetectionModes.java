package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetectionModes {
    private AnimalPresence animalPresence;
    private BabyCry babyCry;
    private CarbonMonoxideSiren carbonMonoxideSiren;
    private DogBark dogBark;
    private EntityDetection entityDetection;
    private GlassBreak glassBreak;
    private HumanPresence humanPresence;
    private SmokeSiren smokeSiren;
    private VehiclePresence vehiclePresence;

    @JsonProperty("animalPresence")
    public AnimalPresence getAnimalPresence() {
        return animalPresence;
    }

    @JsonProperty("animalPresence")
    public void setAnimalPresence(AnimalPresence value) {
        this.animalPresence = value;
    }

    @JsonProperty("babyCry")
    public BabyCry getBabyCry() {
        return babyCry;
    }

    @JsonProperty("babyCry")
    public void setBabyCry(BabyCry value) {
        this.babyCry = value;
    }

    @JsonProperty("carbonMonoxideSiren")
    public CarbonMonoxideSiren getCarbonMonoxideSiren() {
        return carbonMonoxideSiren;
    }

    @JsonProperty("carbonMonoxideSiren")
    public void setCarbonMonoxideSiren(CarbonMonoxideSiren value) {
        this.carbonMonoxideSiren = value;
    }

    @JsonProperty("dogBark")
    public DogBark getDogBark() {
        return dogBark;
    }

    @JsonProperty("dogBark")
    public void setDogBark(DogBark value) {
        this.dogBark = value;
    }

    @JsonProperty("entityDetection")
    public EntityDetection getEntityDetection() {
        return entityDetection;
    }

    @JsonProperty("entityDetection")
    public void setEntityDetection(EntityDetection value) {
        this.entityDetection = value;
    }

    @JsonProperty("glassBreak")
    public GlassBreak getGlassBreak() {
        return glassBreak;
    }

    @JsonProperty("glassBreak")
    public void setGlassBreak(GlassBreak value) {
        this.glassBreak = value;
    }

    @JsonProperty("humanPresence")
    public HumanPresence getHumanPresence() {
        return humanPresence;
    }

    @JsonProperty("humanPresence")
    public void setHumanPresence(HumanPresence value) {
        this.humanPresence = value;
    }

    @JsonProperty("smokeSiren")
    public SmokeSiren getSmokeSiren() {
        return smokeSiren;
    }

    @JsonProperty("smokeSiren")
    public void setSmokeSiren(SmokeSiren value) {
        this.smokeSiren = value;
    }

    @JsonProperty("vehiclePresence")
    public VehiclePresence getVehiclePresence() {
        return vehiclePresence;
    }

    @JsonProperty("vehiclePresence")
    public void setVehiclePresence(VehiclePresence value) {
        this.vehiclePresence = value;
    }
}
