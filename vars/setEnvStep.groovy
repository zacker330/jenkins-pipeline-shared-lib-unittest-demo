#! groovy
def call(Map<String,Object> envVars = new HashMap<>() ) {
    for (def entry : envVars.entrySet()) {
        env[entry.key] = entry.value
    }
}