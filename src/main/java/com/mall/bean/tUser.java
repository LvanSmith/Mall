package com.mall.bean;

public class tUser {
    int uid;
    String uusername;
    String uphone;
    String upassword;
    String uemail;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    @Override
    public String toString() {
        return "t_user{" +
                "uid=" + uid +
                ", uusername='" + uusername + '\'' +
                ", uphone='" + uphone + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uemail='" + uemail + '\'' +
                '}';
    }
}
