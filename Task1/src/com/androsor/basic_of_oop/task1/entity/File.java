package com.androsor.basic_of_oop.task1.entity;

import java.util.Objects;

public class File {

    private String name;
    private Directory directory;

    public File() {
        this.directory = new Directory();
        this.name = "новый";
    }

    public File(Directory dir, String name) {
        this.directory = dir;
        this.name = name;
    }

    public File(String name) {
        this.directory = new Directory();
        this.name = name;
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public void delete() {
        this.directory = null;
        this.name = null;
    }

    public String getName() {
        return name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void renameDirectory(Directory directory) {
        this.directory = directory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(name, file.name) && Objects.equals(directory, file.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, directory);
    }

    @Override
    public String toString() {
        return "File{" +
                directory + "\\" + name +
                "}";
    }
}



