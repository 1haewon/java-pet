---- Spring Boot + Spring Data JPA 기반의 가계부 CRUD API 예제 프로젝트 ---- 

1. 프로젝트 개요
2. 실행 방법
3. API Endpoints
- Create
- List All
- Get by ID
- Update
- Delete


1. 프로젝트 개요
   
도메인 : 거래 내역(Entry)
기술 스택 : Spring Boot, Spring JPA, MySQL
목표
: 계층별 책임 분리
: Request/Response DTO 패턴
: 전역 예외 처리(GlobalExceptionHandler)
: JPA Dirty Checking


3. 실행 방법
1. 레포지토리 복제  
  
   git clone https://github.com/your-username/java-pet-ledger.git
   cd java-pet-ledger
2. 빌드 & 실행
./mvnw spring-boot:run


3. API Endpoints
create
curl -i -X POST http://localhost:8080/transactions \
  -H "Content-Type: application/json" \
  -d '{
        "date":"2025-05-24",
        "category":"식비",
        "amount":12000,
        "description":"점심 식사"
      }'

list all
curl -i http://localhost:8080/transactions


GetbyId
curl -i http://localhost:8080/transactions/1

update
curl -i -X PUT http://localhost:8080/transactions/1 \
  -H "Content-Type: application/json" \
  -d '{
        "date":"2025-05-24",
        "category":"교통비",
        "amount":3500,
        "description":"버스비"
      }'

delete
curl -i -X DELETE http://localhost:8080/transactions/1



  
