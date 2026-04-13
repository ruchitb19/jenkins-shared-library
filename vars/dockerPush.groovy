def call(images, tag) {
    echo "Pushing Docker Images to Docker Hub"

    for (image in images) {
        echo "Pushing ${image}:${tag}"

        sh """
            docker tag ${image} ${image}:${tag}
            docker push ${image}:${tag}
        """
    }
}
