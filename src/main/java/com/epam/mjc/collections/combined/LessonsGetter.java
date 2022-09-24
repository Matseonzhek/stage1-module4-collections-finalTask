package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new TreeSet<>();

        for (Map.Entry<String, List<String>> weekDay : timetable.entrySet()) {
            result.addAll(weekDay.getValue());
        }
        return result;
    }
}
