
  document.head.innerHTML='<link rel="stylesheet" href="./css/style.css"></link>';

  const header = document.querySelector('header');
  const myH1 = document.createElement("h1");
  header.appendChild(myH1);

  function creerImage(){
  var image = document.createElement("img");
  image.src = "./images/wow.jpg";
  document.body.appendChild(image);}

  const phrase1 = "Je m'appelle Florent"
  const phrase2 = "Je suis heureux"
  const phrase3 = "Et j'ai fini l'ABCDev vendredi"
  let affichagePhrase ;

  function resolveAfter2Seconds() {
    return new Promise((resolve) => {
      setTimeout(() => {
        resolve(affichagePhrase);
      }, 2000);
    });
  }

async function asyncCall() {
  creerImage();

  let x = 1;

  while(1 !=2)
  {
    switch (x) {
      case 1:
        affichagePhrase = phrase1;

        myH1.style.color="red";
        document.body.style.backgroundColor="blue";

        document.querySelector('img').src="./images/gnome.jpg";
        x=2;
        console.log("test")
        break;

        case 2:
          affichagePhrase = phrase2;

          myH1.style.color="green";
          document.body.style.backgroundColor="red";

          document.querySelector('img').src="./images/guerrier.jpg";
          x=3;
          console.log("test")
        break;

        case 3:
          affichagePhrase = phrase3;

          myH1.style.color="blue";
          document.body.style.backgroundColor="green";

          document.querySelector('img').src="./images/draenei.jpg";
          x=1;
          console.log("test")
        break;

      default:
        break;
      }

      await resolveAfter2Seconds();
      myH1.textContent = affichagePhrase;
  }
      // Expected output: "resolved"
  }

  asyncCall();
