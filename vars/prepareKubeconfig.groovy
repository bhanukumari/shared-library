def call() {
    withCredentials([file(credentialsId: 'kubeconfig-cred-id', variable: 'KUBECONFIG_SRC')]) {
        sh 'cp "$KUBECONFIG_SRC" "$WORKSPACE/kubeconfig"'
    }
}

