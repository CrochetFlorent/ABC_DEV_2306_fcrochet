let target = document.querySelector('body');

let maDiv1 = document.createElement('div');
let maDiv2 = document.createElement('div');
let maDiv3 = document.createElement('div');
let maDiv4 = document.createElement('div');
let maDiv5 = document.createElement('div');
let maDiv6 = document.createElement('div');

let texte1 = document.createElement('p');
let texte2 = document.createElement('p');
let texte3 = document.createElement('p');

let titre = document.createElement('h1');

maDiv1.classList.add('maDiv1');
maDiv2.classList.add('maDiv2');
maDiv6.classList.add('maDiv6');

maDiv3.setAttribute('id','div1');
maDiv4.setAttribute('id','div2');
maDiv5.setAttribute('id','div3');

titre.textContent= "ABCDev"
texte1.textContent = "Salut";
texte2.textContent = "Je suis";
texte3.textContent = "Content";

maDiv1.appendChild(maDiv2);
maDiv1.appendChild(maDiv6);



maDiv2.appendChild(maDiv3);
maDiv2.appendChild(maDiv4);
maDiv2.appendChild(maDiv5);

target.appendChild(maDiv1);

maDiv3.appendChild(texte1);
maDiv4.appendChild(texte2);
maDiv5.appendChild(texte3);

maDiv6.appendChild(titre);
