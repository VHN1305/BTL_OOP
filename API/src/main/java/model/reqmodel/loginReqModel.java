package model.reqmodel;

import lombok.Setter;
import lombok.Getter;


@Getter
@Setter
public class loginReqModel {

    private String email;
    private String password;
    public loginReqModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
