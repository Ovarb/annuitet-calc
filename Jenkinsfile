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
                sh 'echo "123"'
                sh 'DOCKER_HOST=tcp://127.0.0.1:2375'
                sh 'mvn package docker:build'
            }
        }
    }
}
