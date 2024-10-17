while True:
    str = input()
    if str == '.':
        break
    
    stack = []
    balance = True

    for i in range(len(str)):
        if str[i] == '(' or str[i] == '[':
            stack.append(str[i])
        elif str[i] == ')':
            if len(stack) == 0:
                balance = False
                break

            last = stack.pop(-1)
            if last != '(':
                balance = False
                break
        elif str[i] == ']':
            if len(stack) == 0:
                balance = False
                break
            
            last = stack.pop(-1)
            if last != '[':
                balance = False
                break
        else:
            continue

    if len(stack) != 0:
        balance = False

    if balance:
        print("yes")
    else:
        print("no")