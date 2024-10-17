s = input()
count = [-1] * 26

for i in range(len(s)):
    if count[ord(s[i]) - ord('a')] == -1:
        count[ord(s[i]) - ord('a')] = i

for c in count:
    print(c, end=" ")