package com.epam.mjc.collections.combined;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new LinkedList<>();
        for (Map.Entry<String, Set<String>> set : projects.entrySet()) {
            if (set.getValue().contains(developer)) {
                result.add(set.getKey());
            }
        }
        result.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o2.compareTo(o1);
            }
            return o2.length() - o1.length();
        });
        return result;
    }
}
