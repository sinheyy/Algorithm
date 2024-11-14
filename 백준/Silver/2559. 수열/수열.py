import sys

N, K = map(int, sys.stdin.readline().split())
temper = list(map(int, sys.stdin.readline().split(" ")))

# 누적합
psum = [0] * N
psum[0] = temper[0]
for i in range(1, N):
    psum[i] = psum[i - 1] + temper[i]

result = []
# i ~ i + K - 1
for i in range(0, N - K + 1):
    if i == 0:
        result.append(psum[i + K - 1])
    else:
        result.append(psum[i + K - 1] - psum[i - 1])
    

print(max(result))