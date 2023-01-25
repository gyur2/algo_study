s = input()
result = ''
bt = 0
case = ''
for j in s: #입력받은 문자열 하나씩
    if '<'in s: #문자열에 태그가 있다면
        if j == '<' or bt == 1: #태그 안
            if bt == 0 and case is not None:
                case = case[::-1]
                result += case
                case = ''
            result += j
            bt = 1
            if j == '>':
                bt = 0
            continue
        else: #태그 바깥
            if j == ' ':
                case = case[::-1]
                result += case + ' '
                case = ''
                continue
            case += j
    else: #태그가 없는 거라면
        if j ==' ':
            case = case[::-1]
            result += case+' '
            case = ''
            continue
        case += j
if case is not None: # 태그가 없는 거 case에 넣었는데 못 출력했을까봐
    case = case[::-1]
    result += case
print(result)
#시간이 없는 관계로 최적화 안함/50분