package com.javarush.telegram;

public class UserInfo {
    public String name;
    public String age;
    public String city;
    public String occupation;
    public String hobby;
    public String goals;

    private String fieldToString(String str, String description) {
        if (str != null && !str.isEmpty())
            return description + ": " + str + "\n";
        else
            return "";
    }

    @Override
    public String toString() {
        String result = "";

        result += fieldToString(name, "Ім'я");
        result += fieldToString(age, "Вік");
        result += fieldToString(city, "Місто");
        result += fieldToString(occupation, "Професія");
        result += fieldToString(hobby, "Хобі");
        result += fieldToString(goals, "Цілі знайомства");

        return result;
    }
}
