def call(String channel, String message) {
    org.company.Notifications.sendSlack(channel, message)
}
