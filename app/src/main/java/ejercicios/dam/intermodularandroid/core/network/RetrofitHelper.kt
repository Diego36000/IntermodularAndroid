package ejercicios.dam.intermodularandroid.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getLogin(): Retrofit {
        return Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getRegistro():Retrofit  {
        return Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getPublicaciones():Retrofit {
        return Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getComentarios():Retrofit {
        return Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}