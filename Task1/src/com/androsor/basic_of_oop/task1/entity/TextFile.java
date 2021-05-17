package com.androsor.basic_of_oop.task1.entity;

import java.util.Objects;

public class TextFile extends File {

    private static final String extension = ".txt";
    private String content;

    public TextFile() {
        super();
        this.content = "";
    }

    public TextFile(String name) {
        super(name);
        this.content = "";
    }

    public TextFile(String name, Directory dir) {
        super(dir, name);
        this.content = "";
    }
    public TextFile(Directory dir, String name, String content) {
        super(dir, name);
        this.content = content;
    }

    public static TextFile create(String name, Directory dir) {
        return new TextFile(name, dir);
    }

    public void open() {
        System.out.println(content);
    }

    public void addContent(String newContent) {
        this.content += newContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(content, textFile.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content);
    }

    @Override
    public String toString() {
        return "TextFile{" +
                getDirectory().getPath() + getName() + extension +
                '}';
    }
}
