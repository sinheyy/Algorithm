import sys

N = int(sys.stdin.readline())

scores = []
for _ in range(N):
    scores.append(int(sys.stdin.readline()))

count = 0
for i in reversed(range(N - 1)):
    if scores[i] >= scores[i + 1]:
        count += abs(scores[i + 1] - scores[i] - 1)
        scores[i] = scores[i + 1] - 1

print(count)