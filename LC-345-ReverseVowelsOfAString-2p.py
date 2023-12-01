# Given a string s, reverse only all the vowels in the string and return it.
# The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

# Example 1:
# Input: s = "hello"
# Output: "holle"

# Example 2:
# Input: s = "leetcode"
# Output: "leotcede"

def reverseVowels(self, s):
    """
    :type s: str
    :rtype: str
    """
    word = list(s)
    vowels = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"}

    # Create 2 pointers         
    p1 = 0
    p2 = len(s)-1

    # Move a single pointer until it finds a vowel, then repeat with the other pointer. If a vowel is 
    # found, swap the characters
    while p1 < p2:
        while p1 < p2 and word[p1] not in vowels:
            p1 += 1
        
        while p1 < p2 and word[p2] not in vowels:
            p2 -= 1
        
        # Swap found vowels and then move the pointers
        word[p1], word[p2] = word[p2], word[p1]
        p1 += 1
        p2 -= 1
    
    return "".join(word)