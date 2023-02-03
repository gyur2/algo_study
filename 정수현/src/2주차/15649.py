# 백준 15649: N과 M (1)
# 풀이 시간: 30분
# https://www.acmicpc.net/problem/15649
# 백트래킹 -> 재귀?
# 인터넷 참고: https://veggie-garden.tistory.com/24

# N: 자연수의 범위, M: 수열의 원소 개수
# answer = 수열
N, M = map(int, input().split())
answer = []

# 재귀함수 사용
def backTracking():
    # range(N)으로 설정하면 숫자가 0 ~ N-1로 설정되기 때문에 1 더해주기
    for i in range(1, N + 1):
        # answer의 원소 개수가 M과 같아졌을 경우, 프린트 및 리턴
        if len(answer) == M:
            print(' '.join(map(str, answer)))
            return
        # i가 아직 answer 안에 없을 경우, i를 더해주기
        if i not in answer:
            answer.append(i)
            backTracking()
            answer.pop()

backTracking()
