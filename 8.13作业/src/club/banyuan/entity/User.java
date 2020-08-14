package club.banyuan.entity;

public class User {

  private int id;
  private String loginName;
  private String userName;
  private String password;
  private boolean sex;
  private int identifyCode;
  private String email;
  private int mobil;
  private boolean type;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
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

  public boolean isSex() {
    return sex;
  }

  public void setSex(boolean sex) {
    this.sex = sex;
  }

  public int getIdentifyCode() {
    return identifyCode;
  }

  public void setIdentifyCode(int identifyCode) {
    this.identifyCode = identifyCode;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getMobil() {
    return mobil;
  }

  public void setMobil(int mobil) {
    this.mobil = mobil;
  }

  public boolean isType() {
    return type;
  }

  public void setType(boolean type) {
    this.type = type;
  }
}
