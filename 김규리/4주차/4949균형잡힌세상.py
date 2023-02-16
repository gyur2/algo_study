# 틀렸다고 뜸 -> 뭐가 틀린 건지 모르겠음 stack을 꼭 써야하나...?
indata = []
s = input()
while(s != '.'):
    indata.append(s)
    s = input()
balance = [None, None]  # 0번째는 소괄호 1번째는 대괄호
first = None  # 먼저 들어온 거 표시

for j in indata:
    for i in j:
        if j[-1] != '.':
            balance[0] = False
            balance[1] = False
            break
        if i == '(' or i == '[':
            if balance[0] is None and balance[1] is None:
                if i == '(':
                    first = ')'
                else:
                    first = ']'
            if i == '(':
                balance[0] = False
            elif i == '[':
                balance[1] = False
            continue
        if i == ')' or i == ']':
            if balance[0] is False and balance[1] is False:
                if first == i:
                    break
            if i == ')' and balance[0] is False:
                balance[0] = True
            elif i == ']' and balance[1] is False:
                balance[1] = True
            continue
    if False in balance:
        print('no')
    else:
        print('yes')