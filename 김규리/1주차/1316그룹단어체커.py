n = int(input())
indata = []
checker = []
x = 0 #이전 데이터 저장
cnt = 0

for i in range(n): #받을 데이터 세팅
    indata.append(input())

for i in indata:
    checker = []
    for j in i: #i는 단어
        if j in checker:
            if x != j: #이미 나왔는데 이전거랑 다른 경우
                break
            else: #나왔는데 이전거랑 같은 경우
                x = j
                checker.append(j)
                if len(checker) == len(i):
                    cnt +=1
                    break
                continue
        else: #이전에 안나왔으면 넣기
            checker.append(j)
            x = j

        if len(checker) == len(i): #마지막일때, 카운트 1
            cnt += 1

print(cnt)