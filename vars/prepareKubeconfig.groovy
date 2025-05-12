def call() {
    withCredentials([file(credentialsId: 'kubeconfig-cred-id', variable: 'KUBECONFIG_SRC')]) {
        def destPath = "${env.WORKSPACE}/kubeconfig"
        echo "Copying kubeconfig to ${destPath}"
        sh "cp \"${KUBECONFIG_SRC}\" \"${destPath}\""
    }
}

