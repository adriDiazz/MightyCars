(function(){
    const brands = document.querySelectorAll('.section__marcas--fade-left');
    const brands2 = document.querySelectorAll('.section__marcas--fade-right');

    console.log(brands2)

    const  appearOptions = {
        threshold :1,
        rootMargin : "0px 0px -200px 0px"
    };
    const appearOnScroll = new IntersectionObserver(
        function(entries, appearOnScroll) {
            entries.forEach(entry    => {
                if(!entry.isIntersecting) {
                    return;
                }else {
                    entry.target.classList.add('fade-in');
                    appearOnScroll.unobserve(entry.target)
                }
            });
        }, appearOptions);

        brands.forEach(brand => {
            appearOnScroll.observe(brand);
        });

        brands2.forEach(brands2 => {
            appearOnScroll.observe(brands2);
        })
   })();

