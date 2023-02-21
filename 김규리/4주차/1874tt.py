#반례 찾는 중인데 너무 오래 걸려섷ㅎ
n = int(input())
indata= []
li = [] #n까지의 수
stack = []
result = []
array = []
for i in range(n):
    li.append(i+1)
    indata.append(int(input()))

indata = indata[::-1]
cnt = 0
while(indata is not None):
    for i in li:
        if indata is None:
            break
        if i not in stack and i not in array:
            stack.append(i)
            result.append('+')
        if indata[-1] < indata[0]:
            result.append(-1)
            break
        if i == indata[-1]:
            indata.pop()
            stack.pop()
            array.append(i)
            result.append('-')
            cnt = i
            break
    if indata == [] or -1 in result:
        break
for i in result:
    if -1 in result:
        print('NO')
        break
    print(i)