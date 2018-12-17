pipeline {
    agent { 
        docker { image 'imagenarium/maven:3.5-jdk-10-docker' } 
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn test'
            }
        }
        stage('package') {
            steps {
                sh 'docker --version'
                sh 'DOCKER_HOST=tcp://127.0.0.1:2375'
                sh 'mvn package docker:build'
            }
        }
    }
}
