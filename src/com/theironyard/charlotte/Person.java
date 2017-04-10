package com.theironyard.charlotte;

/**
 * Created by Ben on 4/10/17.
 */
public class Person {
    public int age;
    public String name;

    @Override
    public String toString() {
        return String.format("This is a person named %s with age %d", name, age);
    }
}
