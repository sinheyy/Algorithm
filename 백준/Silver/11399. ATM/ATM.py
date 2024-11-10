import sys

N = int(sys.stdin.readline())
P = list(map(int, sys.stdin.readline().split(" ")))

P = sorted(P)
result = 0
for n in range(1, N + 1):
    result = result + sum(P[0:n])

print(result)