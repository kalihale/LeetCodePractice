//
// Created by kali on 8/27/22.
//

#ifndef LEETCODEPRACTICE_LISTNODE_H
#define LEETCODEPRACTICE_LISTNODE_H

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

#endif //LEETCODEPRACTICE_LISTNODE_H
