
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('05-prime-number') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
