 # Zeldra Project
 
 This project is maven archetype for helping generate spring boot template in BE side.  
 
### Command To Use

```
mvn archetype:generate \
    -DarchetypeGroupId=com.brightkut \
    -DarchetypeArtifactId=zeldra \
    -DarchetypeVersion=1.0-SNAPSHOT 
```

### Project Structure Tree
```
.
├── compose.yaml
├── pom.xml
├── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── brightkut
    │   │           └── $package
    │   │               ├── SampleSpringbootApplication.java
    │   │               ├── controller
    │   │               │   └── SampleController.java
    │   │               ├── dto
    │   │               │   ├── SampleCreateRequest.java
    │   │               │   ├── SampleResponse.java
    │   │               │   └── SampleUpdateRequest.java
    │   │               ├── entity
    │   │               │   └── Sample.java
    │   │               ├── exception
    │   │               │   └── NotImplementException.java
    │   │               ├── handler
    │   │               │   └── GlobalExceptionHandler.java
    │   │               ├── repository
    │   │               │   └── SampleRepository.java
    │   │               └── service
    │   │                   └── SampleService.java
    │   └── resources
    │       └── application.yml
    └── test
        └── java
            └── com
                └── brightkut
                    └── $package
                        └── SampleSpringbootApplicationTests.java
```

## Reference

[Video Maven Archetype](https://www.youtube.com/watch?v=NBimK5qFy3E)

[GitHub Source Reference](https://github.com/ByteProgramming/CustomMavenArchetype)

[Maven Official Documentation](https://maven.apache.org/archetype/archetype-models/archetype-descriptor/archetype-descriptor.html)