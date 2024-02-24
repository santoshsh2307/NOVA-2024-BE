package com.nova.mailservice;

public enum MailEnums {
    PASSWORD_RESET_MESSAGE("Hi, Please note that this link is only valid for the next [XX hours]. After that, you will need to request another password reset."),
    RESET_PASSWORD_SUBJECT("To reset your password, click on the link below:");

    private final String message;

    MailEnums(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
