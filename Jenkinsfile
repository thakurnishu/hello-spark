pipeline {
    agent {
        docker { image 'maven:3.6.3-jdk-8' }
    }

    stages {
        stage('git') {
            steps {
                git branch: 'vp-rem', url: 'https://github.com/devopshydclub/vprofile-project.git'
            }
        }
        stage('build') {
            steps {
                sh 'mvn install -DskipTests'
            }
            post {
                success {
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage('test') {
            steps{
                sh 'mvn test'
            }
        }
    }
}
