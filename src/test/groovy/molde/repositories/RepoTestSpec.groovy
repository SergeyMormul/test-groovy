package molde.repositories

import molde.BaseTest
import spock.lang.Specification

/**
 */
class RepoTestSpecification extends BaseTest {

    def 'test'() {

        given:'sut'
        def sut = new Shmepository()

        when: 'test called'
//        def result = sut.testMethod(randomNumber(), randomNumber())
        def result = sut.testMethod(2, 4)

        then: 'result'
        result
        result == 'even'
    }
}
