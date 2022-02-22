
(function(){
    // some code…
    const card = document.querySelector('.cards__container');
    count = 0
    if(localStorage.getItem('cartTimes') > 0){
        count2 = localStorage.getItem('cartTimes')
    }else{
        count2 = 0
    }
    
    cart = []

    fetch('https://mightycars.herokuapp.com/productos')
    .then(response => response.json())
    .then(cars => {
        const tlp = cars.map(car => `<div class="cards">
        <img src="${car.imagen}" alt="${car.modelo}">
        <div class="info-cards">
            <span class="nombrecarro">${car.marca.toUpperCase() + ' ' + car.modelo}</span>
            <span class="linea"></span>
            <div class="name__cards_info">
                <div class="info">
                    <p>${car.modelo}</p>
                    <p>Coche coche uno coche</p>
                </div>
                <div class="info">
                    <p>PRECIO: ${formatPrice(car.precio)}</p>
                </div>
            </div>
            <div class="buttons">
                <button class="btn-select">AÑADIR AL CARRO</button>
                <button class="btn-detail">DETALLES</button>
            </div>
        </div>
    </div>`)
        card.innerHTML = tlp;
    }).then(function (){
        const nombreCarro = document.querySelectorAll('.nombrecarro');
        const botones = document.querySelectorAll('.btn-select');
        botones.forEach(btn => {
            btn.addEventListener('click', () => {
                count2++;
                nameCarro = (btn.parentNode.parentNode.firstChild.nextSibling.textContent);
                console.log(nameCarro)
                localStorage.setItem(`cart${count2}`,nameCarro);
                localStorage.setItem(`cartTimes`,count2);
            })  

        })
    })
})();


function formatPrice(price) {
    let formatedPrice = price.toString(),
        float;

    if (formatedPrice.match(/\./)) {
        float = formatedPrice.split('.')[1];
        float = float.slice(0, 2);
        formatedPrice = formatedPrice.split('.')[0];
    } else 
        float = '00';

    if (formatedPrice.length > 3) {
        formatedPrice = formatedPrice.split('').reverse().join('').replace(/(?=\d*)(\d{3})/g,'$1.');
        formatedPrice = formatedPrice.split('').reverse().join('').replace(/^[\.]/,'');
    }

    return `$${formatedPrice},${float}`
}