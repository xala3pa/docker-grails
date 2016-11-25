package docker.grails

import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse
import grails.test.mixin.TestFor
import spock.lang.Shared
import spock.lang.Specification

@TestFor(User)
class UserSpec extends Specification {

    @Shared RestBuilder restBuilder = new RestBuilder()

    public static final String USER_ENDPOINT = "http://localhost:8080/users"
    public static final int OK_STATUS = 200

    void "should return JSON version of User data"() {
        when:
        RestResponse response = restBuilder.get(USER_ENDPOINT)

        then:
        response.status == OK_STATUS

        and:
        response.json[0].name == "Alvaro"
    }
}