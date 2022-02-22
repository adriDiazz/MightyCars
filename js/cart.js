const carrContainer = document.querySelector('.cards__cart');
const btnBuy = document.querySelector('.btn-buy');
console.log(btnBuy);

cartTimes = localStorage.getItem('cartTimes')

carsOnCart = [];



for (var i = 0; i < cartTimes; i++){
    carsOnCart.push(localStorage.getItem(`cart${i+1}`))
}

console.log(carsOnCart)
carsOnCart.map(car => {
    const tpl = `<div class="card__cart_product">
    <img src="./img/Camioneta_FFFFF_1.png" alt="">
    <div class="info__card_cart">
      <span class="span__name">${car}</span>
      <span>Entrega estimada:03/32/43</span>
    </div>
  </div>`

  carrContainer.innerHTML += tpl
})

btnBuy.addEventListener('click',()=>{
  localStorage.clear()
})


