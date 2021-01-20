package com.androsor.basic_of_oop.task1.entity;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Directory extends File {

    //private String name;
    private final List<File> files;
    private final List<Directory> directories;

    public Directory(String name) {
        super(name);
        this.files = new ArrayList<>();
        this.directories = new ArrayList<>();
    }

    public Directory(String name, List<File> files, List<Directory> directories) {
        super(name);
        if (files != null) {
            this.files = files;
        } else {
            this.files = new ArrayList<>();
        }

        if (files != null) {
            this.directories = directories;
        } else {
            this.directories = new ArrayList<>();
        }
    }


    public List<File> getFiles() {
        return this.files;
    }

    public List<Directory> getDirectories() {
        return this.directories;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void addDirectory(Directory directory) {
        this.directories.add(directory);
    }

    public void createFile(String name) {
        this.files.add(new File(name));
    }

    public void createDirectories(String name) {
        this.directories.add(new Directory(name));
    }

    private File checkFile(String name) {

        for (File file : this.files) {
            if (file.getName().equals(name)) {
                return file;
            }
        }
        throw new NullPointerException("Файл не найден!");
    }

    private Directory checkDirectory(String name) {

        for (Directory directory : this.directories) {
            if (directory.getName().equals(name)) {
                return directory;
            }
        }
        throw new NullPointerException("Директория не найдена!");
    }

    public void renameFile(String oldName, String newName) {
        checkFile(oldName).setName(newName);
    }

    public void renameDirectory(String oldName, String newName) {
        checkDirectory(oldName).setName(newName);
    }

    public String getContent(String fileName) {

        File file = checkFile(fileName);
        if (file instanceof TextFile) {
            return ((TextFile) file).getContent();
        }
        throw new NullPointerException("Указанный файл не является текстовым");
    }

    public void modifyFile(String fileName, String newContent) {

        File file = checkFile(fileName);
        if (file instanceof TextFile) {
            ((TextFile) file).setContent(newContent);
        } else {
            throw new NullPointerException("Указанный файл не является текстовым");
        }
    }

    public void removeFile(String fileName) {

        files.remove(checkFile(fileName));
    }

    public void removeDirectory(String name) {


        directories.remove(checkDirectory(name));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Directory directory = (Directory) o;
        return files.equals(directory.files) &&
                directories.equals(directory.directories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), files, directories);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Directory{");
        sb.append("name='").append(super.getName()).append('\'');
        sb.append(", files=").append(Arrays.toString(this.files.toArray()));
        sb.append(", directories=").append(Arrays.toString(this.directories.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
