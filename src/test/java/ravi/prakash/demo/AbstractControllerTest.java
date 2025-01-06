package ravi.prakash.demo;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.web.server.LocalServerPort;


public abstract class AbstractControllerTest extends AbstractIntegrationTest {

    @LocalServerPort
    private Integer port;
    @BeforeEach
    void setUp() {
        RestAssured.baseURI = "http://localhost:" + port;
    }
}