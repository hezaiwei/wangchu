package cn.hm.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * comment
 * @author 
 */
@Data
public class Comment implements Serializable {
    private Integer cid;

    private Integer uid;

    private String comment;

    private String ctype;

    private Integer typeid;

    private String cdate;

    private static final long serialVersionUID = 1L;
}