pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven 3.6.3"
    }

    stages {
	
        stage('Git Checkout') {
            steps {
                git branch: 'master', credentialsId: 'bnagoor0', url: 'https://gitlab.com/helloworldrap/sample_helloworld.git'
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                }

            post {
                success {
                    sh "cp -rf $WORKSPACE/target/*.war /home/nagoor/softwares/apache-tomcat-9.0.39/webapps"
                    archiveArtifacts 'target/*.war'
                }
            }
        }
    }
}