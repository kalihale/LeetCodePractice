cmake_minimum_required(VERSION 3.22)
project(LeetCodePractice)

set(CMAKE_CXX_STANDARD 14)

include_directories(CPP_Practice)

add_executable(LeetCodePractice
        CPP_Practice/Solution.cpp
        CPP_Practice/Solution.h)
