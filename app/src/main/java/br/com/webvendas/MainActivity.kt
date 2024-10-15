package br.com.webvendas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import models.Car
import models.adapter.CarAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvPost = findViewById<RecyclerView>(R.id.post)

        rvPost.adapter = CarAdapter(post)
        rvPost.layoutManager = LinearLayoutManager(this)
        //rvPost.layoutManager = GridLayoutManager(this, 2)
    }

    private val post = listOf(
        Car(
            "Ferrari 458",
            "Ar quente Banco com regulagem de altura Controle de tração Freio ABS Rodas de liga leve Volante com regulagem de altura Direção hidráulica",
            "R$ 2.349.990.00",
             R.drawable.ferrari,
            "Vermelho",
            "458",
            "2010/2010",
            "4.5 V8 GASOLINA F1-DCT",
            "35.000",
            "4.5 V8 GASOLINA F1-DCT",
            3.5f
        ),
        Car(
            "Lamborghini Huracán",
            "Airbag Ar quente Banco com regulagem de altura Computador de bordo Controle de tração Freio ABS Retrovisores elétricos Rodas de liga leve Travas elétricas Vidros elétricos",
            "R$ 4.200.000.00",
             R.drawable.lamborghini,
            "Preto",
            "Huracán",
            "2023/2023",
            "5.2 V10 GASOLINA LP 640 TECNICA LDF",
            "1.943",
            "5.2 V10 GASOLINA LP 640 TECNICA LDF",
            2.5f
        ),
        Car(
             "Porsche 718",
             "Airbag Alarme Banco com regulagem de altura Computador de bordo Controle de tração Desembaçador traseiro Ar condicionado Freio ABS Controle automático de velocidade Retrovisores elétricos Rodas de liga leve Sensor de estacionamento Retrovisor fotocrômico Travas elétricas Vidros elétricos Volante com regulagem de altura Bancos em couro GPS",
             "R$ 499.990.00",
              R.drawable.porsche,
            "Cinza",
            "718",
            "2018/2018",
            "2.5 16V H4 GASOLINA CAYMAN GTS PDK",
            "30.000",
            "2.5 16V H4 GASOLINA CAYMAN GTS PDK",
            5f
        ),
        Car(
             "Ford Mustang",
             "Airbag Alarme Ar quente Banco com regulagem de altura Computador de bordo Controle de tração Ar condicionado Encosto de cabeça traseiro Freio ABS Controle automático de velocidade Retrovisores elétricos Rodas de liga leve Sensor de estacionamento Retrovisor fotocrômico Travas elétricas Vidros elétricos Volante com regulagem de altura Bancos em couro GPS",
             "R$ 385.000.00",
              R.drawable.mustang,
            "Azul Marinho",
            "GT",
            "2018/2019",
            "2.5 16V H4 GASOLINA CAYMAN GTS PDK",
            "11.150",
            "2.5 16V H4 GASOLINA CAYMAN GTS PDK",
            4f
        )
    )
}