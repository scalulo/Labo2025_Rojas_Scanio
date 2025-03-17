#include <iostream>
#include <vector>
 
using namespace std;


struct Equipo{
    string nombre;
    int golesfavor=0;
    int golescontra=0;
    int posicion;
    int puntos=0;
    vector <string> historial;

};

struct Fecha{
    int dia;
    int mes;
    int año;
};

struct Partido{
    string equipolocal;
    string equipovisitante;
    int goleslocal;
    int golesvisita;
    string estadio;
    vector<Fecha> fechas;

};


 

void ingresar(vector <Equipo> &equipos){
    Equipo equipo;
    string opcion;

    
    cout<<"Ingrese el nombre:"<<endl;
    cin>>equipo.nombre;
    equipos.push_back(equipo);

 
}

void pasar(vector <Equipo> &equipos,Partido partido){


for(int i=0;i<equipos.size();i++){
    
    if(partido.equipolocal==equipos[i].nombre){
        equipos[i].golesfavor+=partido.goleslocal;
        equipos[i].golescontra+=partido.golesvisita;
    }
    if(partido.equipovisitante==equipos[i].nombre){
        equipos[i].golesfavor+=partido.golesvisita;
        equipos[i].golescontra+=partido.goleslocal;
}

}

}

void registrar(vector <Fecha> &fechas,vector <Partido> &partidos,vector <Equipo> &equipos){
    Partido partido;
    Fecha fecha;

    cout<<"Ingrese el equipo local:"<<endl;
    cin>>partido.equipolocal;
    cout<<"Ingrese el equipo visitante:"<<endl;
    cin>>partido.equipovisitante;
    cout<<"Ingrese el nombre del estadio:"<<endl;
    cin>>partido.estadio;
    cout<<"Ingrese los goles del equipo local:"<<endl;
    cin>>partido.goleslocal;
    cout<<"Ingrese los goles del equipo visitante:"<<endl;
    cin>>partido.golesvisita;
    
    partidos.push_back(partido);

    cout<<"Ingrese el dia del partido:"<<endl;
    cin>>fecha.dia;
    cout<<"Ingrese el mes del partido:"<<endl;
    cin>>fecha.mes;
    cout<<"Ingrese el año del partido:"<<endl;
    cin>>fecha.año;

    fechas.push_back(fecha);

    pasar(equipos,partido);

}

void mostrar(vector <Partido> &partidos){
    string local;
    string visitante;

cout<<"Ingrese el equipo que fue local:"<<endl;
cin>>local;
cout<<"Ingrese el equipo visitante:"<<endl;
cin>>visitante;

}

int main(){

vector <Fecha> fechas;
vector <Equipo> equipos;
vector <string> posiciones;
vector <Partido> partidos;

int opcion;



cout << endl;
    do{     
    cout << "1 - Ingresar equipos." << endl;
    cout << "2 - Registrar datos de partidos." << endl;
    cout << "3 - Mostrar un partido especifico ." << endl;
    cout << "4 - Mostrar tabla " << endl;
    cout<<"Elija una opcion"<<endl;
    cin>>opcion;
    
    switch (opcion)
        {
        case 1:
           ingresar(equipos);
            break;
        case 2:
            registrar(fechas,partidos,equipos);
            
            break;
        case 3:
            mostrar(partidos);
            break;
        case 4:
            
            break;
            case 5:
                cout << "Saliendo del programa..." << endl;
                break;
            default:
                cout << "Opción no válida. Intenta nuevamente." << endl;
        }
    } while (opcion != 5);

}