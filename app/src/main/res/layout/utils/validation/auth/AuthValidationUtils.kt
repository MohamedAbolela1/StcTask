package com.khabeer.tamshia_user.utils.validation.auth


object AuthValidationUtils {
    fun isPhoneNumberValid(phoneNumber: String?): Boolean {
        return !phoneNumber.isNullOrBlank() && phoneNumber.length > 9
    }

    fun isPasswordValid(password: String?): Boolean {
        return !password.isNullOrBlank() && password.length >= 6
    }

    fun isUserNameValid(username: String?): Boolean {
        return !username.isNullOrBlank()
    }

    fun isAgeValid(age: String?): Boolean {
        return !age.isNullOrBlank() && age.toInt() > 0
    }

    fun isEmailValid(email: String?): Boolean {
        return !email.isNullOrBlank() && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun isOTPValid(otp: String?): Boolean {
        return !otp.isNullOrBlank() && otp.length == 4
    }
}