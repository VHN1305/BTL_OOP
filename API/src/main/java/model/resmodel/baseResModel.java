package model.resmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class baseResModel {
    @JsonProperty ("code")
    private int code;

    @JsonProperty ("message")
    private String message;
}
