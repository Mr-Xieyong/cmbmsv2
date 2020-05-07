package com.xy.cmbms.entity.vos;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Xieyong
 * @date 2020/1/14 - 17:01
 */
@Data
public class OfficeVo implements Serializable {

    private Integer userId;
    private Integer id; //组织Id
    private String name;    //组织名
    private Integer type;   //组织类型：1.班级，2.社团，3.其他
    private String primaryPerson;  //机构负责人
    private String phone;  //组织(负责人)联系电话
    private String email;   //组织邮箱
    private Integer createBy;  //创建人
    private Date createDate;   //创建时间(注册时间)
    private Integer updateBy;  //更改人
    private Date updateDate;   //更改时间
    private String remarks; //备注
    private Integer delFlag;   //删除标记：1：正常，0：注销机构

}
