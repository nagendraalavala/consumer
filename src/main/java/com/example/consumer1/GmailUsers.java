package com.example.consumer1;

public class GmailUsers
{
    private Integer id;
    private String Name;
    private Integer Age;

    public GmailUsers(Integer id, String name, Integer age) {
        this.id = id;
        Name = name;
        Age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "GmailUsers{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                '}';
    }

    public GmailUsers()
    {

    }
}
