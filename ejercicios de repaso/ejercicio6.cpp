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
    string estadio;
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
    
    

    cout<<"Ingrese el dia del partido:"<<endl;
    cin>>fecha.dia;
    cout<<"Ingrese el mes del partido:"<<endl;
    cin>>fecha.mes;
    cout<<"Ingrese el año del partido:"<<endl;
    cin>>fecha.año;

    
    partidos.push_back(partido);
    partido.fechas.push_back(fecha);

    pasar(equipos,partido);

    if(partido.goleslocal>partido.golesvisita){
        for(int i=0;i<equipos.size();i++){
            if(equipos[i].nombre==partido.equipolocal){
                equipos[i].puntos+=3;
            }
        }
    }
    if(partido.golesvisita>partido.goleslocal){
        for(int i=0;i<equipos.size();i++){
            if(equipos[i].nombre==partido.equipovisitante){
                equipos[i].puntos+=3;

}
        }
    }
    if(partido.golesvisita>partido.goleslocal){
        for(int i=0;i<equipos.size();i++){
            if(equipos[i].nombre==partido.equipovisitante){
                equipos[i].puntos+=3;
}
        }
    }
   if(partido.golesvisita==partido.goleslocal){
        for(int i=0;i<equipos.size();i++){
            if(equipos[i].nombre==partido.equipovisitante){
                equipos[i].puntos+=1; 
}
        }
        for(int j=0;j<equipos.size();j++){
            if(equipos[j].nombre==partido.equipolocal){
                equipos[j].puntos+=1; 
        }
   }
}
}

void mostrar(vector <Partido> &partidos){
    string local;
    string visitante;
    int aux=0;

cout<<"Ingrese el equipo que fue local:"<<endl;
cin>>local;
cout<<"Ingrese el equipo visitante:"<<endl;
cin>>visitante;

for(int i=0;i<partidos.size();i++){
    if(partidos[i].equipolocal==local && partidos[i].equipovisitante==visitante){
        cout<<"El equipo local metio:"<<endl;
        cout<<partidos[i].goleslocal<<endl;
        cout<<"El equipo visitante metio:"<<endl;
        cout<<partidos[i].golesvisita<<endl;
        cout<<"Se jugo en:"<<endl;
        cout<<partidos[i].estadio<<endl;
        
    }
}


}

void tabla(vector <Partido> &partidos,vector <Equipo> &equipos,vector <Equipo> &posiciones){

posiciones = equipos;

    int n = posiciones.size();
    
    // Bubble Sort para ordenar por puntos y goles a favor en caso de empate
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (posiciones[j].puntos < posiciones[j + 1].puntos || 
               (posiciones[j].puntos == posiciones[j + 1].puntos && posiciones[j].golesfavor < posiciones[j + 1].golesfavor)) {
                swap(posiciones[j], posiciones[j + 1]);
            }
        }
    }

    // Mostrar la tabla de posiciones ordenada
    cout << "\nTabla de posiciones:\n";
    cout << "-------------------------------------------\n";
    cout << "| Pos | Equipo           | Puntos | GF   |\n";
    cout << "-------------------------------------------\n";

    for (size_t i = 0; i < posiciones.size(); i++) {
        cout << "| " << i + 1 << "   | " 
             << posiciones[i].nombre << string(15 - posiciones[i].nombre.length(), ' ') << "| "
             << posiciones[i].puntos << string(7 - to_string(posiciones[i].puntos).length(), ' ') << "| "
             << posiciones[i].golesfavor << "   |\n";
    }
    cout << "-------------------------------------------\n";
}

    
int main(){

vector <Fecha> fechas;
vector <Equipo> equipos;
vector <Equipo> posiciones;
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
            tabla(partidos,equipos,posiciones);
            break;
            case 5:
                cout << "Saliendo del programa..." << endl;
                break;
            default:
                cout << "Opción no válida. Intenta nuevamente." << endl;
        }
    } while (opcion != 5);

}