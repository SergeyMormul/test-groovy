package molde

import molde.repositories.Repository

/**
 */
class SimpleClassTest extends BaseTest {

    def 'test'() {

        given: 'sut'
        def repo = Mock(Repository)
        def sut = new SimpleClass(repo)

        when: 'test called'
        def result = sut.mainMethod( 2, 4 )

        then: 'repo is called'
        1 * repo.testMethod(2,4) >> 'even'

        and: 'the result is as expected'
        result == 'The result is even'
    }
}
