# SWExpertAcademy_D4_Java_7810

## SW Expert Academy D4 7810. 승현이의 질문

### 1. 문제설명

문제 출처: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWslG2zqFQcDFASy

input으로 `N`개의 수열이 들어온다. 수열에서 `H`보다 크거나 같은 숫자가 `H`개 이상 존재하는 값을 `H`라 할때 가장 큰 `H`를 출력하는 문제.

[입력]
> 첫 번째 줄에 테스트 케이스의 수 `T`가 주어진다.
> 각 테스트 케이스의 첫 번째 줄에는 수열의 크기 `N(1 ≤ N ≤ 500,000)`이 주어진다.
> 두 번째 줄에는 수열의 숫자 `N`개가 차례대로 들어오는데, 모두 `0`이상 `1,000,000`이하의 자연수이다.
*0이상 이면 자연수가 아니라 음아닌 정수인것 같습니다*

[출력]
> 각 테스트 케이스마다 `#x`(`x`는 테스트케이스 번호를 의미하며 `1`부터 시작한다)를 출력하고,
> 수열에 대응하는 숫자 `H`를 출력한다.
> 가능한 `H`가 여러 개면 그 중 가장 큰 값을 출력한다.


> 프로그래머스의 H-index 문제와 비슷하다.
https://github.com/ckddn9496/Programmers.Level2_Java_H-Index/blob/master/Main.java

### 2. 풀이

받아온 수열을 정렬한다. 가장 마지막 값 부터 `H`값이 크거나 같은 개수를 세서 비교하는 것이므로 마지막원소 부터 시작하여 `a[N-i] >= i` 일때마다 `i`값을 기록한다. 이때 `i`는 더 큰 수들의 개수이며 이 조건을 만족시키지 못할 때 `i`값이 `H`값이 된다. 

```java
int N = Integer.parseInt(br.readLine());
StringTokenizer st = new StringTokenizer(br.readLine());
int[] arr = new int[N];
int idx = 0;
while (st.hasMoreTokens()) {
  arr[idx++] = Integer.parseInt(st.nextToken());
}
Arrays.sort(arr);
int result = 0;
for (int i = 1; i <= N; i++) {
  if (arr[N-i] >= i)
    result = i;
}
System.out.println("#"+test_case+" "+result);
}
```
