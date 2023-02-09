n = int(input())
indata = [] #받은 데이터
cnt = 0 #소가 길을 건넌 수
x = [-1]*10 #이전의 위치

for i in range(n):
    indata.append(list(map(int, input().split()))) #데이터 세팅

for i in indata:
    if x[i[0]-1] == -1:
        x[i[0]-1] = i[1]
    else:
        if x[i[0]-1] != i[1]: #이전 위치와 비교
            cnt += 1
            x[i[0]-1] = i[1]
print(cnt)
#40분. 런타임 에러: x 크기 할당시 n만큼 했더니 에러났었음. 뭔지 몰라 그거 수정하느라 오래걸림