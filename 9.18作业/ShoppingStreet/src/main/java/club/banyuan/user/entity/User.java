package club.banyuan.user.entity;

public class User {

    private Integer id;
    private String name;
    private String pwd;
    private String pwdConfirm;
    private Integer userType;

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", pwdConfirm='" + pwdConfirm + '\'' +
                ", userType=" + userType +
                '}';
    }
}