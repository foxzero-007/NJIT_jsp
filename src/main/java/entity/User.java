package entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String user_id;
    private String password;
    private String guide;
}
