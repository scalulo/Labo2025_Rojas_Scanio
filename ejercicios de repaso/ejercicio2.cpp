#include <iostream>
#include <vector>

using namespace std;

struct Producto{
    string nombre;
    int codigo;
    string marca;
    float precio;
    string fecha;
    
};

void ingresar( Producto productos[3][4], int contador ){
    Producto producto;
    string opcion;
    
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) { 
            cout << "Ingrese nombre del producto [" << i << "][" << j << "]: ";
            cin >> productos[i][j].nombre;
            cout << "Ingrese precio del producto [" << i << "][" << j << "]: ";
            cin >> productos[i][j].precio;
            cout << "Ingrese el codigo del producto [" << i << "][" << j << "]: ";
            cin >> productos[i][j].codigo;
            cout << endl;
            cout << "Ingrese la marca del producto [" << i << "][" << j << "]: ";
            cin >> productos[i][j].marca;
            cout<<"Tiene fecha de vencimiento"<<endl;
            cin>> opcion;

            if(opcion=="Si" or opcion=="si" ){
            contador++;
            cout << "Ingrese la fecha de vencimiento del producto [" << i << "][" << j << "]: ";
            cin >> productos[i][j].fecha;
        }
        }
    }

}

void mostrar(Producto productos[3][4]){
cout<<"El nombre del producto en la fila 2 y columna 3 es:"<<endl;
cout<<productos[1][2].nombre<<endl;
}

void promedio(Producto productos[3][4]){
    float suma=0;
    float promedio;
    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
        suma+=productos[i][j].precio;
    }
    
}
promedio=suma/12.0;
    cout<<"El promedio del precio del pasillo es:"<<endl;
    cout<<promedio<<endl;
}

void mayor(Producto productos[3][4]){
    int precio=0;
    int columna=0;

for(int i=0;i<4;i++){
    if(productos[i][0].precio>precio){
        precio=productos[i][0].precio;
        columna=1;
    }

}
for(int i=0;i<4;i++){
    if(productos[i][1].precio>precio){
        precio=productos[i][1].precio;
         columna=2;
    }

}
for(int i=0;i<4;i++){
    if(productos[i][2].precio>precio){
        precio=productos[i][2].precio;
         columna=3;
    }

}
for(int i=0;i<4;i++){
    if(productos[i][3].precio>precio){
        precio=productos[i][3].precio;
         columna=4;
    }

}
cout<<"La columna que tiene el mayor precio es la columna:"<<endl;
cout<<columna<<endl;
}

int main(){
    Producto productos[3][4];
    string opcion;
    string pregunta;
    int contador=0;
    ingresar(productos,contador);
    mostrar(productos);
    promedio(productos);
    mayor(productos);
    cout<<"La cantidad de productos con fecha de vencimiento son:"<<endl;
    cout<<contador<<endl;
}   