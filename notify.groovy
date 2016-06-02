def test3(){
["curl", "-i", "-XPOST", "--data-urlencode", 'payload={"channel": "#build-info", "username": "webhookbot", "text": "This is groovy script generated notification", "icon_emoji": ":monkey:"}', 'https://hooks.slack.com/services/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'].execute().text
}
test3()
