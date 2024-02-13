# hexagonal-architecture-sample
헥사고날 아키텍쳐 코드 샘플

## sample image
![image](https://github.com/jdi022222/hexagonal-architecture-sample/assets/97517890/68691a4f-a4e7-4153-8a4e-8f2251e9e7e3)

## hexagonal architecture layer
<img width="485" alt="image" src="https://github.com/jdi022222/hexagonal-architecture-sample/assets/97517890/80fc59aa-f17e-4326-a819-813caab22499">

## Data flow
Client → Adapter → Port를 통해 적절한 Application Service에 전달 → Domain Model → if(DB connection || External API) Adapter를 통해 처리 → if(isFeedback) 외부 처리 완료 후, 다시 Application Service는 Domian Model의 처리 결과를 받아 다시 Client에게 응답
