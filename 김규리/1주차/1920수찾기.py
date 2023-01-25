n = int(input())
A = set(map(int, input().split()))

m = int(input())
X = list(map(int, input().split()))

#판단 지직
for i in X:
    if i in A:
        print(1)
    else:
        print(0)

#시간초과 왜? list->set.
#set은 중복값을 가지지않음. O(n)과 O(1)의 차이