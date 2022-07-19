package model.resmodel;

import lombok.Setter;
import lombok.Getter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class userData {

    private String name;
    private int role;
    private String avatar;
    private String email;
    private String address;
    private String phone;

    @JsonProperty("user_id")
    private int userId;

}
