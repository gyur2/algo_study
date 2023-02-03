#2차원 배열 이용, 다음줄이랑 비교함

n = int(input()) #반의 학생수
sc = [0 for _ in range(n)] #겹치는 거 셀 리스트
sc_cnt = [] #같은 경우 카운트 할 리스트. index로 학년, 학생번호 표기
indata = [0 for _ in range(n)] #받을 데이터 2차원 리스트로 세팅

for i in range(n): #받을 데이터 세팅
    indata[i] = list(map(int, input().split()))
    sc[i] = [0]*n

# 깔끔 비교
for i in range(5): #1~5학년
    for j in range(n): #학생 번호
        for k in range(j+1, n):
            if indata[j][i] == indata[k][i]: #다음 줄 같은 학년이랑 비교
                sc[k][j] = 1
                sc[j][k] = 1

for i in sc:
    cnt = 0
    for j in i:
        if j == 1:
            cnt += 1
    sc_cnt.append(cnt)

print(sc_cnt.index(max(sc_cnt)) + 1)
