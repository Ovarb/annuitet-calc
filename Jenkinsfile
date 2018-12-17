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
                sh 'DOCKER_HOST=tcp://192.168.0.102:2375'
                sh 'mvn package docker:build'
            }
        }
    }
}
