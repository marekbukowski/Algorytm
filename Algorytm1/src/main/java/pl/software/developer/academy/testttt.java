package pl.software.developer.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class testttt {

    public int solution(int N) {
        // write your code in Java SE 8
        return Optional.ofNullable(N)
                .map(Integer::toBinaryString)
                .filter(n -> n.length() > 1)
                .map(t -> {
                    List<Integer> counts = new ArrayList<>();
                    int count = 0;
                    for(int i = 0; i < t.length(); i++)
                    {
                        if(t.charAt(i) == '0') {
                            count += 1;
                        } else if(count > 0) {
                            counts.add(count);
                            count = 0;
                        }
                    }
                    if(counts.size() > 0) {
                        Collections.sort(counts);
                        return counts.get(counts.size() - 1);
                    }
                    return 0;
                })
                .orElse(0);
    }
}

