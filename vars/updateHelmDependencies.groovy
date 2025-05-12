def call(String chartPath = 'o11y_stack/logging/logging-distributed') {
    dir("${env.WORKSPACE}/${chartPath}") {
        sh 'helm dependency update'
    }
}

