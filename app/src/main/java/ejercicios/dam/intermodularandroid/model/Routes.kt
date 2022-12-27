package ejercicios.dam.intermodularandroid.model

sealed class Routes(val route:String) {
    object Login:Routes("login")
    object Registro:Routes("registro")
    object Main:Routes("main")
    object Mapa:Routes("mapa")
    object Favoritas:Routes("favoritas")

    //Pasar el ID de usuario para saber que admin te ha borrado un post
    object Admin:Routes("admin/{id}") {
        fun createRoute(id:Int) = "admin/$id"
    }

    //Pasar el ID de usuario para ver el perfil
    object Perfil:Routes("perfil/{id}") {
        fun createRoute(id:Int) = "perfil/$id"
    }
    //Pasar el ID de la publicacion para visualizarla con detalle
    object Publicacion:Routes("publicacion/{id}") {
        fun createRoute(id:Int) = "perfil/$id"
    }

    //Pasar el ID de usuario para mostrar todas sus publicaciones
    object Publicaciones:Routes("publicaciones/{id}") {
        fun createRoute(id:Int) = "publicaciones/$id"
    }

    //Pasar ID del usuario para mostrar a quien sigue
    object Siguiendo:Routes("siguiendo/{id}") {
        fun createRoute(id:Int) = "siguiendo/$id"
    }
}