package com.sungsuhan.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MemberDTO {

    private String userId;
    private String password;
    private String name;
    private String phone;
    private String address;
    private double height;
    private double weight;
    private int kor;
    private int eng;
    private int math;
    private int num1;
    private String opcode;
    private int num2;
    private int age;
    private String gender;
    private String vaccine;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVaccine() {
        return vaccine;
    }
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getOpcode() {
        return opcode;
    }
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
