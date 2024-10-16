students = [0] * 31

for i in range(28):
    num = int(input())
    students[num] = 1

answer = []
for i in range(1, 31):
    if students[i] == 0:
        answer.append(i)

print(answer[0])
print(answer[1])