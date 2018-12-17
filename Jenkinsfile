pipeline {
    agent { 
        docker { image 'maven:3.3.3' } 
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
                sh 'DOCKER_HOST=unix:///var/run/docker.sock'
                sh 'mvn package docker:build'
            }
        }
    }
}
