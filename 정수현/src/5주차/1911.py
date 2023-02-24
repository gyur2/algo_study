# [BOJ] 흙길 보수하기 / 실버1 / X
# https://www.acmicpc.net/problem/1911
# https://velog.io/@holawan/%EB%B0%B1%EC%A4%80-1911%ED%9D%99%EA%B8%B8-%EB%B3%B4%EC%88%98%ED%95%98%EA%B8%B0-python

answer = 0
N, L = map(int, input().split())

pool = [list(map(int, input().split())) for _ in range(N)]
pool.sort(key=lambda x:x[0])

for i in range(N):
    # 웅덩이의 길이
    length = pool[i][1] - pool[i][0]

    # out of range 방지
    if i == N - 1:
        answer += (length - 1) // L + 1
        break

    if length % L != 0:
        # tmp = 널빤지가 웅덩이를 덮고 나서 얼마나 남는지
        # covered = 현재 웅덩이의 널빤지가 다음 웅덩이까지 닿는지 판단
        tmp = L - (length % L)
        covered = pool[i][1] + tmp
        if pool[i + 1][0] <= covered:
            pool[i + 1][0] = covered
        answer += length // L + 1
    else:
        answer += length // L

print(answer)
