s = "one4seveneight"


answer = s

num = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']

for n in range(10):
    answer = answer.replace(num[n], str(n))
    
answer = int(answer)