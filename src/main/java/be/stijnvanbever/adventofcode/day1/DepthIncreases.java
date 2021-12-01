package be.stijnvanbever.adventofcode.day1;

import java.util.List;

public class DepthIncreases {

    public Integer countDepthIncreases(List<Integer> depths) {
        int increases = 0;
        Integer currentDepth = null;
        for (Integer depth : depths) {
            if (currentDepth != null && depth > currentDepth) {
                increases++;
            }

            currentDepth = depth;
        }

        return increases;
    }

    public Integer countWithSlidingWindows(List<Integer> depths) {
        int increases = 0;
        for (int i = 0; i < depths.size() - 3; i++) {
            if (getSumOfWindow(depths, i + 1) > getSumOfWindow(depths, i)) {
                increases++;
            }
        }

        return increases;
    }

    public int getSumOfWindow(List<Integer> depths, int start) {
        return depths.stream().mapToInt(Integer::intValue).skip(start).limit(3).sum();
    }
}
