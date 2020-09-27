package cn.hm.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * step
 * @author 
 */
@Data
public class Step implements Serializable {
    private Integer sid;

    private Integer step;

    private Integer gid;

    private String sdescribe;

    private String sphoto;

    private static final long serialVersionUID = 1L;
}