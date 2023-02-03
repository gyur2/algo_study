data = []
for _ in range(3):
    data.append(int(input()))
    
mul = str(data[0] * data[1] * data[2])

for i in range(10):
    print(mul.count(str(i)))