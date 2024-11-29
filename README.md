# cloudschool-Server Documentation
이 프로젝트는 현대오토에버 모빌리티 클라우드 스쿨의 Public Cloud 실습 과제를 위한 Spring Boot 애플리케이션입니다. <br/>
이 문서에서는 프로젝트의 주요 기능, 기술 스택, API 명세 및 실행 방법에 대해 설명합니다. <br/>


## 주요 기능
- 사용자(User) 목록 전체 조회: 간단한 GET 요청으로 모든 사용자의 정보를 가져올 수 있습니다.
<br/>

## 기술 스택
- Language: Java 17
- Framework: Spring Boot 3.x
- Database: AWS RDS (MySQL)
- DevOps
  - Docker
  - AWS ECR (Elastic Container Registry)
  - AWS ECS (Elastic Container Service)

<br/>

## API 명세
### 1. 사용자 목록 전체 조회
- URL: `/`
- Method: `GET`
- Response:
  - Status: `200 OK`
  - Body:
    ``` json
    [
      {
        "userId": 1,
        "userName": "홍길동",
        "userEmail": "hong@example.com"
      },
      {
        "userId": 2,
        "userName": "김철수",
        "userEmail": "kim@example.com"
      },
      {
        "userId": 3,
        "userName": "이영희",
        "userEmail": "lee@example.com"
      }
    ]
    ```
<br/>

---

## 배포 URL
애플리케이션은 아래 로드 밸런서를 통해 접근할 수 있습니다. <br/>
http://cloudschoolelb-552622718.ap-northeast-2.elb.amazonaws.com/
<br/>
<br/>


## 설치 및 실행 가이드
### 1. Git 레포 clone
``` bash
git clone https://github.com/bestlalala/cloudschool-Server.git
cd cloudschool-server
```
<br/>

### 2. 환경 변수 설정
이 프로젝트는 애플리케이션 실행 시 필요한 환경 변수를 ECS Task Definition의 Container Definition에서 설정합니다.
- ECS > Task Definition > Container Definitions > Environment Variables

#### 환경 변수 목록
```
DB_URL: 데이터베이스 호스트 주소 (예: your-rds-endpoint)
DB_USER: 데이터베이스 사용자 이름
DB_PASSWORD: 데이터베이스 비밀번호
```
<br/>

### 3. 배포
AWS ECS 서비스 배포 후 로드밸런서 URL로 접속합니다.
<br/>
