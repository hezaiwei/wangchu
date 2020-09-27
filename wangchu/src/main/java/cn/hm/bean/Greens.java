package cn.hm.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * greens
 * @author 
 */
@Data
public class Greens implements Serializable {
    private Integer gid;

    private String gname;

    private String gstyle;

    private String gcover;

    private String gwriter;

    private String gdate;

    private String gneed;

    private String gmaterial;

    private static final long serialVersionUID = 1L;
}