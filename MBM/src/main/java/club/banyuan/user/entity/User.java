package club.banyuan.user.entity;

import java.io.Serializable;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户密码
     */
    private String pwd;

    /**
     *  确认密码
     */
    private String pwdConfirm;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 用户权限
     */
    private String userTypeStr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwdConfirm() {
        return pwdConfirm;
    }

    public void setPwdConfirm(String pwdConfirm) {
        this.pwdConfirm = pwdConfirm;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserTypeStr() {
        return userTypeStr;
    }

    public void setUserTypeStr(String userTypeStr) {
        this.userTypeStr = userTypeStr;
    }
}