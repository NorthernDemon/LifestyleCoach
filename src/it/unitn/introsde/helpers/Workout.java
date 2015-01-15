package it.unitn.introsde.helpers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;

import java.util.Objects;

@JsonRootName("workout")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"type", "value"})
public class Workout {

    @JsonProperty(required = true)
    private String type;

    @JsonProperty(required = true)
    private String value;

    public Workout() {
    }

    public Workout(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        if (o instanceof Workout) {
            Workout object = (Workout) o;

            return Objects.equals(type, object.type)
                    && Objects.equals(value, object.value);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("type", type)
                .add("value", value)
                .toString();
    }
}
