var sec=60
var min=10
var iniciado = false;

var interval

function start(){
    if (min == 0 || iniciado == true){
        return;
    }
    iniciado = true;
    watch()
    interval= setInterval(watch,1000)
}

function pause(){
    clearInterval(interval)

}

function stop(){
    clearInterval(interval)
    sec=00
    min=00
    document.getElementById('watch').innerText='00:00'
    window.alert("Atenção! A estimativa de tempo acabou!: "+document.getElementById('watch').innerText)
    

}

function watch(){
    sec--
    if(sec==0){
        min--
        sec=60
        if(min==0){
            stop();
            document.getElementById('watch').innerText='00:00'
            iniciado = false;
        }
    }
    document.getElementById('watch').innerText=min+':'+sec
}