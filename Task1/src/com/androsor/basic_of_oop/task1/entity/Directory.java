package com.androsor.basic_of_oop.task1.entity;

import java.util.Objects;

public class Directory {

    private final String path;

    public Directory() {
        this.path = "C";
    }

    public Directory(String path) {
        this.path = path;
    }

    public String getPath() {
        return path + "\\";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(path, directory.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path);
    }

    @Override
    public String toString() {
        return "Directory [path=" + path + "\\" + "]";
    }
}
