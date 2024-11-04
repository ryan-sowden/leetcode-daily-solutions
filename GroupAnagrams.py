"""
49. Group Anagrams

Given an arry of string strs, group the anagrams together. 
You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word
or phrase, typically using all the orginial letters exactly once.

Example 1: 
input strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
"""
from collections import defaultdict
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]

anagram_map = defaultdict(list)
result = []

for s in strs:
    sorted_s = tuple(sorted(s))
    anagram_map[sorted_s].append(s)

for value in anagram_map.values():
    result.append(value)

print(result)