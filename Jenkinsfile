
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('08-number-palindrome') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
