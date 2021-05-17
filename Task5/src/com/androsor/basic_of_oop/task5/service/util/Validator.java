package com.androsor.basic_of_oop.task5.service.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean validName(String name) {
        Pattern pattern = Pattern.compile("^[\\s0-9А-Яа-я!@.,;:'\"?-]{1,100}\\z");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
