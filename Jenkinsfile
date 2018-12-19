pipeline {
    agent { 
        docker { 
            image 'maven:3.3.3'
            args '--mount "type=bind,source=/var/run/docker.sock,target=/var/run/docker.sock" --group-add 999'
        } 
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
                sh 'mvn clean package docker:build'
            }
        }
    }
}
