//
// Created by kali on 7/11/22.
//

#ifndef LEETCODEPRACTICE_SOLUTION_H
#define LEETCODEPRACTICE_SOLUTION_H

#include <vector>
#include <map>
#include <string>
#include "ListNode.h"


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

    int singleNumber(std::vector<int>& nums) {
        // ／(^ㅅ^)＼ Map efficiency is O(log n)
        std::map<int, int> map;
        for(int i: nums) {
            if(map.find(i) == map.end()) {
                map[i] = 1;
            }
            else {
                map[i] = map[i] + 1;
            }
        }
        // ／(^ㅅ^)＼ Search efficiency is O(n)
        for(auto single: map) {
            if(single.second == 1) {
                return single.first;
            }
        }
        return -1;
    }

    // ／(^ㅅ^)＼ Unfinished
    std::vector<int> plusOne(std::vector<int>& digits) {
        bool carry;
        for(int i = digits.size(); i >= 0; i++)
        {
            if(digits[i] == 9)
            {
                carry = true;
            }
            else
            {
                digits[i] = digits[i]++;
                return digits;
            }
        }
        return digits;
    }

    // ／(^ㅅ^)＼ Help, not working!
    ListNode* reverseList(ListNode* head) {
        ListNode* prev = head;
        ListNode* curr = head->next;
        ListNode* next = curr->next;
        curr->next = next;
        prev->next = nullptr;
        prev = curr;
        curr = next;
        next = curr->next;

        while(next->next != nullptr){
            curr->next = prev;
            prev = curr;
            curr = next;
            next = curr->next;
        }

        next->next = curr;

        return next;
    }

    std::vector<std::string> fizzBuzz(int n) {
        std::vector<std::string> ans;

        for(int i = 1; i <= n; ++i) {
            std::string output = "";
            if(i % 3 == 0) {
                output += "Fizz";
            }
            if(i % 5 == 0) {
                output += "Buzz";
            }
            if(output.empty()) {
                ans.push_back(std::to_string(i));
            }
            else {
                ans.push_back(output);
            }
        }

        return ans;
    }


};


#endif //LEETCODEPRACTICE_SOLUTION_H
