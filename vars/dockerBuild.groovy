def call(image_name, folder = ".") {
    echo "Building Docker image: ${image_name}"
    sh "docker build -t ${image_name} ${folder}"
}
