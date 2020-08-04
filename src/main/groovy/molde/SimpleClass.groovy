package molde

import molde.repositories.Repository

/**
 */
class SimpleClass {

    Repository repo

    SimpleClass(Repository repository) {
        repo = repository
    }

    String mainMethod(int a, int b) {
        "The result is ${repo.testMethod(a,b)}"
    }
}
