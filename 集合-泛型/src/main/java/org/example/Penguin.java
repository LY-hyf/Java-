package org.example;

public class Penguin {
    private String name;
    private String breed;

    public Penguin(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return name + ":" + breed;
    }
}
