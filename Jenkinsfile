
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('15-string-palindrome') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
