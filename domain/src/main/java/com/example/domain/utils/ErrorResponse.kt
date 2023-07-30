package com.example.domain.utils

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.Objects


//data class ErrorResponse(
//    @SerializedName("body")
//    @Expose
//    val body: Body,
//    @SerializedName("status")
//    @Expose
//    val status: String
//)
//
//data class Body(
//    @SerializedName("code")
//    @Expose
//    val code: String,
//    @SerializedName("message")
//    @Expose
//    val message: String
//)
data class ErrorResponse(
    @SerializedName("status")
    @Expose
    val status: Int,
    @SerializedName("message")
    @Expose
    val message: String,
    @SerializedName("body")
    @Expose
    val body: Objects?
)

data class Message(
    @SerializedName("language")
    @Expose
    val language: String,
    @SerializedName("languageCode")
    @Expose
    val languageCode: String,
    @SerializedName("messageCode")
    @Expose
    val messageCode: String,
    @SerializedName("messageType")
    @Expose
    val messageType: String,
    @SerializedName("originalText")
    @Expose
    val originalText: String,
    @SerializedName("plainText")
    @Expose
    val plainText: String
)