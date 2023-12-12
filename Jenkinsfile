pipeline {
    agent any

    tools {
        
        maven "MAVEN_HOME"
    }

    stages {
        stage('Checkout') {
            steps {
                
               git branch: 'master', credentialsId: '', url: 'https://gitlab.huxium.net/w.chalouati/automation_tests_systnapsdm.git'

            }

        }
       
        stage('Build'){
            steps{
                bat 'mvn clean'
            }
        }
       
         stage('Test E2E'){
            steps{
                bat 'mvn test'
            }
        }
       
        stage('Generate report'){
            steps{
                cucumber buildStatus: 'null', customCssFiles: '', customJsFiles: '', fileIncludePattern: '**/target/cucumber.json', reportTitle: 'Rapport cucumber', sortingMethod: 'ALPHABETICAL'
            }
        }
       
        stage('Send mail'){
            steps{
                emailext attachLog: true, attachmentsPattern:'**/target/cucumber.html',body: '${env.JOB_NAME} - Build # ${env.BUILD_NUMBER}', subject: '${env.JOB_NAME} - Build # ${env.BUILD_NUMBER}',to:'chalouatiwiem01@gmail.com'
            }
        }
    }
}
