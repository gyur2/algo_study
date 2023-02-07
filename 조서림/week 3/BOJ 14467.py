n = int(input())
    
cnt = 0
position = [-1] * 11 # 소의 위치 check

for _ in range(n):
    cow, pos = map(int, input().split()) # input
    
    if position[cow] == -1: # 처음 등장
        position[cow] = pos
        continue
    
    # 두 번째 이상 등장
    if position[cow] != pos: # 위치가 변경됨
        cnt += 1
        position[cow] = pos
        
print(cnt)