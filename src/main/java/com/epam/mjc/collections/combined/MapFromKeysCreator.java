package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        Set<String> keySet = sourceMap.keySet();
        int stringLength;
        for (String element : keySet) {
            stringLength = element.length();
            if (!result.containsKey(stringLength)) {
                Set<String> value = new HashSet<>();
                value.add(element);
                result.put(stringLength, value);
            } else {
                Set<String> existValue = result.get(stringLength);
                existValue.add(element);
                result.put(stringLength, existValue);
            }
        }
        return result;
    }
}
