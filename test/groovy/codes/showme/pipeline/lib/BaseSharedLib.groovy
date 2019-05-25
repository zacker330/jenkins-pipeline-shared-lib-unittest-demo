package codes.showme.pipeline.lib

import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before

class BaseSharedLib extends BasePipelineTest {

    @Override
    @Before
    public void setUp() throws Exception {
        scriptRoots = ["vars"]
        super.setUp()

    }
}
