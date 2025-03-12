#include <iostream>
#include <vector>
 
using namespace std;
 
struct Producto{
    string nombre;
    int cantidad;
    int precio;
};
 
struct Pedido{
int numero;
string nombre;
vector <Producto> productos;
int total=0;
};
 
 
void ingresarped(vector <Pedido> &pedidos){
    Pedido pedido;
    cout<<"ingresa el numero: ";
    cin>>pedido.numero;
    cout<<endl;
 
    cout<<"ingresa tu nombre: ";
    cin>>pedido.nombre;
    cout<<endl;
 
    int cant;
    cout<<"ingresa el numero de articulos distintos que comprarás: ";
    cin>>cant ;
    cout<<endl;
    
    for(int i=0;i<cant;i++){
    Producto producto;
    cout<<"ingresa el nombre del producto: ";
    cin>>producto.nombre;
    cout<<endl;
 
    cout<<"ingresa la cantidad que deseas: ";
    cin>>producto.cantidad;
    cout<<endl;
           
    cout<<"ingresa el precio unitario del producto: ";
    cin>>producto.precio;
    cout<<endl;           
    
    producto.precio*=producto.cantidad;
    pedido.productos.push_back(producto);
    pedido.total+=producto.precio;
    }
    cout<<"El total de tu pedido es: $"<<pedido.total;
    cout<<endl;           
    pedidos.push_back(pedido);
 
}

void cancelar(vector <Pedido> &pedidos) {
    int nro;
    cout << "qué número de pedido quieres cancelar?" << endl;
    cin >> nro;

    for (int i = 0; i < pedidos.size(); i++) {
        if (pedidos[i].numero == nro) {
            string opcion;
            cout << "está seguro que lo quiere cancelar? " << endl;
            cin >> opcion;
            if (opcion == "si") {
                pedidos.erase(pedidos.begin() + i);  
                cout << "pedido cancelado" << endl;
                return;
            } else {
                cout << "cancelación cancelada" << endl;
                return;
            }
        }
    }
    cout << "no se encontró el número de pedido" << endl;
}

void mostrar(vector <Pedido> pedidos){

for (int i=0;i<pedidos.size();i++){

        cout<<pedidos[i].numero<<endl;
        cout<<pedidos[i].nombre<<endl;
        cout<<pedidos[i].total<<endl;
        cout<<endl;
        
}
}

void totald(vector <Pedido> &pedidos) {
int totald=0;
for (int i=0; i<pedidos.size();i++){

totald+=pedidos[i].total;

}
cout<<endl;
cout<<"la ganancia total de hoy fue de: $"<<totald<<endl;

}

int main() {
    vector<Pedido> pedidos;
    int opcion;

    do {
        cout << "Menú de opciones:" << endl;
        cout << "1 - Crear pedido" << endl;
        cout << "2 - Cancelar pedido" << endl;
        cout << "3 - Mostrar pedidos" << endl;
        cout << "4 - Mostrar total" << endl;
        cout << "5 - Salir" << endl;
        cin >> opcion;

        switch (opcion) {
            case 1:
                ingresarped(pedidos);
                break;
            case 2:
                cancelar(pedidos);
                break;
            case 3:
                mostrar(pedidos);
                break;
                case 4:
                totald(pedidos);
                break;                
            case 5:
                cout << "Saliendo del programa..." << endl;
                break;
            default:
                cout << "Opción no válida. Intenta nuevamente." << endl;
        }
    } while (opcion != 5);

    return 0;
}