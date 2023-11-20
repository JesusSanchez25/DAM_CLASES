import okhttp3.OkHttpClient
import okhttp3.Request

fun main() {
    val client = OkHttpClient()

    val url = "https://api.ejemplo.com/datos" // Reemplaza con la URL de la API que desees consultar

    val request = Request.Builder()
        .url(url)
        .build()

    val response = client.newCall(request).execute()
    val responseBody = response.body?.string()

    if (response.isSuccessful && responseBody != null) {
        println("Respuesta del servidor: $responseBody")
    } else {
        println("La solicitud GET falló con el código de respuesta: ${response.code}")
    }
}