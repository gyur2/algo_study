# 백준 1268: 임시 반장 정하기
# 풀이 시간: 약 45분
# 문제를 풀면서 개선해야 할 점: 리스트의 범위를 신경 써서 초기화하기

# studentNum = 학생 수, student = 각 학생의 역대 반을 나타낸 2차원 배열
# duplicationList = 각 학생마다 반 중복 수
studentNum = int(input())
student = [[0 for col in range(5)] for row in range(studentNum)]
duplicationList = [0] * studentNum

# 1번 학생부터 차례대로 1~5학년까지의 반 받아적기
# 개선 필요
for i in range(studentNum):
    student[i][0], student[i][1], student[i][2], student[i][3], student[i][4] = map(int, input().split())

# 한 학생이 여러 번 같은 반이었어도 한 번 카운트해야 되기 때문에
# 리스트 대신 집합을 사용함
# 집합을 매 학생마다 초기화하여, 원소로 같은 반이었던 학생을 추가함
# 1을 빼는 이유는 자기 자신을 제외하고 세기 위해서
# (생략해도 될듯? 생략하면  시간 100ms 정도 줄어들음)
# 상단에 초기화했던 duplicationList에 집합 원소 개수를 세서 저장
for i in range(studentNum):
    duplication = set()
    for j in range(5):
        for k in range(studentNum):
            if student[i][j] == student[k][j]:
                duplication.add(str(student[k]))
    duplicationList[i] = len(duplication) - 1

# duplicationList 중 원소 개수가 가장 많은 index 리턴
# 학생 번호가 1번부터이기 때문에 +1 추가 필수임!!
print(duplicationList.index(max(duplicationList)) + 1)
