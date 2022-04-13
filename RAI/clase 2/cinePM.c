#include<stdio.h>
#include<string.h>

//Estructuras del cine
typedef struct habitacion{
    char silla[5][5];
}salas;

typedef struct negocio{
    char nombre[10];
    salas normales[3];
}cine;

typedef struct asiento{
    char fila;
    char silla;
}butaca;

typedef struct boleta{
    int valor_total;
    butaca reservas[25];
}ticket;

main(){
    int i, j;
    printf("Bienvenidos al Cine");


    cine cinePM;//creado como variable
    //cinePM.nombre= "cinePM";
    strcpy(cinePM.nombre, "cinePM");
    //Asiento habiles en ' ' y los ocupados en 'X'
    for(i=0; i<5;i++)
        for(j=0;j<5;j++)
            cinePM.normales[0].silla[i][j] = ' ';
    for(i=0; i<5;i++)
        for(j=0;j<5;j++)
            cinePM.normales[0].silla[i][j] = ' ';    
    for(i=0; i<5;i++)
        for(j=0;j<5;j++)
            cinePM.normales[0].silla[i][j] = ' ';
}