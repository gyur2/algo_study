#1부터 9까지의 숫자 등장이 아니라 0부터임.

a = int(input())
b = int(input())
c = int(input())
result = str(a*b*c)
cnt=[0]*10

for i in result:
    cnt[int(i)]+= 1

for i in cnt:
    print(i)