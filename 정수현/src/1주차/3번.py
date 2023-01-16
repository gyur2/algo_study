# 백준 18406번: 럭키 스트레이트(브론즈2)
# 풀이 시간: 10분

# 점수 입력받기
N = input()

# 앞, 뒤 나누기
front = N[:int(len(N) / 2)]
back = N[int(len(N) / 2):]

frontSum = 0
backSum = 0

# 앞, 뒤 길이가 같으니까 한꺼번에 가능
for i in range(len(front)):
    frontSum += int(front[i])
    backSum += int(back[i])

print("LUCKY") if frontSum == backSum else print("READY")