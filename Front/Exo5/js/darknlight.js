
let dark = document.getElementById('theme-btn');


dark.addEventListener("click",Dark);

let element = document.querySelector("body").classList;
let darklight = "false";

function Dark() {
    element.toggle("theme2");
}


