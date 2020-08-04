package molde.repositories
/**
 */
class Shmepository implements Repository {
    @Override
    String testMethod(int a, int b) {
        ( a + b ) % 2 == 0 ? 'even' : 'odd'
    }
}
