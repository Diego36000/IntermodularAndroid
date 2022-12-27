package ejercicios.dam.intermodularandroid.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import ejercicios.dam.intermodularandroid.admin.Admin
import ejercicios.dam.intermodularandroid.login.ui.Login.Login
import ejercicios.dam.intermodularandroid.login.ui.Registro.Registro
import ejercicios.dam.intermodularandroid.main.ui.Favoritas.Favoritas
import ejercicios.dam.intermodularandroid.main.ui.Main.Main
import ejercicios.dam.intermodularandroid.main.ui.Mapa.Mapa
import ejercicios.dam.intermodularandroid.main.ui.Perfil.Perfil
import ejercicios.dam.intermodularandroid.main.ui.Publicacion.Publicacion
import ejercicios.dam.intermodularandroid.main.ui.Publicaciones.Publicaciones
import ejercicios.dam.intermodularandroid.main.ui.Siguiendo.Siguiendo
import ejercicios.dam.intermodularandroid.model.Routes

@Composable
fun CustomNavigator() {
    //val LoginViewModel = LoginViewModel()

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Login.route) {
        composable(route=Routes.Login.route) {
            Login(navController = navController)
        }
        composable(route=Routes.Registro.route) {
            Registro(navController = navController)
        }
        composable(route=Routes.Main.route) {
            Main(navController = navController)
        }
        composable(route=Routes.Mapa.route) {
            Mapa(navController = navController)
        }
        composable(route=Routes.Favoritas.route) {
            Favoritas(navController = navController)
        }
        composable(
            route = Routes.Admin.route,
            arguments = listOf(navArgument("id") {
                type= NavType.IntType
            })
        ) { navBackStackEntry ->  
            Admin(
                navController = navController,
                id = navBackStackEntry.arguments?.getInt("id")?:0
            )
        }
        composable(
            route = Routes.Publicacion.route,
            arguments = listOf(navArgument("id") {
                type= NavType.IntType
            })
        ) { navBackStackEntry ->
            Publicacion(
                navController = navController,
                id = navBackStackEntry.arguments?.getInt("id")?:0
            )
        }
        composable(
            route = Routes.Publicaciones.route,
            arguments = listOf(navArgument("id") {
                type = NavType.IntType
            })
        ) { navBackStackEntry ->
            Publicaciones(
                navController = navController,
                id = navBackStackEntry.arguments?.getInt("id")?:0
            )
        }
        composable(
            route = Routes.Siguiendo.route,
            arguments = listOf(navArgument("id") {
                type = NavType.IntType
            })
        ) { navBackStackEntry ->
            Siguiendo(
                navController = navController,
                id = navBackStackEntry.arguments?.getInt("id")?:0
            )
        }
        composable(
            route = Routes.Perfil.route,
            arguments = listOf(navArgument("id") {
                type = NavType.IntType
            })
        ) { navBackStackEntry ->
            Perfil(
                navController = navController,
                id = navBackStackEntry.arguments?.getInt("id") ?: 0
            )
        }
    }
}