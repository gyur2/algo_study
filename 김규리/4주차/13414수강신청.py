#시간초과? 왜? list로 하면 그렇다함
n, k = map(int, input().split())
indata = []
list = []

for i in range(k):
    indata.append(input())

for i in indata:
    if i not in list:
        list.append(i)
    else:
        if i in list:
            del list[list.index(i)]
            list.append(i)

for i in range(3): #선착순 3명
    print(list[i])