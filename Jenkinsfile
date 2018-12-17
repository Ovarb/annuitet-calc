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
                sh export DOCKER_HOST=tcp://localhost:2375
                sh 'mvn package docker:build'
            }
        }
    }
}
