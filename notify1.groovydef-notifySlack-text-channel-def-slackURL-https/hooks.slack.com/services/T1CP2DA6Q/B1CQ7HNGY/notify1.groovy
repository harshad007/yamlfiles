def notifySlack() {
    def slackURL = 'https://hooks.slack.com/services/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'.execute().text
    def payload = JsonOutput.toJson([channel: channel,
                                      text:  text,
                                     username: "jenkins",
                                     icon_emoji: ":jenkins:"])
    sh "curl -X POST --data-urlencode \'payload=${payload}\' ${slackURL}"
}
notifySlack()
