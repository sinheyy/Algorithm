import sys

n = int(sys.stdin.readline())
budget = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())

left = 0
right = max(budget)
answer = -1

while left <= right:
    middle = (left + right) // 2

    sum = 0
    for i in range(n):
        sum += min(middle, budget[i])
    
    if sum <= m:
        answer = middle
        left = middle + 1
    else:
        right = middle - 1

print(answer)