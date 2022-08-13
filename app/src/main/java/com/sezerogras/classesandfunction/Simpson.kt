package com.sezerogras.classesandfunction

class Simpson(var name:String , var age: Int? , var job:String) {

    private var hairColor = ""

    fun cahangeHairColor(){
        this.hairColor = "yellow"   // private olduğu için diğer sınıftan erişemedm ama buradan erişebiliyorum fonksiyon private olmadığı için diğer sınıftan erişebiliyorum
    }
/*
aşağıda yazdığım kodları kotlinde artık tek stırda yazabilirim daha kolay bir şekilde
    // property
    var age = 0
    var name = ""
    var job = ""

    constructor(age: Int, name: String, job: String) {
        this.age = age
        this.name = name
        this.job = job
    }

 */
}