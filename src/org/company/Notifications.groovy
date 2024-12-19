package org.company

class Notifications {
    static void sendSlack(String channel, String message) {
        echo "Sending Slack notification to ${channel}: ${message}"
        slackSend(channel: channel, message: message)
    }
}

