package club.banyuan.entity;

public class User {

    private Integer id;
    private String userName;
    private String password;
    private String identifyCode;
    private String mobile;
    private String address;
    private Integer postalCode;

    public User() {
    }

    public User(Integer id, String userName, String password, String identifyCode, String mobile, String address, Integer postalCode) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.identifyCode = identifyCode;
        this.mobile = mobile;
        this.address = address;
        this.postalCode = postalCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", identifyCode='" + identifyCode + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
