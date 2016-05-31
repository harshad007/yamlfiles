import groovy.json.JsonOutput

def notifySlack(text, channel) {
    def slackURL = 'https://hooks.slack.com/services/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'
    def payload = JsonOutput.toJson([channel: channel,
                                      text:  text,
                                     username: "jenkins",
                                     icon_emoji: ":monkey:"])
    sh "curl -X POST --data-urlencode \'payload=${payload}\' ${slackURL}"
}
