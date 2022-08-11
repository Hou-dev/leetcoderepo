#include <iostream>
#include <vector>
#include <alogorithm>


class Solution {
public:
    void reverseString(vector<char>& s) {
        for (auto start = s.begin(), end = std::prev(s.end());
            start < end; ++start, --end) {
            std::swap(*start, *end);
    }
    }
};
