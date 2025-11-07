/**
 * allowedDependencies 에 설정으로 패키지 정보를 직접 설정할 수 있다.
 * 이 package-info.java가 없으면 기본 설정과 동일하게 되지만 이렇게 직접 의존성을 설정하게 되면
 * 특정 도메인 바로 하위가 아니더라도 정의한 NamedInterface에 대해서 접근이 가능!!
 */
@org.springframework.modulith.ApplicationModule(
        allowedDependencies = { "employee", "employee :: spi", "organization", "department" }
)
package pl.piomin.services.gateway;