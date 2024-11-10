import sys

N, M = map(int, sys.stdin.readline().split(" "))
arr = list(map(int, sys.stdin.readline().split(" ")))

start = 0
end = 0
count = 0
sum = arr[0]
while True:
    if sum == M:
        count += 1

    if sum >= M:
        start += 1
        sum -= arr[start - 1]
    else:
        if end == N - 1:
            break
        
        end += 1
        sum += arr[end]

print(count)