package controllers;
/*
import io.swagger.annotations.ApiModelProperty;*/

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentReqModel {

    @ApiModelProperty(value = "id")
    int id;
    @ApiModelProperty(value = "name")
    String name;
    @ApiModelProperty(value = "age")
    int age;

/*    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
}
