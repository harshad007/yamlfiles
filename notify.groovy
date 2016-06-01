def payload='payload={"channel": "#build-info", "username": "webhookbot", "text": "This is posted to #build-info and comes from a bot named webhookbot.", "icon_emoji": ":ghost:"}'
"println 'curl -i -H \'Content-Type:application/json\' -XPOST -d \'{\"channel\":\"#build-info\"}\' https://hooks.slack.com/services/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/'.execute().text"
