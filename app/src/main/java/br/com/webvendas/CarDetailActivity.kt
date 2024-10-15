package br.com.webvendas

import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import models.Car
import org.w3c.dom.Text

class CarDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_car_detail)


        val car = intent.getSerializableExtra("ITEM_CAR") as Car

        val name = findViewById<TextView>(R.id.name)
        name.text = car.nomeCarro

        val price = findViewById<TextView>(R.id.price)
        price.text = car.price

        val image = findViewById<ImageView>(R.id.image)
        image.setImageResource(car.foto)

        val cor = findViewById<TextView>(R.id.description_cor)
        cor.text = car.cor

        val modelo = findViewById<TextView>(R.id.description_modelo)
        modelo.text = car.modelo

        val ano = findViewById<TextView>(R.id.description_ano)
        ano.text = car.ano

        val description = findViewById<TextView>(R.id.descri_car)
        description.text = car.descricao

        val item = findViewById<TextView>(R.id.car_item)
        item.text = car.item

        val km = findViewById<TextView>(R.id.description_km)
        km.text = car.km

        val rating = findViewById<RatingBar>(R.id.rating)
        rating.rating = car.rating
    }
}