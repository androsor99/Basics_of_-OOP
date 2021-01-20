package com.androsor.basic_of_oop.task1.entity;

import java.util.Objects;

public class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof File)) {
            return false;
        } else {
            File file = (File)o;
            return Objects.equals(this.getName(), file.getName());
        }
    }

    public int hashCode() {
        return Objects.hash(this.getName());
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}



