def call(image_name, folder) {
    def fullImage = "${image_name}:${env.BUILD_NUMBER}"

    echo "Building Docker image: ${fullImage}"

    sh "docker build -t ${fullImage} ${folder}"

    return fullImage
}
