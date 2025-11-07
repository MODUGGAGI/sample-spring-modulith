@org.springframework.modulith.ApplicationModule(
        allowedDependencies = { "employee", "employee :: spi", "organization", "department" , "department :: spi" }
)
package pl.piomin.services.organization;