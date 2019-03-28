package cn.itsource.aigou.domain;

import javax.jws.soap.SOAPBinding;

public class User {
    private Long id;
    private String name;
    private String pwd;
    public User(){}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public User(Long id, String name, String pwd) {

        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}
