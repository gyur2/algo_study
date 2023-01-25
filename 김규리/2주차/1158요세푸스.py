n, m = input().split()
data = []
result = []
n = int(n)
m = int(m)
for i in range(int(n)):
    data.append(i+1)

idx = m
while(data != []): #data 끝날때까지 돌기 이상하게 is not None이 안됨
    while(idx > len(data)): #길이보다 길면 자르기
        idx -= len(data)
    idx -= 1
    result.append(data[idx]) #결과에 넣고
    del data[idx] #지우기
    for j in range(m):
        idx = idx+1

#데이터 출력
print('<', end='')
for i in result:
    if result[-1] == i:
        print(i, end='>')
        break
    print(i, end=', ')