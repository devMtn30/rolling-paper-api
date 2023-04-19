# ❤추억의 롤링페이퍼❤

### 추억의 롤링페이퍼에서 소중한 추억을 만들고 간직해보세요!📜🖋

📜 [추억의 롤링페이퍼](https://rolling-paper-makers.vercel.app/) 🖋

 👉 [프론트 Readme 보러가기](https://github.com/memory-makers/rolling-paper) 👀

<br/>

## 📑 프로젝트 소개
![2022-11-20 23;24;18](https://user-images.githubusercontent.com/51311690/202909665-4aa8f3a2-411e-41b9-95c0-9ccef24b6297.PNG)

<br/>


### 개요

학교에서, 그룹에서. 마지막 날에 롤링페이퍼를 써보신 적이 있으신가요?

종이 롤링페이퍼라면, 메모지에 손으로 글씨를 써서 붙이는 형식으로 만들겠지만

만약 만나기 어려운 상황이라면…? 온라인 롤링페이퍼가 필요할 거예요.

메모리 메이커스 팀은, 사람들과 함께 추억을 남기고,

마음을 나눌 수 있는 공간을 만들기 위해 모였습니다.

그렇게 추억의 롤링페이퍼가 탄생했죠!

<br/>

## 🎁 어떻게 사용하나요?

### 내 롤링페이퍼 써주세요!

- 롤링페이퍼 만들기
    - 나만의 롤링페이퍼를 만들어보세요!

- 롤링페이퍼 공유하기
    - 이렇게 만든 롤링페이퍼는 링크로 친구들에게 공유할 수 있어요!


### 다른 친구의 롤링페이퍼 써주기

- 카드 작성하기
    - 공유받은 링크를 클릭해서 친구에게 카드를 작성해보아요!



<br/>

## 🎇 백엔드 주요 기능

### 프로젝트 관심사

- 기술 사용에 있어서 목적과 근거가 명확한 프로젝트를 지향합니다.
- AWS 클라우드 플랫폼을 사용하여 백엔드 서비스 구축 및 배포를 진행하였습니다.
- RESTful한 API를 설계하기 위하여 노력하였습니다.
- 도메인 별로 나누어 설계하여 의존성을 최소화하고, 응집성은 최대화 시켰습니다.
- OAuth 2.0과 Spring Security를 이용한 인증•인가를 하기 위해서 지속적인 학습을 하였습니다.
    - **[[Spring Framework OPEN API서비스 교육] OAuth 2.0](https://mntdev.tistory.com/47)**
- 원활한 협업•개발을 위해 Swagger UI를 통해 API 테스트 및 문서화 하였습니다.
    - [Swagger UI](https://www.memory-rolling-paper-api.link/swagger-ui/index.html)

---

## 📜 API 설계

🙍‍♂️ 회원

| Feature | Request | API | 설명 |
| --- | --- | --- | --- |
| 사용자 조회 | GET | /members | 현재 로그인 된 사용자의 정보를 조회합니다. |
| 닉네임 설정 | PUT | /members/nickname | 현재 로그인 된 사용자의 닉네임을 변경합니다. |
| 닉네임 조회 | GET | /members/nickname | 현재 로그인 된 사용자의 닉네임을 조회합니다. |

📰 롤링페이퍼

| Feature | Request | API | 설명 |
| --- | --- | --- | --- |
| 목록보기 | GET | /papers | 현재 로그인된 아이디를 기준으로 생성된 롤링페이퍼를 조회합니다. |
| 생성 | POST | /papers | 현재 로그인된 아이디를 기준으로 롤링페이퍼를 생성 합니다. |
| 수정 | PUT | /papers | 롤링페이퍼를 수정합니다. 자신의 롤링페이퍼만 수정이 가능합니다. |
| 상세보기 | GET | /papers/{paperId} | 하나의 롤링페이퍼를 조회합니다. |
| 삭제 | DELETE | /papers/{paperId} | 롤링페이퍼를 삭제합니다. 자신의 롤링페이퍼만 삭제가 가능합니다. |
| 작성자 
닉네임 조회 | GET | /papers/{paperId}/nickname | paperId를 이용해서 nickname을 조회합니다 |
| Id조회 | GET | /papers/url | url을 이용해서 paperId를 조회합니다. |

****💳**** 카드

| Feature | Request | API | 설명 |
| --- | --- | --- | --- |
| 카드 생성 | POST | /cards | 하나의 롤링페이퍼에 있는 카드를 생성 합니다. 오픈날짜 이후 카드 생성 불가 |
| 카드 조회 | GET | /cards/{paperId} | 스티커들을 편집합니다. (오픈 날짜 이후 카드 편집 불가) |

🎀 스티커

| Feature | Request | API | 설명 |
| --- | --- | --- | --- |
| 스티커 목록 | GET | /stickers | paperId를 기준으로 스티커들을 조회합니다. |
| 스티커 편집 | POST | /stickers | 스티커들을 편집합니다. (오픈 날짜 이후 카드 편집 불가) |

---

## 💾 **데이터베이스 ERD**
![Untitled](https://user-images.githubusercontent.com/51311690/202909823-76c79524-71f4-4d65-93f1-fa4db9fde971.png)


---

## 🕹 프로젝트 실행

1. `jar 파일로 프로젝트 빌드`
2. `java -jar [빌드된 파일명]` 


