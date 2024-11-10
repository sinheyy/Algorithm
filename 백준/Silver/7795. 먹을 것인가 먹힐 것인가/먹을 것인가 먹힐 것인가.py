import sys

T = int(sys.stdin.readline())

for _ in range(T):
    N, M = map(int, sys.stdin.readline().split(" "))
    A = list(map(int, sys.stdin.readline().split(" ")))
    B = list(map(int, sys.stdin.readline().split(" ")))

    p1 = 0
    p2 = 0
    count = 0
    A = sorted(A)
    B = sorted(B)
    while True:
        if A[p1] <= B[p2]:
            if p1 == N - 1:
                break
            p1 += 1

        if A[p1] > B[p2]:
            count += N - p1
            if p2 == M - 1:
                break
            p2 += 1

    print(count)