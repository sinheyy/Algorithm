k = int(input())

stack = []
sum = 0
for i in range(k):
    n = int(input())
    if n == 0:
        sum = sum - stack[len(stack) - 1]
        del stack[len(stack) - 1]
    else:
        stack.append(n)
        sum = sum + n

print(sum)