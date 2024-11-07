import sys
from itertools import combinations

height = []
for i in range(9):
    height.append(int(sys.stdin.readline()))

seven = list(combinations(height, 7))

result = []
for s in seven:
    if sum(s) == 100:
        result = sorted(s)

for i in result:
    print(i)