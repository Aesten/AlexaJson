package com.emse.alexa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EndpointCapability {
    private InterfaceEnum endpointCapabilityInterface;
    private Properties properties;
    private TypeEnum type;
    private VersionUnion version;
    private SupportsDeactivationUnion supportsDeactivation;
    private Configuration configuration;
    private Boolean proactivelyReported;
    private CapabilityResourcesUnion capabilityResources;
    private Configurations configurations;
    private List<Input> inputs;
    private String instance;
    private Semantics semantics;
    private List<SupportedOperation> supportedOperations;
    private List<CameraStreamConfiguration> cameraStreamConfigurations;

    @JsonProperty("interface")
    public InterfaceEnum getEndpointCapabilityInterface() {
        return endpointCapabilityInterface;
    }

    @JsonProperty("interface")
    public void setEndpointCapabilityInterface(InterfaceEnum value) {
        this.endpointCapabilityInterface = value;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties value) {
        this.properties = value;
    }

    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(TypeEnum value) {
        this.type = value;
    }

    @JsonProperty("version")
    public VersionUnion getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(VersionUnion value) {
        this.version = value;
    }

    @JsonProperty("supportsDeactivation")
    public SupportsDeactivationUnion getSupportsDeactivation() {
        return supportsDeactivation;
    }

    @JsonProperty("supportsDeactivation")
    public void setSupportsDeactivation(SupportsDeactivationUnion value) {
        this.supportsDeactivation = value;
    }

    @JsonProperty("configuration")
    public Configuration getConfiguration() {
        return configuration;
    }

    @JsonProperty("configuration")
    public void setConfiguration(Configuration value) {
        this.configuration = value;
    }

    @JsonProperty("proactivelyReported")
    public Boolean getProactivelyReported() {
        return proactivelyReported;
    }

    @JsonProperty("proactivelyReported")
    public void setProactivelyReported(Boolean value) {
        this.proactivelyReported = value;
    }

    @JsonProperty("capabilityResources")
    public CapabilityResourcesUnion getCapabilityResources() {
        return capabilityResources;
    }

    @JsonProperty("capabilityResources")
    public void setCapabilityResources(CapabilityResourcesUnion value) {
        this.capabilityResources = value;
    }

    @JsonProperty("configurations")
    public Configurations getConfigurations() {
        return configurations;
    }

    @JsonProperty("configurations")
    public void setConfigurations(Configurations value) {
        this.configurations = value;
    }

    @JsonProperty("inputs")
    public List<Input> getInputs() {
        return inputs;
    }

    @JsonProperty("inputs")
    public void setInputs(List<Input> value) {
        this.inputs = value;
    }

    @JsonProperty("instance")
    public String getInstance() {
        return instance;
    }

    @JsonProperty("instance")
    public void setInstance(String value) {
        this.instance = value;
    }

    @JsonProperty("semantics")
    public Semantics getSemantics() {
        return semantics;
    }

    @JsonProperty("semantics")
    public void setSemantics(Semantics value) {
        this.semantics = value;
    }

    @JsonProperty("supportedOperations")
    public List<SupportedOperation> getSupportedOperations() {
        return supportedOperations;
    }

    @JsonProperty("supportedOperations")
    public void setSupportedOperations(List<SupportedOperation> value) {
        this.supportedOperations = value;
    }

    @JsonProperty("cameraStreamConfigurations")
    public List<CameraStreamConfiguration> getCameraStreamConfigurations() {
        return cameraStreamConfigurations;
    }

    @JsonProperty("cameraStreamConfigurations")
    public void setCameraStreamConfigurations(List<CameraStreamConfiguration> value) {
        this.cameraStreamConfigurations = value;
    }
}
