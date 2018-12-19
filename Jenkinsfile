pipeline {
    agent { 
        docker { 
            image 'imagenarium/maven:3.5-jdk-10-docker'
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
                sh 'echo "123"'
                sh 'mvn clean package docker:build'
            }
        }
    }
}
