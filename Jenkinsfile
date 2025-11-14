pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'docker rmi -f $(docker images -aq) || true'
        sh 'docker rm -f $(docker ps -aq) || true'
        sh 'docker compose down -v || true'
      }
    }
    stage('deploy') {
      steps {
        sh 'docker compose up -d --build'
      }
    }
  }
}
