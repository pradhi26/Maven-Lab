
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('13-count-vowels') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
