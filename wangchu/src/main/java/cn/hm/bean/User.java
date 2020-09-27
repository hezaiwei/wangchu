package cn.hm.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer uid;

    private String username;

    private String nikename;

    private String img;

    private String password;

    private String sex;

    private String phone;

    private Integer type;

    private static final long serialVersionUID = 1L;
}