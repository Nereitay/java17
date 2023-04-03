package com.itheima.d3_char_buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static final String SOURCE_FILE = "io-app2/src/csb.txt";
    public static final String TARGET_FILE = "io-app2/src/csb-copy.txt";

    public static final List<String> SORT_ORDER = List.of("一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");

    public static void main(String[] args) {

        try (
                BufferedReader br = new BufferedReader(new FileReader(SOURCE_FILE));
                BufferedWriter bw = new BufferedWriter(new FileWriter(TARGET_FILE))
        ) {
            List<String> contentList = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                contentList.add(line);
            }
            contentList.sort(Comparator.comparingInt(o -> SORT_ORDER.indexOf(o.substring(0, o.indexOf(".")))));
            for (String s : contentList) {
                bw.write(s);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
