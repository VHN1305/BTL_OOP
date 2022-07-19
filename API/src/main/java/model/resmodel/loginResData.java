package model.resmodel;

import lombok.Setter;
import lombok.Getter;

import com.fasterxml.jackson.annotation.JsonProperty;


@Setter
@Getter
public class loginResData  {
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty ("user")
    private userData user;

    @JsonProperty("token_type")
    private String token_Type;

    @JsonProperty("expires_in")
    private int expiresIn;
    private int exp;
}
