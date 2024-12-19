package org.company

class DockerHelper {
    static void buildImage(String imageName, String tag) {
        echo "Building Docker image ${imageName}:${tag}"
        sh "docker build -t ${imageName}:${tag} ."
    }

    static void pushImage(String imageName, String tag) {
        echo "Pushing Docker image ${imageName}:${tag}"
        sh "docker push ${imageName}:${tag}"
    }
}
