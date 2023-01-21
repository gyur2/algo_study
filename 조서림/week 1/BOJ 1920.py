n = int(input())
A = list(map(int, input().split()))
m = int(input())
nums = list(map(int, input().split()))

A = sorted(A)

for target in nums:
    L = 0
    R = len(A) - 1
        
    while L <= R:
        mid = (L + R) // 2
        if A[mid] == target:
            print(1)
            break
        elif A[mid] < target:
            L = mid + 1
        else:
            R = mid - 1
    
    if L > R:
        print(0)