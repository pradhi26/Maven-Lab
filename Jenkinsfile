
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Build and Test') {
            steps {
                dir('12-maximum-array-element') {
                    bat 'mvn clean test package'
                }
            }
        }
    }
}
