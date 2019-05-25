package codes.showme.pipeline.lib

import org.junit.Assert
import org.junit.Test

import static org.junit.Assert.assertEquals

class SetEnvStepTest extends BaseSharedLib {
    @Test
    void call() {
        binding.setVariable('env', new HashMap())
        def script = loadScript('setEnvStep.groovy')
        script.invokeMethod("call", [k: '123', v: "456"])
        assertEquals("123", ((HashMap) binding.getVariable("env")).get("k"))
    }
}
