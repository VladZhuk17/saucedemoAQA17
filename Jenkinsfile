lines (48 sloc)  1.71 KB

pipeline {
   agent any

   tools {
      maven "3.6.3"
      jdk "java"
   }
    triggers {
        cron('0 8 * * *')
    }
    parameters {
        gitParameter branchFilter: 'origin/(.*)', defaultValue: 'branch1', name: 'BRANCH', type: 'PT_BRANCH'
        booleanParam(defaultValue: true, description: 'Headless mode', name: 'HEADLESS')
        string(name: 'DEPLOY_ENV', defaultValue: 'staging', description: '')
    }

   stages {
      stage('Testing') {
         steps {
            git branch: "${params.BRANCH}", url: 'https://github.com/VladZhuk17/saucedemoAQA17.git'

            bat "mvn -Dmaven.test.failure.ignore=true -Dbrowser=chrome -Dsurefire.suiteXmlFiles=src/test/resources/testng-smoke.xml clean test"
         }

         post {

            success {
               junit '**/target/surefire-reports/TEST-*.xml'
            }
         }
      }
      stage('Reporting') {
         steps {
             script {
                     allure([
                             includeProperties: false,
                             jdk: '',
                             properties: [],
                             reportBuildPolicy: 'ALWAYS',
                             results: [[path: 'target/allure-results']]
                     ])
             }
         }
        }
   }
}