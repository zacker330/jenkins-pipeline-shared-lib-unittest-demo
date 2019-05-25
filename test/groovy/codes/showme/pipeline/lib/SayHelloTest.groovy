package codes.showme.pipeline.lib

import org.junit.Test

import static org.assertj.core.api.Assertions.assertThat

class SayHelloTest extends BaseSharedLib {

    @Test
    void call() {
        def script = loadScript("sayHello.groovy")
        script.call()


        assertThat(
                helper.callStack
                        .findAll { c -> c.methodName == 'echo' }
                        .any { c -> c.argsToString().contains('hello pipeline') }
        ).isTrue()

        printCallStack()

    }
}
