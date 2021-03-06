# System

## on-premises

**온프레미스**

: 자사에서 데이터센터를 보유하고 시스템 구축부터 운용까지를 모두 수행하는 형태

초기 시스템 투자에 드는 비용 부담이 크며, 시스템 가동 후의 운용에 드는 비용도 시스템 이용량과 상관없이 일정 금액을 부담해야한다.



## public cloud

**퍼블릭 클라우드**

: 인터넷을 경유하여 불특정 다수에게 제공되는 클라우드 서비스

자사에서 인터넷센터를 보유하지 않으므로 서버나 네트워크 등 인프라와 관련된 초기 투자가 필요 없다. 제공할 서비스에 따라 **IaaS/Paas/SaaS** 등이 있다.

**시스템 기반 부분을 이용하는 서비스는 IaaS**라고 한다. IaaS는 이용하고 싶은 사양으로 된 가상 머신이나 스토리지를 선택하고 이용한 시간이나 데이터 양에 따라 요금을 지불하는 형태.



## private cloud

**프라이빗 클라우드**

: 특정 기업 그룹에게만 제공되는 클라우드 서비스





## 온프레스가 접합한 시스템

1. 높은 가용성이 요구되는 시스템
2. 기밀성이 높은 데이터를 다루는 시스템
3. 특수한 요구사항이 있는 시스템



## 클라우드가 접합한 케이스

1. 트래픽의 변동이 많은 시스템

   > **sizing**: 트래픽 양에 따라 시스템 기반의 서버 사양이나 네트워크 대역을 가늠하는 설계.
   >
   > 사이징이 어려운 시스템은 트래픽 양에 따라 시스템을 단기간에 쉽게 증설시킬 수 있는 클라우드 시스템으로 구성하는 것이 좋다.
   >
   > 
   >
   > **autoscale: 증설**

2. 재해 대책의로 해외에 백업을 구축하고 싶은 시스템

   > **BCP**: 업무 연속성 계획.
   >
   > 사업 중단이 야기하는 리스크를 최소한으로 하기 위해 미리 준비해 두는 계획

3. 서비스를 빨리 제공하고 싶은 시스템



