# springdoc-openapi-issue-2207

## Reproducing

1. Run: `./gradlew bootRun`
2. The swagger-ui at http://localhost:4242/swagger-ui/index.html fails to load.
3. Inspect the file: http://localhost:4242/swagger-ui/swagger-initializer.js

*Reproduces only on JDK 1.8 but not 18.* 
