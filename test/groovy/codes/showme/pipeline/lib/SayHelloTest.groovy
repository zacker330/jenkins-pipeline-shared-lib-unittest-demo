package codes.showme.pipeline.lib

import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

import static org.assertj.core.api.Assertions.assertThat

class SayHelloTest extends BasePipelineTest {

    @Override
    @Before
    public void setUp() throws Exception {
        scriptRoots = ["vars"]
        super.setUp()

    }


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
