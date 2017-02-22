function work(){
    var x = document.forms["getinfo"]["status"].value;
    if (x == "estudiante") {
        document.getElementById("result").innerHTML = "¿Dónde estudias?";

        return true;
    }else{
        document.getElementById("result").innerHTML = "¿Dónde trabajas?";

        return false;
    }
}