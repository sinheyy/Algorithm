import sys

N, K, B = map(int, sys.stdin.readline().split())
load = [0] * (N)
for _ in range(B):
    tmp = int(sys.stdin.readline())
    load[tmp - 1] = 1

# 누적합
psum = [0] * N
psum[0] = load[0]
for i in range(1, N):
    psum[i] = psum[i - 1] + load[i]

result = []
# i ~ i + K - 1
for i in range(0, N - K + 1):
    if i == 0:
        result.append(psum[i + K - 1])
    else:
        result.append(psum[i + K - 1] - psum[i - 1])
    

print(min(result))