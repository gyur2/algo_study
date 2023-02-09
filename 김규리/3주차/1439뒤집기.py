s = input()
x = None #이전 거
x_idx = 0 #다른 것일 경우 문자열을 자르는데 그 자르는 위치
cnt_ls = [] #다르면 넣을 리스트

for i in range(len(s)):
    if i == len(s)-1: #마지막이라면 실행. 전부다 같은 경우를 넣을 수 있음
        cnt_ls.append(s[x_idx:i])
    if x != s[i] and x is not None: #이전 거랑 다르다면
        cnt_ls.append(s[x_idx:i]) #리스트에 넣기
        x_idx = i #그래서 끊긴 인덱스 어딘지 알려주기
    x = s[i]
print(len(cnt_ls)//2) #최소 구한 거