def call(username, image_name, tag = "${env.BUILD_NUMBER}") {
    def fullImage = "${username}/${image_name}:${tag}"

    echo "Pushing Docker image: ${fullImage}"

    sh """
        docker push ${fullImage}
    """
}
