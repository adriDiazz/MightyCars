
(function(){
    // some code…
    const card = document.querySelector('.cards__container');
    

    fetch('https://mightycars.herokuapp.com/productos')
    .then(response => response.json())
    .then(cars => {
        console.log(cars);
        const tlp = cars.map(car => `<div class="cards">
        <img src="/img/CARD_1.png" alt="">
        <div class="info-cards">
            <span class="nombrecarro">${car.modelo}</span>
            <span class="linea"></span>
            <div class="name__cards_info">
                <div class="info">
                    <p>${car.modelo}</p>
                    <p>Coche coche uno coche</p>
                </div>
                <div class="info">
                    <p>PRECIO: ${car.precio}$</p>
                </div>
            </div>
            <div class="buttons">
                <button class="btn-select">SELECCIONAR</button>
                <button class="btn-detail">DETALLES</button>
            </div>
        </div>
    </div>`)
        card.innerHTML = tlp;
    })
    })();

    function getImage(tolook){
        fetch(`https://en.wikipedia.org/w/api.php?action=query&format=json&formatversion=2&prop=pageimages|pageterms&piprop=thumbnail&pithumbsize=600&titles=${tolook}`)
        .then(response => response.json())
        .then(data => {
            console.log(data.query.pages[0].thumbnail.source);
        });
    }
  


