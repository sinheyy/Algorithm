import sys
from itertools import permutations

def calculate(arr):
    result = 0

    for i in range(n - 1):
        result += abs(arr[i] - arr[i+1])

    return result

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split(" ")))

max = -1
for a in list(permutations(arr, n)):
    if max < calculate(a):
        max = calculate(a)

print(max)