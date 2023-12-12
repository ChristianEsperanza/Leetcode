from collections import Counter

"""
Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
    For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
    For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

Approach is to use Counters to determine the first condition, and sets to determine the second condition
"""

def closeStrings(word1, word2):
    # Counter equality indicates there are the same set of distinct characters
    c1 = Counter(word1)
    c2 = Counter(word2)

    count1 = sorted(c1.values())
    count2 = sorted(c2.values())
    
    # Use sets to determine the count of distinct characters for each word
    set1 = set(word1)
    set2 = set(word2)

    if count1 == count2 and set1 == set2:
        return True
    return False

print(closeStrings("abc", "cba"))