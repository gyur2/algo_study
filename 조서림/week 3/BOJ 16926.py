n, m, r = map(int, input().split()) # n행 m열 행렬을 r번 회전
matrix = []
for _  in range(n):
    matrix.append(list(map(int, input().split())))

for i in range(min(n,m)//2):
    # 반시계 방향으로 회전하며 queue에 값 모두 저장
    queue = []
    a, b = i, i
    for a in range(i, n-i):
        queue.append(matrix[a][b])
    for b in range(i+1, m-i):
        queue.append(matrix[a][b])
    for a in range(n-i-2, i-1, -1):
        queue.append(matrix[a][b])
    for b in range(m-i-2, i, -1):
        queue.append(matrix[a][b])
    
    # queue 회전
    rotate = r % ((n-2*i)*2 + (m-2*i)*2 - 4)
    for _ in range(rotate):
        queue.insert(0, queue.pop())
    
    # 반시계 방향으로 다시 회전하며 리스트 값 변경
    a, b = i, i
    for a in range(i, n-i):
        matrix[a][b] = queue.pop(0)
    for b in range(i+1, m-i):
        matrix[a][b] = queue.pop(0)
    for a in range(n-i-2, i-1, -1):
        matrix[a][b] = queue.pop(0)
    for b in range(m-i-2, i, -1):
        matrix[a][b] = queue.pop(0)
    
for mm in matrix: print(*mm)