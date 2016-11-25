package docker.grails

import grails.rest.Resource

@Resource(uri = "/users")
class User {
    Long id
    String name
    String surname

    static constraints = {
    }
}
