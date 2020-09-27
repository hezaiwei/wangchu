package cn.hm.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * post
 * @author 
 */
@Data
public class Post implements Serializable {
    private Integer pid;

    private String title;

    private Integer uid;

    private String pcontent;

    private String pfile;

    private String pdate;

    private static final long serialVersionUID = 1L;
}