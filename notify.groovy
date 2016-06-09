def notifySlack() {
    def slackURL = 'https://hooks.slack.com/services/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'.execute().text
    def payload = JsonOutput.toJson([channel: channel,
                                      text:  text,
                                     username: "jenkins",
                                     icon_emoji: ":jenkins:"])
    sh "curl -X POST --data-urlencode \'payload=${payload}\' ${slackURL}"
}
notifySlack()

#def test3(){
#["curl", "-i", "-XPOST", "--data-urlencode", 'payload={"channel": "#build-info", "username": "webhookbot", "BUILD_ID", "${BUILD_ID}", "text": "This is groovy script generated notification", "icon_emoji": ":monkey:"}', 'https://hooks.slack.com/services/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'].execute().text
#}
#test3()
