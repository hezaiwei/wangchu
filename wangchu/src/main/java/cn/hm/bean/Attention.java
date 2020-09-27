package cn.hm.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * attention
 * @author 
 */
@Data
public class Attention implements Serializable {
    private Integer aid;

    private Integer uid;

    private Integer nid;

    private String adate;

    private static final long serialVersionUID = 1L;
}