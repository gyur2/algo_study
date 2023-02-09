# [BOJ] 배열 돌리기 1 / 실버1 / X
# https://www.acmicpc.net/problem/16926
# 깊은 복사
# python은 시간초과가 나서 일단 pypy3으로 제출
# 이유는 for문 과다 사용으로 추정됨
# 일부 케이스만 해결함 (하단에 코드有, 행의 수 + 열의 수 = 홀수인 케이스 해결 X)
# https://tmdrl5779.tistory.com/134

N, M, R = map(int, input().split())
A = [0 for _ in range(N)]
for n in range(N):
    A[n] = list(map(int, input().split()))
# A = [list(map(int, input().split(' '))) for _ in range(N)]

# 회전
for r in range(R):
    for i in range(min(N, M) // 2):
        x, y = i, i
        value = A[x][y]

        # 좌
        for j in range(i + 1, N - i):
            x = j
            preValue = A[x][y]
            A[x][y] = value
            value = preValue
        # 하
        for j in range(i + 1, M - i):
            y = j
            preValue = A[x][y]
            A[x][y] = value
            value = preValue
        # 우
        for j in range(i + 1, N - i):
            x = N - (j + 1)
            preValue = A[x][y]
            A[x][y] = value
            value = preValue
        # 상
        for j in range(i + 1, M - i):
            y = M - (j + 1)
            preValue = A[x][y]
            A[x][y] = value
            value = preValue

for n in range(N):
    for m in range(M):
        print(A[n][m], end = " ")
    print()

# ---------------------------

# import copy
# # import math
#
# N, M, R = map(int, input().split())
# A = [0 for _ in range(N)]
# for n in range(N):
#     A[n] = list(map(int, input().split()))
#
# # print(A)
#
# # rotateA = A로 설정할 경우,
# # 얕은 복사여서 A도 같이 회전됨 -> 깊은 복사 사용
# # https://tmdrl5779.tistory.com/134
# rotateA = copy.deepcopy(A)
#
# # N + M 합이 짝수일 때는 해결했는데 홀수일 때를 모르겠네요...
# if (N + M) % 2 == 0:
#     for _ in range(R):
#         # 상
#         for i in range(N // 2):
#             for j in range(i, M - (i + 1)):
#                 rotateA[i][j] = A[i][j + 1]
#         # 하
#         for i in range(N // 2, N):
#             for j in range(M - i, i + 1):
#                 rotateA[i][j] = A[i][j - 1]
#         # 좌
#         for j in range(M // 2):
#             for i in range(j + 1, N - j):
#                 rotateA[i][j] = A[i - 1][j]
#         # 우
#         for j in range(M // 2, M):
#             for i in range(N - (j + 1), j):
#                 rotateA[i][j] = A[i + 1][j]
#
#         A = copy.deepcopy(rotateA)
# # else:
# #     for _ in range(R):
# #         # 상
# #         for i in range(N // 2):
# #             for j in range(i, M - (i + 1)):
# #                 rotateA[i][j] = A[i][j + 1]
# #         # 하
# #         for i in range(math.ceil(N / 2), N):
# #             for j in range(M - i, i):
# #                 rotateA[i][j] = A[i][j - 1]
# #         # 좌
# #         for j in range(M // 2):
# #             for i in range(j + 1, N - j):
# #                 rotateA[i][j] = A[i - 1][j]
# #         # 우
# #         for j in range(M // 2, M):
# #             for i in range(math.floor(N / 2), j + 1):
# #                 rotateA[i][j] = A[i + 1][j]
#
# for n in range(N):
#     for m in range(M):
#         print(rotateA[n][m], end = " ")
#     print()
#
