n = input() #입력받은 숫자
l_cnt = 0 #왼쪽 카운트
r_cnt = 0 #오른쪽 카운트

cnt_n = int(len(n)/2) #왼, 오 나누는 기준

for i in n[:cnt_n]:
    l_cnt+= int(i)

for i in n[cnt_n:]:
    r_cnt+= int(i)

#판단 지직
if l_cnt == r_cnt:
    print("LUCKY")
else:
    print("READY")