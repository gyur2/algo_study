# [BOJ] 오리 / 실버3 / X
# https://www.acmicpc.net/problem/12933

# https://eboong.tistory.com/288
# https://tmdrl5779.tistory.com/128

# visit: 입력받은 sound의 길이만큼 False로 구성된 리스트를 생성,
# sound의 각 인덱스를 방문하였는지 검사할 용도로 사용
# index: quack을 검사할 인덱스
# ducks: 최종 출력할 오리의 수
# first = 오리가 q로 울기 시작해서 k로 끝날 때까지 True로 전환
sound = list(input())
quack = ['q', 'u', 'a', 'c', 'k']
visit = [False] * len(sound)
index = 0
ducks = 0
first = False

# 입력한 문자열 길이가 5의 배수가 아니거나, q로 시작하지 않으면 틀린 입력임
if sound[0] != 'q' or len(sound) %5 != 0:
    print(-1)
    exit()

else:
    for i in range(len(sound)):
        # q이면 오리가 울기 시작한 것이므로 검사 시작, 즉 first를 True로
        if sound[i] == "q" and not visit[i]:
            first = True
            for j in range(len(sound)):
                if not visit[j] and quack[index] == sound[j]:
                    visit[j] = True
                    if sound[j] == "k":
                        # sound[j]가 k이면 오리가 다 운 것이기 때문에
                        if first:
                            ducks += 1
                            first = False
                        # quack의 처음부터 다시 검사해야 하므로 index = 0으로 초기화
                        index = 0
                        continue
                    index += 1

# 오리가 한 마리도 없거나, 방문하지 않은 인덱스가 있다면 -1 출력
print(-1) if ducks == 0 or not all(visit) else print(ducks)