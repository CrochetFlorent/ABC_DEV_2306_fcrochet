const targetDiv = document.querySelector(".carousel-inner");

populate();

async function populate() {

    const requestURL = './json/stock.json';
    const request = new Request(requestURL);

    const response = await fetch(request);
    const images = await response.json();
    console.log(images);
    remplissage(images);
  }

function remplissage(_tabObj){
    for(let i=0;i<_tabObj.length;i++)
    { 
        if(i==0)
        {  
            slide = document.createElement("div");
            slide.classList.add('carousel-item');
            slide.classList.add('active');

            image = document.createElement("img");
            image.setAttribute('src','./img/photos_volcans/'+_tabObj[i].num+".jpg");
            image.setAttribute('alt',_tabObj[i].titre);
            image.classList.add('d-block');
            image.classList.add('w-100');

            caption = document.createElement("div");
            caption.classList.add('carousel-caption');
            caption.classList.add('d-non');
            caption.classList.add('d-md-block');

            titre = document.createElement('h5');
            titre.textContent = _tabObj[i].titre;

            para = document.createElement('p');
            para.textContent= _tabObj[i].para;

            caption.appendChild(para);
            caption.appendChild(titre);

            slide.appendChild(caption);
            slide.appendChild(image);

            targetDiv.appendChild(slide);
         
           
        }else{
            slide = document.createElement("div");
            slide.classList.add('carousel-item');

            image = document.createElement("img");
            image.setAttribute('src','./img/photos_volcans/'+_tabObj[i].num+".jpg");
            image.setAttribute('alt',_tabObj[i].titre);
            image.classList.add('d-block');
            image.classList.add('w-100');

       

            caption = document.createElement("div");
            caption.classList.add('carousel-caption');
            caption.classList.add('d-non');
            caption.classList.add('d-md-block');

            titre = document.createElement('h5');
            titre.textContent = _tabObj[i].titre;

            para = document.createElement('p');
            para.textContent= _tabObj[i].para;

            slide.appendChild(image);
            caption.appendChild(para);
            caption.appendChild(titre);
            slide.appendChild(caption);

           
            targetDiv.appendChild(slide);

        }
    }
}
