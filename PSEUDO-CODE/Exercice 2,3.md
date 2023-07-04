Variables
    a est un décimal
    b est un décimal
    c est un décimal

Débur du Programme
    Ecrire "Entrer un nombre"
    Lire <-- a
    Ecrire " Entrer un deuxième nombre"
    Lire <-- b
    Ecrire " Entrer un troisième nombre"
    Lire <-- c

    Debut si
        si 
            a<b et b<c
        alors
            Ecrire a," < ",b," < ",c
        sinon si
            a<c et c<b
        alors
            Ecrire a," < ",c," < ",b
        sinon si
            b<c et c<a
        alors
            Ecrire b," < ",c," < ",a
        sinon si
            b<a et a<c
        alors
            Ecrire b," < ",a," < ",c
        sinon si
            c<a et a<b
        alors
            Ecrire c," < ",a," < ",b
        sinon si
            c<b et b<a
        alors
            Ecrire c," < ",bc," < ",a
    Fin si
    
Fin du Programme