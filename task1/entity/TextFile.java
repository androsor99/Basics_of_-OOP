package com.androsor.basic_of_oop.task1.entity;


import java.util.Objects;

public class TextFile extends File {
    private String content;

    public TextFile(String name, String content) {
        super(name);
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof TextFile)) {
            return false;
        } else if (!super.equals(o)) {
            return false;
        } else {
            TextFile textFile = (TextFile)o;
            return Objects.equals(this.getContent(), textFile.getContent());
        }
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), this.getContent());
    }

    @Override
    public String toString() {
        String sb = "TextFile{" + "name='" + super.getName() + '\'' +
                ", content='" + content + '\'' +
                '}';
        return sb;
    }
}
