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
                sm 'echo "123"'
                sh 'docker --version'
                sh 'mvn package docker:build'
            }
        }
    }
}
