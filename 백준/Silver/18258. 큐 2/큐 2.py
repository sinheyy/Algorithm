import sys
from collections import deque

n = int(input())
d = deque()

for i in range(n):
    order = sys.stdin.readline().split()

    if order[0] == "push":
        d.append(int(order[1]))
    if order[0] == "pop":
        if len(d) != 0:
            print(d.popleft())
        else:
            print("-1")
    if order[0] == "size":
        print(len(d))
    if order[0] == "empty":
        print(1) if len(d) == 0 else print(0)
    if order[0] == "front":
        if len(d) == 0:
            print(-1)
        else:
            print(d[0])
    if order[0] == "back":
        if len(d) == 0:
            print(-1)
        else:
            print(d[-1])