package com.course.poje;

public class RootUser {
    private Integer id;
    private String rootname;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRootname() {
        return rootname;
    }

    public void setRootname(String rootname) {
        this.rootname = rootname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RootUser{" +
                "id=" + id +
                ", rootname='" + rootname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public RootUser() {
    }

    public RootUser(Integer id, String rootname, String password) {
        this.id = id;
        this.rootname = rootname;
        this.password = password;
    }
}
