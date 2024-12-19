package org.company

class KubernetesHelper {
    static void deploy(String yamlFile) {
        echo "Deploying application using Kubernetes YAML: ${yamlFile}"
        sh "kubectl apply -f ${yamlFile}"
    }
}
