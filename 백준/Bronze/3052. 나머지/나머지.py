remainder = [0] * 42

for i in range(10):
    number = int(input())
    remainder[number % 42] = remainder[number % 42] + 1

print(42 - remainder.count(0))