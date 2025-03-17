#include <iostream>
#include <vector>
 
using namespace std;

struct Producto{

string nombre;
bool promocion;
int cantventas;
float precio;
string categoria;

};

struct Fecha{
    int dia;
    int mes;
    int año;
};

struct Pedido{
    string cliente;
    vector <Producto> productos;
    vector <Fecha> fechas;
    int total=0;
};

void ingresarprod (vector <Producto> &productos){
Producto producto;
string opcion;
cout<<"ingrese el nombre del producto: "<<endl;
cin>>producto.nombre;
cout<<endl;

cout<<"¿tiene descuento (si/no)?"<<endl;
cin>>opcion;
cout<<endl;
if (opcion == "si"){
    producto.promocion=true;
}
else{
    producto.promocion=false;

}

producto.cantventas=0;

cout<<"ingrese el precio del producto: "<<endl;
cin>>producto.precio;
cout<<endl;

cout<<"ingrese la categoria del producto: "<<endl;
cin>>producto.categoria;
cout<<endl;

if (producto.promocion==true){
    producto.precio=producto.precio-producto.precio*0.2;
}

productos.push_back(producto);
}


void ingresarped (vector <Producto> &productos , vector <Fecha> &fechas, vector <Pedido> &pedidos){
Pedido pedido;
Fecha fecha;
string opcion="si";

cout<<"ingrese su nombre: "<<endl;
cin>>pedido.cliente;
cout<<endl;


while (opcion=="si"){
cout<<"ingrese el nombre de los productos que deseea: "<<endl;
string nomprod;
cin>>nomprod;
cout<<endl;
for(int i=0; i<productos.size(); i++){
if (nomprod==productos[i].nombre){
    productos[i].cantventas++;
    pedido.productos.push_back(productos[i]);
}
}

cout<<"quieres ingresar otro producto?"<<endl;
cin>>opcion;
cout<<endl;

}

cout<<"ingrese el dia"<<endl;
cin>>fecha.dia;
cout<<endl; 
cout<<"ingrese el mes"<<endl;
cin>>fecha.mes;
cout<<endl;cout<<"ingrese el año"<<endl;
cin>>fecha.año;
cout<<endl;

fechas.push_back(fecha);
pedido.fechas.push_back(fecha);
for(int i=0;i<pedido.productos.size();i++){

pedido.total+=pedido.productos[i].precio;
cout<<"El precio va en:"<<pedido.total<<endl;

}
pedidos.push_back(pedido);
}


void busqueda(vector <Pedido> pedidos){
string nom;

cout<<"para buscar un pedido ingrese el nombre del cliente que lo pidio"<<endl;
cin>>nom;
cout<<endl;

for(int i=0; i<pedidos.size();i++)
{
    if(nom==pedidos[i].cliente){
        for(int k=0; k<pedidos[i].productos.size();k++)
        {
            cout<<pedidos[i].productos[k].nombre<<endl;
            cout<<pedidos[i].productos[k].precio<<endl;
            
    }
        cout<<"total del pedido: "<<pedidos[i].total<<endl;
        return;
}
} 
cout<<"no se encontro el pedido"<<endl;
return;
}

void ordenar(vector<Producto> &productos) {
    int n = productos.size();

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (productos[j].cantventas < productos[j + 1].cantventas) { 
                Producto temp = productos[j];
                productos[j] = productos[j + 1];
                productos[j + 1] = temp;
            }
        }
    }

    cout << "Productos ordenados por cantidad de ventas: ";
    for (Producto producto : productos) {
        cout << "Nombre: " << producto.nombre <<endl;
          cout   << "Ventas: " << producto.cantventas <<endl;
          cout   << "Precio: " << producto.precio <<endl;
        cout  << "Categoria: " << producto.categoria<<endl;
    }
}

int main (){
vector <Pedido> pedidos;
vector <Producto> productos;
vector <Fecha> fechas;

int opcion;
  do{     
    cout << "1 - ingresar producto" << endl;
    cout << "2 - ingresar pedido" << endl;
    cout << "3 - busca pedido" << endl;
    cout << "4 - productos ordenados" << endl;
    cout<<"Elija una opcion"<<endl;
    cin>>opcion;
    
    switch (opcion)
        {
        case 1:
            ingresarprod(productos);
            break;
        case 2:
            ingresarped(productos,fechas,pedidos);
            break;
        case 3:
            busqueda(pedidos);
            break;
        case 4:
            ordenar(productos);
            break;
            case 5:
                cout << "Saliendo del programa..." << endl;
                break;
            default:
                cout << "Opción no válida. Intenta nuevamente." << endl;
        }
    } while (opcion != 5);

}
