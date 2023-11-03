def call(Map config) { // [1]
    node {
        if (config.isReleaseCandidate) { // [2]
            return config.rcNumber // [3]
        } else {
            return config.rcNumber + '+ci' + env.BUILD_NUMBER
        }
    }
}
