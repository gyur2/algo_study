N = 5
stages = [2, 1, 2, 6, 2, 4, 3, 3]


answer = []
failure_rate = []

user_cnt = len(stages)
for s in range(1, N+1):
    if user_cnt == 0:
        failure_rate.append((0, s))
    else:
        failure_rate.append((stages.count(s) / user_cnt, s))
    user_cnt -= stages.count(s)
    
failure_rate.sort(reverse=True, key=lambda x: x[0])

for t in failure_rate:
    answer.append(t[1])