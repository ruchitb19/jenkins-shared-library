def call(images, tag) {
    echo "Pulling Docker Images from Docker Hub"

    // If single image is passed as string → convert to list
    if (images instanceof String) {
        images = [images]
    }

    for (image in images) {
        sh "docker pull ${image}:${tag}"
    }
}
