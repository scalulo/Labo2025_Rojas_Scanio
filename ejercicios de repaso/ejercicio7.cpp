#include <iostream>
#include <vector>
 
using namespace std;

vector <int> puntos={25,18,15,12,10,8,6,4,2,1};

  struct Vuelta_rapida {
    int numero_vuelta;
    int tiempo;
    string nombre_piloto;
  };
      
  struct Equipo {
    string nombre;
    int puntos;
  };

  struct Piloto{
    string nombre;
    string equipo;
    bool vueltarapida;
    int pos_largada;
    int pos_llegada;
  };
  

  
    void cargarpilotos(vector <Piloto> &pilotos){
    Piloto piloto;
    cout<<"ingrese el nombre del piloto: "; cin>>piloto.nombre;cout<<endl;
    cout<<"ingrese el nombre del equipo: "; cin>>piloto.equipo;cout<<endl;
    cout<<"obtuvo la vuelta rapida?(si/no)"<<endl;string respuesta;cin>>respuesta;
    if(respuesta=="si"){
        piloto.vueltarapida==true;
    }
    else{
        piloto.vueltarapida==false;

    }
    cout<<"como largo?: "; cin>>piloto.pos_largada;cout<<endl;
    cout<<"posicion de llegada: "; cin>>piloto.pos_llegada;cout<<endl;
    pilotos.push_back(piloto);
  }

    void puntaje_equipo(vector <Piloto> pilotos, vector <Equipo> &equipos, vector <int> puntos){
        for(int i=0;i<pilotos.size();i++){
            for(int k=0;k<equipos.size();k++){
                if(pilotos[i].equipo==equipos[k].nombre){
                    
                    if(pilotos[i].pos_llegada<= 10){
                        equipos[k].puntos+=puntos[pilotos[i].pos_llegada-1];
                    }
                    if(pilotos[i].vueltarapida==true){
                        equipos[k].puntos+=1;
                    }
                }    
            }
        }
    }

void ordenar_tabla(vector<Equipo>& equipos) {
    int n = equipos.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (equipos[j].puntos < equipos[j + 1].puntos) {
                Equipo temp = equipos[j];
                equipos[j] = equipos[j + 1];
                equipos[j + 1] = temp;
            }
        }

    }
    

}

void tabla_ordenada(vector<Equipo> equipos){
       cout << "Tabla de equipos ordenada por puntos:" << endl;
    for (int i = 0; i < equipos.size(); i++) {
        cout<<equipos[i].nombre<<"   "<<equipos[i].puntos<<endl;
        cout<<endl;
    }

}


   int main(){
  
    vector<Equipo> equipos = {
        {"Ferrari", 0},
        {"Mercedes", 0},
        {"RedBull", 0},
        {"McLaren", 0},
        {"Renault", 0},
        {"Williams", 0},
        {"Alfa Romeo", 0},
        {"Haas", 0},
        {"Alpine", 0},
        {"Toro Rosso", 0}
    };        vector<Piloto> pilotos;

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
            cargarpilotos(pilotos);
            break;
        case 2:
            puntaje_equipo(pilotos,equipos,puntos);
            break;
        case 3:
            ordenar_tabla(equipos);
            break;

        case 4:
            tabla_ordenada(equipos);
            break;    
        
            case 5:
                cout << "Saliendo del programa..." << endl;
                break;
            default:
                cout << "Opción no válida. Intenta nuevamente." << endl;
        }
    } while (opcion != 5);

}

   