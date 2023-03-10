package com.khabeer.tamshia_user.utils.common

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.khabeer.tamshia_user.R
import java.lang.Exception
import java.util.*


object CommonOption {

    fun rateApp(context: AppCompatActivity) {
             val appPackageName: String =
                 context.packageName // getPackageName() from Context or Activity object
             try {
                 context.startActivity(
                     Intent(
                         Intent.ACTION_VIEW,
                         Uri.parse("market://details?id=$appPackageName")
                     )
                 )
             } catch (anfe: ActivityNotFoundException) {
                 context.startActivity(
                     Intent(
                         Intent.ACTION_VIEW,
                         Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")
                     )
                 )
             }
         }

    fun openSocialAccount(context: Context, url : String){
            try {
                context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
            } catch (e : Exception) {
                Toast.makeText(context, context.getString(R.string.check_link_account), Toast.LENGTH_SHORT).show()
            }
        }

    fun openWhatsApp(context: Context, number : String){
            val uri = Uri.parse("smsto:$number")
            val mWhatsAppIntent = Intent(Intent.ACTION_SENDTO, uri)
            mWhatsAppIntent.setPackage("com.whatsapp")
            context.startActivity(Intent.createChooser(mWhatsAppIntent, ""))
        }

    fun setConfig(language: String, context: Context) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        context.resources.updateConfiguration(
            config,
            context.resources.displayMetrics
        )
    }

}