# 유기농 배추 / 실버2 / X
# https://www.acmicpc.net/problem/1012
# https://velog.io/@falling_star3/%EB%B0%B1%EC%A4%80Python-1012%EB%B2%88-%EC%9C%A0%EA%B8%B0%EB%86%8D-%EB%B0%B0%EC%B6%94
# 35 ~ 42행만 직접 작성
# BFS? DFS?

T = int(input())
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(a, b):

    # field : 방문처리
    queue = [(a, b)]
    field[a][b] = 0

    while queue:
        a, b = queue.pop(0)

        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            # out of range 신경쓰기
            if nx < 0 or nx >= M or ny < 0 or ny >= N:
                continue

            # 인접한 1을 0으로 바꿔주기
            if field[nx][ny] == 1:
                queue.append((nx, ny))
                field[nx][ny] = 0


for t in range(T):
    M, N, K = map(int, input().split())
    field = [[0 for col in range(N)] for row in range(M)]
    count = 0

    for k in range(K):
        x, y = map(int, input().split())
        field[x][y] = 1

    for m in range(M):
        for n in range(N):
            if field[m][n] == 1:
                bfs(m, n)
                count += 1
    print(count)
