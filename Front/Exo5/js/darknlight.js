
change.addEventListener("click", changeTheme);

const element = document.querySelector("body").classList;
let darkModeWindows = window.matchMedia('(prefers-color-scheme: dark)').matches;

var darkMode= false;

/*if(darkModeWindows)
{
    element.toggle('dark');
    change.innerHTML = darkMode? "Dark" : "Light";
}else
{
    element.toggle(null);
    change.innerHTML = darkMode? "Light" : "Dark";
}*/


function changeTheme(){
    change.innerHTML = darkMode? "Dark" : "Light";
    if(!darkMode){
        element.toggle('dark');
        darkMode = true;    
    }else{
        element.remove('dark');
        element.toggle(null);
        darkMode = false;
    }
}

