n, m = map(int, input().split()) # 1부터 n까지 숫자 중 m개 선택

s = []
visited = [False] * (n+1) # 해당 노드를 방문했는지 체크하기 위한 boolean 배열

def dfs():
    if len(s) == m: # 종료 조건
        print(' '.join(str(i) for i in s))
        return
    
    for i in range(1, n+1):
        if visited[i] == True: # 이미 해당 노드를 방문하였음
            continue
        s.append(i)
        visited[i] = True
        dfs()
        s.pop() # '하나의 dfs 함수가 종료되었다 == 수열 1개를 출력했거나 모든 경우의 수를 탐색했다'는 뜻이므로 트리 한 층 올라감
        visited[i] = False
        
dfs()