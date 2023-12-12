
# Approach is to use a dictionary to count how many times a value is seen throughout an array. Transform the hashmap into 
# a set (which cannot hold duplicates), and compare the length to find the solution.
def uniqueOccurences(arr):
    seen = dict()
    for i in arr:
        if i in seen:
            seen[i] = seen[i]+1
        else:
            seen[i] = 1
    return len(seen.values()) == len(set(seen.values()))



print(uniqueOccurences([1,2,2,1,1,3]))
    
