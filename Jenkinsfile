pipeline {
    agent { 
        docker { 
            image 'maven:3.3.3'
            args '--mount "type=bind,source=/var/run/docker.sock,target=/var/run/docker.sock"'
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
                sh 'echo $DOCKER_HOST'
                sh 'ls -l /var/run/docker.sock'
                sh 'mvn clean package docker:build'
            }
        }
    }
}
