//
// Created by kali on 7/11/22.
//

#ifndef LEETCODEPRACTICE_SOLUTION_H
#define LEETCODEPRACTICE_SOLUTION_H

#include <vector>
#include <map>


class Solution {
public:
    // ／(^ㅅ^)＼ O(n^2) solution
    std::vector<int> twoSum(std::vector<int> &nums, int target) {
        std::vector<int> solution;
        for(int i = 0; i < nums.size() - 1; i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if(nums[i] + nums[j] == target) {
                    solution.push_back(i);
                    solution.push_back(j);
                    return solution;
                }
            }
        }
        return solution;
    }

    int removeDuplicates(std::vector<int> &nums) {
        // ／(^ㅅ^)＼ k is the length of the final vector
        //           k will also be used as the "anchor point" for where to compare numbers
        int k = 1;
        // ／(^ㅅ^)＼ Start loop at k, which will be one greater than the number to compare to
        for(int i = k; i < nums.size(); ++i) {
            // ／(^ㅅ^)＼ Find the next larger number than the number at the "anchor point"
            if(nums[k - 1] < nums[i]) {
                // ／(^ㅅ^)＼ Set the next number to the larger number and increment k
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    bool containsDuplicate(std::vector<int> &nums) {
        std::map<int, int> map;
        for(int i: nums) {
            // ／(^ㅅ^)＼ If the element doesn't exist, add the element
            //           map efficiency is O(log n)
            if(map.find(i) == map.end())
            {
                map[i] = 1;
            }
            // ／(^ㅅ^)＼ Otherwise, there is a duplicate
            else
            {
                return true;
            }
        }
        return false;
    }
};


#endif //LEETCODEPRACTICE_SOLUTION_H
