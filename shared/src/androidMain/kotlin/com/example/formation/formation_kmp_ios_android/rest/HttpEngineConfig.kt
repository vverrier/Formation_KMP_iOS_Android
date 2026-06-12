package com.example.formation.formation_kmp_ios_android.rest

import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.okhttp.OkHttpConfig
import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.SSLContext
import javax.net.ssl.X509TrustManager

actual fun HttpClientConfig<*>.configurePlatformSsl() {
    (this as? HttpClientConfig<OkHttpConfig>)?.engine {
        config {
            val trustAllCerts = object : X509TrustManager {
                override fun checkClientTrusted(
                    p0: Array<out X509Certificate?>?,
                    p1: String?
                ) {
                }

                override fun checkServerTrusted(
                    p0: Array<out X509Certificate?>?,
                    p1: String?
                ) {
                }

                override fun getAcceptedIssuers(): Array<out X509Certificate?>? {
                    return arrayOf()
                }
            }
            val sslContext = SSLContext.getInstance("SSL").apply {
                init(null, arrayOf(trustAllCerts), SecureRandom())
            }
            sslSocketFactory(sslContext.socketFactory, trustAllCerts)
            hostnameVerifier { _, _ -> true }
        }
    }
}
