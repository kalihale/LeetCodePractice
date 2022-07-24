//
// Created by kali on 7/11/22.
//

#ifndef LEETCODEPRACTICE_SOLUTION_H
#define LEETCODEPRACTICE_SOLUTION_H
#include <vector>


class Solution
{
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target)
    {
        std::vector<int> solution;
        for(int i = 0; i < nums.size() - 1; i++)
        {
            for(int j = i + 1; j < nums.size(); j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    solution.push_back(i);
                    solution.push_back(j);
                    return solution;
                }
            }
        }
        return solution;
    }
};


#endif //LEETCODEPRACTICE_SOLUTION_H
