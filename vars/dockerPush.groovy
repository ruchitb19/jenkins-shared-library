def call(username, image_name, tag = "${env.BUILD_NUMBER}") {
    def fullImage = "${username}/${image_name}:${tag}"

    sh "docker tag ${local_image}:${tag} ${fullImage}"
    sh "docker push ${fullImage}"
}
