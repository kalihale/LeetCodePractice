//
// Created by kali on 7/11/22.
//

#ifndef LEETCODEPRACTICE_SOLUTION_H
#define LEETCODEPRACTICE_SOLUTION_H

#include <vector>
#include <map>
#include <string>
#include <iostream>
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

        try{
            while(true) {
                curr->next = prev;
                prev = curr;
                curr = next;
                next = curr->next;
            }
        }catch(int i){
            std::cout << i << std::endl;
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

    void reverseString(std::vector<char>& s) {
        for(int i = 0; i < s.size()/2; ++i) {
            char x = s[s.size() - 1 - i];
            s[s.size() - 1 - i] = s[i];
            s[i] = x;
        }
    }

    bool isPalindrome(std::string s) {
        std::string t;
        for(char i : s) {
            if((i <= 'z' && i >= 'a') || i <= 'Z' && i >= 'A' || i <= '9' && i >= '0') {
                if(isalpha(i)) t += tolower(i);
                else t += i;
            }
        }
        for(int i = 0; i < t.size()/2; ++i) {
            if(t[i] != t[t.size() - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    bool isAnagram(std::string s, std::string t) {
        std::map<char, int> smap;
        std::map<char, int> tmap;
        if(s.size() != t.size()) {
            return false;
        }
        for(char c:s) {
            try {
                smap.at(c) = smap.at(c) + 1;
            }catch(std::out_of_range e){
                smap.insert(std::pair<char, int>(c, 1));
            }
        }
        for(char c:t) {
            try {
                tmap.at(c) = tmap.at(c) + 1;
            }catch(std::out_of_range e){
                tmap.insert(std::pair<char, int>(c, 1));
            }
        }
        return smap == tmap;
    }

    int strStr(std::string haystack, std::string needle) {
        if(needle.empty() || haystack == needle) return 0;
        if(needle.size() > haystack.size()) return -1;
        for(int i = 0; i <= haystack.size() - needle.size(); ++i) {
            int j = 0;
            for(; j < needle.size(); j++) {
                if(haystack[i + j] != needle[j]) break;
            }
            if(j == needle.size()) return i;
        }
        return -1;
    }

};


#endif //LEETCODEPRACTICE_SOLUTION_H
