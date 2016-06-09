def notifySlack() {
    def slackURL = 'https://hooks.slack.com/services/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'
    def payload = JsonOutput.toJson([channel: channel,
                                      text:  text,
                                     username: "jenkins",
                                     icon_emoji: ":jenkins:"])
    sh "curl -X POST --data-urlencode \'payload=${payload}\' ${slackURL}"
}
notifySlack()
