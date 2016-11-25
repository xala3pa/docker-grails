package docker.grails

class BootStrap {

    def init = { servletContext ->
    new User(id: 1, name: "Alvaro", surname: "Salazar").save()

    }

    def destroy = {
    }
}
