package com.example.domain.utils


class AppConstants {

    companion object{

        const val BASE_URL = "http://172.104.156.221:8080/mobile_wrapper/"
        const val defaultLanguageKey:String ="DEFAULT_LANGUAGE"
        const val USER_TOKEN="user token"
        const val isLoggedInKey:String ="isLoggedInKey"
        const val NOTIF_KEY="notfy key"
        const val DEVICE_TOKEN="device token"
        const val SPLASH_TIME_OUT:Long=3000 // 3 sec
        const val CURRENT_FRAGMENT="Main Fragment"
        const val STARTING_INDEX = 1
        const val CURRENT_USER="user create"
       /* const val PASSWORD_PATTERN = "^" +
                "(?=.*[0-9])" +         //at least 1 digit
                "(?=.*[A-Z])" +         //at least 1 upper case letter
                ".{6,}" +               //at least 8 characters
                "$"*/

        val PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?!.*\\d)(?!.*[-+_!@#$%^&*.,?]).+\$"
       /* ^ asserts the start of the string.
        (?=.*[a-z]) asserts that there is at least one lowercase letter.
        (?=.*[A-Z]) asserts that there is at least one uppercase letter.
        (?!.*\\d) asserts that there are no digits (serial numbers).
        (?!.*[-+_!@#$%^&*.,?]) asserts that there are no special characters (excluding hyphen, underscore, plus sign).
        .+ matches one or more characters.
        \$ asserts the end of the string.*/


        const val EMAIL_PATTERN= "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"


        const val IBAN_PATTERN= "^SA[0-9]{2}[0-9A-Z]{18}\$"


        var CONNECTION_TIMEOUT:Long = 5000
        var BASE_URL2:String = "http://52.59.56.185"
        var NOTIFICATION_URL:String = "$BASE_URL2:80/notification"
        var MERCHANT_ID:String = "ff80808138516ef4013852936ec200f2"
      //  var SERVER_MODE: ServerMode = ServerMode.TEST
      //  var PROVIDER_MODE:ProviderMode = Connect.ProviderMode.TEST
        var LOG_TAG:String = "msdk.demo"
        var AUTHORIZATION:String= ""

        /* The configuration values to change across the app */
        /* The default amount and currency */
        var AMOUNT:String = "49.99"
        var CURRENCY:String = "EUR"
        var PAYMENT_TYPE:String = "PA"
        /* The payment brands for Ready-to-Use UI and Payment Button */
        var PAYMENT_BRANDS:Set<String> = linkedSetOf("VISA", "MASTER", "PAYPAL", "GOOGLEPAY")
        /* The default payment brand for payment button */
        var PAYMENT_BUTTON_BRAND:String = "MASTER"

        /* The card info for SDK & Your Own UI */
        var CARD_BRAND:String = "VISA"
        var CARD_HOLDER_NAME:String = "JOHN DOE"
        var CARD_NUMBER:String = "4200000000000000"
        var CARD_EXPIRY_MONTH:String = "07"
        var CARD_EXPIRY_YEAR:String = "28"
        var CARD_CVV:String = "123"

    }
}