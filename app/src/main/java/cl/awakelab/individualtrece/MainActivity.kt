package cl.awakelab.individualtrece

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.ceil


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {

    val resultado = suma(53.22, 34F)
    println("El resulatdo es $resultado")

    val redondeo = redondeo(34.23)
    println(redondeo)

}

fun suma(parm1: Double, param2: Float): Double = parm1 + param2

fun redondeo(param1: Double): Double = ceil(param1)
