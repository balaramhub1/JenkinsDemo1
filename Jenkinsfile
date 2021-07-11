pipeline { 
agent any 
    stages { 
        stage ('Checkout') { 
			steps{
				echo 'Checkout Source Code....'
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/balaramhub1/JenkinsDemo1']]])
				}
        }
        stage ('Build') { 
			steps{
				echo 'Build step'
				bat 'mvn clean compile'
				}
        }
        stage ('Test') { 
			steps{
				echo 'Testing....'
                bat 'mvn test'
			}        
        }
        stage ('Package') { 
			steps{
				echo 'Packaging....'
                bat 'mvn package'
			}
        }
    }           
 }
