package molde

import spock.lang.Specification

import java.util.concurrent.ThreadLocalRandom

/**
 */
abstract class BaseTest extends Specification{

    int randomNumber() {
        ThreadLocalRandom.current().nextInt( 0, 100 )
    }
}
