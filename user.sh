
curl -i -X POST--data-urlencode 'payload={"channel": "#build-info", "username": "webhookbot", "text": "This is groovy script generated notification \'${BUILD_NUMBER}\' '\t' \'${BUILD_STATUS}'\  ", "icon_emoji": ":monkey:"}' 'https://hooks.slack.com/services/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'
