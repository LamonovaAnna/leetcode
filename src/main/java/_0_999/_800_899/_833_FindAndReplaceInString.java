package _0_999._800_899;

import java.util.*;

// 833. Find And Replace in String
public class _833_FindAndReplaceInString {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int[] sortedInd = Arrays.copyOf(indices, indices.length);
        Arrays.sort(sortedInd);

        if (!Arrays.equals(indices, sortedInd)) {
            String[] sourcesSort = new String[sources.length];
            String[] targetsSort = new String[targets.length];
            for (int i = 0; i < sortedInd.length; i++) {
                for (int j = 0; j < indices.length; j++) {
                    if (sortedInd[i] == indices[j]) {
                        sourcesSort[i] = sources[j];
                        targetsSort[i] = targets[j];
                    }
                }
            }
            sources = sourcesSort;
            targets = targetsSort;
        }

        
        StringBuilder sb = new StringBuilder();

        int start = 0;
        for (int i = 0; i < sortedInd.length; i++) {
            int key = sortedInd[i];
            if (key >= start) {
                if (key + (sources[i].length()) <= s.length()) {
                    String ss = s.substring(key, key + (sources[i].length()));
                    if (ss.equals(sources[i])) {
                        if (key > start) {
                            sb.append(s, start, key);
                        }
                        sb.append(targets[i]);
                        start = key + sources[i].length();
                    }
                }
            }
        }

        if (start < s.length()) {
            sb.append(s, start, s.length());
        }

        return sb.toString();
    }

    public void solution() {
        System.out.println(findReplaceString("abcde", new int[] {2,2},
                new String[] {"cde","cdef"}, new String[]{"fe","f"})); // abfe
        //System.out.println(findReplaceString("abcd", new int[] {0, 2},new String[] {"a", "cd"}, new String[]{"eee", "ffff"}));
    }
}
