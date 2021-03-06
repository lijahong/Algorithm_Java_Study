3주차 수업 내용
================================
## 1. 이론
> 
> - 탐색이란 많은 양의 데이터 중에서 원하는 데이터를 찾는 과정 -> dfs, bfs
> - 스택 : 선입후출 -> 입구와 출구가 동일한 형태
> - 큐 : 선입선출 -> 입구와 출구가 모두 뚫려 있음
> - 재귀함수 : 재귀란 스스로 다시호출하는함수, 어느정도 출력하다가 스택 크기 초과 오류 메시지 출력
> > - 각 간선의 가중치가 동일 -> bfs (미로탐색, 가장 많이 출제)
> > - 아니라면 
> > > 1. 모든 노드에서 다른 모든 노드까지의 최단거리 : 플루이드 워셜 o(n^3)
> > > 2. 한 노드에서 다른 모든 노느 까지의 최단 거리 : 다익스트라 o(Elog v)
> > > 3. 한 노드에서 다른 모든 노느 까지의 최단 거리인데 음의 간선이 포함 : 벨만 포드

## 2. dfs

> - 깊이 우선 탐색으로 스택 자료구조를 이용
> - 스택에 노드를 넣어 방문 처리함
> - 두개의 배열이 필요 -> 그래프 배열과 방문 배열
> - 예제) 
> > 1. 음료수 얼려 먹기 -> 2차원 배열에서 0을 찾을때마다 dfs 를 호출해서 연결된 요소를 1로 바꾸는 것 (방문하지 않은 것이 0)   -> connected component
> > 2. 단지 연결문제
> > 3. 적록색약

## 3. bfs
> - 너비 우선 탐색으로 큐를 이용하여 탐색 (가까운거부터 -> 최단경로 문제)
> > 1. 큐에 시작 노드를 넣고 방문처리
> > 2. 큐에서 노드를 꺼내 인접 노드를 모두 큐에 삽입하고 방문 처리
> - 예제)
> > 1. 미로 탈출 
