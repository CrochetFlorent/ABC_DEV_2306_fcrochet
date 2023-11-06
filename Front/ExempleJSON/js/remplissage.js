document.head.innerHTML="<title>Mes super héros</title>";
document.head.innerHTML='<link rel="stylesheet" href="./css/style.css"></link>';

populate();

async function populate() {

    const requestURL = './json/superheros.json';
    const request = new Request(requestURL);

    const response = await fetch(request);
    const superHeroes = await response.json();

    populateHeader(superHeroes);
    populateHeroes(superHeroes);
  }

function populateHeader(obj) {
    const header = document.querySelector('header');
    const myH1 = document.createElement('h1');
    myH1.textContent = obj.squadName;
    header.appendChild(myH1);
    myH1.setAttribute('id','titre1');

    const myPara = document.createElement('p');
    myPara.textContent = `Hometown: ${obj.homeTown} // Formed: ${obj.formed}`;
    header.appendChild(myPara);
    myPara.setAttribute('id','para1');
  }

  function populateHeroes(obj) {
    const section = document.querySelector('section');
    const heroes = obj.members;
    let i=1;
    
    for (const hero of heroes) {
      const myArticle = document.createElement('article');
      const myH2 = document.createElement('h2');
      const myPara1 = document.createElement('p');
      const myPara2 = document.createElement('p');
      const myPara3 = document.createElement('p');
      const myList = document.createElement('ul');
      myH2.textContent = hero.name;
      myPara1.textContent = `Secret identity: ${hero.secretIdentity}`;
      myPara2.textContent = `Age: ${hero.age}`;
      myPara3.textContent = 'Superpowers:';

      const superPowers = hero.powers;
      for (const power of superPowers) {
        const listItem = document.createElement('li');
        listItem.textContent = power;
        myList.appendChild(listItem);
      }

      myArticle.appendChild(myH2);
      myArticle.appendChild(myPara1);
      myArticle.appendChild(myPara2);
      myArticle.appendChild(myPara3);
      myArticle.appendChild(myList);

      section.appendChild(myArticle);
      section.classList.add('articles');

      myArticle.setAttribute('id','article'+i++);

      myH2.classList.add('titre2');
      myPara1.classList.add('para');
      myPara2.classList.add('para');
      myPara3.classList.add('para');
      myList.classList.add('list');    
    } 
  }

  