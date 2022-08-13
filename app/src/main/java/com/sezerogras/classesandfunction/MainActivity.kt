package com.sezerogras.classesandfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sezerogras.classesandfunction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var name = ""

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        test()

        // void = Unit
       // mysum(10,29)  // ben burayı bir değişkene eşitleyemem bir şey döndürmediği için

        // Return
       println(multiply(48,43))  // ama burayı bir eğişkene eşitleyebilirm


        // Class
        // Object & Instance
        val homer = Simpson("Homer Simpson", 50 , "Nuclear")  // siimpson sınıfından homer objesini oluşturdum
        homer.cahangeHairColor() // buradan erişebildim

        /*  homer.age = 50
        homer.job = "Nuclear"   // constructor kullanmadan önce bu şekilde yazmam gerekli
        homer.name = "Homer Simpson"
        println(homer.age)     // yaşını bu şekilde görmüş olduk

         */

        println(homer.name)



     // yeni bir özellik ***  Nullability  **** ---> bir şeyin boş olabilmesi manasına geliyor
     // Nullable (?) & Non-Null iki tip var
        var myString : String? = null // yazarsam artıkk null a eşitleyebilirim ve hata almam tek yapmam gereken sonuna soru işareti koymak
        println(myString)  // yazarsam logcat da null değerini görmüş olurum

        var myAge : Int? =null

       // println(myAge!! * 10) // normalde ünlem koymasam hata alırım null ile bir değeri çarpmak mantık hatası fakat ben initialize ettiğimden eeminsem bu şekilde kullanabilirim eğer etmediysem uygulama patlar

         // Güvenlik önlemleri (security precautions)

        // 1) Null safety
        if(myAge != null){
            println(myAge*10)
        }
        else {
            println("myAge is null")
        }


        // 2) safe call
        println(myAge?.compareTo(2)) // yani bilmiyorum demek istedim null mı değil mi

        // 3) elvis

        val myResult = myAge?.compareTo(2) ?: -100  // anlamı değeri null cıkarsa myAge nin değerini -100 e esşitle demek
        println(myResult)





    }

    fun test(){
        println("test function created!")
    }

    // Input & Return
    fun  mysum(a:Int , b: Int){

     var c = a+b
        println(c)

    }

    fun multiply(x: Int , y: Int) : Int {   // artık Unit değil bana bir Integer değer dödürmek zorunda

        return x*y

    }

    // fonksiyonların görünümlerle çalışması
/*
    fun button(view:View){  // view in anlamı yani bir görünüm tarafından kullanılacak
        println("Hello Kotlin!")


    }

 */

    fun simpsonMake(view:View){

         name = binding.nameText.text.toString()
        var age = binding.ageText.text.toString().toIntOrNull()
        if (age == null){
            age = 0
        }
        val job = binding.jobText.text.toString()

         val simpson = Simpson(name,age,job)
        binding.resultText.text = "Name : ${simpson.name} , Age : ${simpson.age} , Job : ${simpson.job}"




    }

    fun scopeButton(view:View){
        // Scope --> Kapsam
        println(name)         // name i global ytanımladığım için bu kod bloğunda da kullanabildim
        

    }
}