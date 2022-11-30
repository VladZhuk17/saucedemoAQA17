package org.tms.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    private String login = "standard_user";
    private String password = "secret_sauce";
}
