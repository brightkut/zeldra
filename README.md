 # Zeldra Project
 
 This project is maven archetype for helping generate spring boot template in BE side.  
 
### Command To Use

1. Clone this repository
2. Running `mvn clean install` and verify installed dependency in `~/.m2/repository/io/github/brightkut/zeldra`

3. Running command  
```
mvn archetype:generate \
    -DarchetypeGroupId=io.github.brightkut \
    -DarchetypeArtifactId=zeldra \
    -DarchetypeVersion=1.0 
```

4. Input this field in this format when running generated command

```
--- Example ---
'groupId': com.disorn
'artifactId': sample-service
'port': 8089
'className': Sample
'package': com.disorn.sampleservice 
```

### Project Structure Tree
```
.
├── compose.yaml
├── pom.xml
└── src
    ├── main
    │ ├── java
    │ │ └── com
    │ │     └── brightkut
    │ │         └── $artifactId
    │ │             ├── SampleSpringbootApplication.java
    │ │             ├── controller
    │ │             │ └── SampleController.java
    │ │             ├── dto
    │ │             │ ├── SampleCreateRequest.java
    │ │             │ ├── SampleResponse.java
    │ │             │ └── SampleUpdateRequest.java
    │ │             ├── entity
    │ │             │ └── Sample.java
    │ │             ├── exception
    │ │             │ └── NotImplementException.java
    │ │             ├── handler
    │ │             │ └── GlobalExceptionHandler.java
    │ │             ├── repository
    │ │             │ └── SampleRepository.java
    │ │             └── service
    │ │                 └── SampleService.java
    │ └── resources
    │     └── application.yml
    └── test
        └── java
            └── com
                └── brightkut
                    └── $artifactId
                        ├── controller
                        │ └── SampleControllerTest.java
                        ├── repository
                        │ └── SampleRepositoryTest.java
                        └── service
                            └── SampleServiceTest.java

```

## Maven Central Repository
https://central.sonatype.com/artifact/io.github.brightkut/zeldra/overview

## Reference

[Video Maven Archetype](https://www.youtube.com/watch?v=NBimK5qFy3E)

[GitHub Source Reference](https://github.com/ByteProgramming/CustomMavenArchetype)

[Maven Official Documentation](https://maven.apache.org/archetype/archetype-models/archetype-descriptor/archetype-descriptor.html)