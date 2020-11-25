package model;


import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class Student {
    private Long id;

    @Size(min = 1, max = 30)
    private String name;

    @Email(message = "Email phai nhap dung dinh dang")
    @Size(min = 1, max = 5)
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student() {
    }
}
