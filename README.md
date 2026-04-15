# CRUD 과제 제출
***


## 시작 방법
```bash
docker-compose up -d
```
<br>
이후 프로젝트를 시작하면 localhost:8080에서 접속할 수 있습니다.

## API 명세 + E2E test 이미지
### Products 
***
<br>
`POST /api/products` - 상품 등록
<img width="513" height="473" alt="Image" src="https://github.com/user-attachments/assets/2edb3efc-0a59-4851-a31b-eaf2244f582b" />
<br>
<br>
`GET /api/product/{id}` - 상품 목록 조회
<img width="523" height="443" alt="Image" src="https://github.com/user-attachments/assets/b2a8f073-c3af-4a45-96f1-921e19815b85" />
<br>
<br>
`PUT /api/product/{id}` - 상품 수정
<img width="526" height="483" alt="Image" src="https://github.com/user-attachments/assets/f9388043-064f-41d2-af26-4721cfde1cf4" />

<img width="528" height="473" alt="Image" src="https://github.com/user-attachments/assets/52402611-ab08-4743-8b54-830e7b1e167f" />
<br>
<br>
`DELETE /api/product/{id}` - 상품 삭제
<img width="523" height="440" alt="Image" src="https://github.com/user-attachments/assets/ac249a37-041b-403f-9d34-73b6ee7cbbda" />

<img width="532" height="485" alt="Image" src="https://github.com/user-attachments/assets/9dadf63c-5951-4f86-90fe-47ab89d59639" />
<br>
<br>
상품 삭제 후 Exception


### Orders
***
<br>
`POST /api/orders` - 주문 생성
<img width="522" height="505" alt="Image" src="https://github.com/user-attachments/assets/f9c3b70f-31bb-48c5-b10c-4c98917e9b5d" />

<br>
<br>
`GET /api/orders/{id}` - 주문 조회
<img width="525" height="511" alt="Image" src="https://github.com/user-attachments/assets/45e8dda3-59ea-4c49-a042-8cdc1343bba7" />
