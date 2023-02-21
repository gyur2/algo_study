import sys
sys.setrecursionlimit(10**6)

t = int(input())
 
for _ in range(t):
    m, n, k = map(int, input().split())
    field = [[0] * m for _ in range(n)]

    for _ in range(k):
        a, b = map(int, input().split())
        field[b][a] = 1

    visited = [[False] * m for _ in range(n)]
    direction = [(1,0), (0,1), (-1,0), (0,-1)] # 하 - 우 - 상 - 좌

    def dfs(x, y):
        if (x >= n or x < 0 or y >= m or y < 0) or field[x][y] == 0 or visited[x][y]:
            return
        
        visited[x][y] = True
        for dx, dy in direction:
            dfs(x+dx, y+dy)

    answer = 0

    for i in range(n):
        for j in range(m):
            if field[i][j] == 1 and not visited[i][j]:
                dfs(i, j)
                answer += 1
                
    print(answer)