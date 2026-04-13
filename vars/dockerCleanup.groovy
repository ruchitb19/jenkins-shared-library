def call() {
  echo "Docker Cleanup "
  sh "docker system prune -f"
}
