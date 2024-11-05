import sys

input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    candidates = []

    for _ in range(N):
        s, m = map(int, input().split())
        candidates.append((s, m))

    candidates.sort()

    max = 1e9
    count = 0
    for i in range(N):
        if candidates[i][1] < max:
            count += 1
            max = candidates[i][1]
    
    print(count)