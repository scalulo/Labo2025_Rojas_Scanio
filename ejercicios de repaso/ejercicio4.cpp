#include <iostream>
#include <vector>
 
using namespace std;


struct Fecha{
    int dia;
    int mes;
    int año;
};

struct Paciente{
string nombre;
int edad;
int historia;
vector <Fecha> fechas;

};

void ingresar(vector <Fecha> &fechas,vector <Paciente> &pacientes){

        Fecha fecha;
        Paciente paciente;

    cout<<"ingrese el nombre: ";
    cin>>paciente.nombre;
    cout<<endl;
 
    cout<<"ingrese la edad: ";
    cin>>paciente.edad;
    cout<<endl;

    cout<<"ingrese el codigo de la historia clinica: ";
    cin>>paciente.historia;
    cout<<endl;
    
    cout<<"Ingrese los datos de la proxima cita"<<endl;


    cout<<"ingrese el dia: ";
    cin>>fecha.dia;
    cout<<endl;
 
    cout<<"ingrese el mes: ";
    cin>>fecha.mes;
    cout<<endl;
    
    cout<<"ingrese el año: ";
    cin>>fecha.año;
    cout<<endl;

    pacientes.push_back(paciente);
    fechas.push_back(fecha);

}

void cancelar(vector <Fecha> &fechas,vector <Paciente> &pacientes){
    
     Fecha fecha;
    Paciente paciente;
    

    int numero;
    cout<<"Numero de historia clinica:"<<endl;
    cin>>numero;

    for(int i=0;i<pacientes.size() ;i++){
        if(numero==pacientes[i].historia){
                pacientes.erase(pacientes.begin() + i);
            cout<<"Ha sido borrado correctamente"<<endl;
    }
    }
}

void mostrar(vector <Fecha> &fechas,vector <Paciente> &pacientes){
   Fecha fecha;
    Paciente paciente;
    int d;
    int m;
    int a;

    cout<<"ingrese el dia: ";
    cin>>d;
    cout<<endl;
 
    cout<<"ingrese el mes: ";
    cin>>m;
    cout<<endl;
    
    cout<<"ingrese el año: ";
    cin>>a;
    cout<<endl;

    for(int i=0;i<pacientes.size();i++){
        for(int i=0;i<fechas.size();i++){
        if(d==fechas[i].dia){
            if(m==fechas[i].mes){
                if(a==fechas[i].año){
                    cout<<"Los pacientes en ese dia son:"<<endl;
                    cout<<"Nombre:"<<pacientes[i].nombre<<endl;
                    cout<<"Numero historia clinica:"<<pacientes[i].historia<<endl;
                }
            }
        }
    }
    }
}

void encontrar(vector <Fecha> &fechas,vector <Paciente> &pacientes) {
   Fecha fecha;
    Paciente paciente;
    int code;

    cout<<"Ingrese el numero de historia clinica del paciente a mostrar"<<endl;
    cin>>code;
    
    for( int i=0;i<pacientes.size();i++){
        if(code=pacientes[i].historia){
            cout<<"Los datos del paciente son:"<<endl;
            cout<<"Nombre:"<<pacientes[i].nombre<<endl;
            cout<<"Edad:"<<pacientes[i].edad<<endl;
            cout<<"Dia:"<<fechas[i].dia<<endl;
            cout<<"Mes:"<<fechas[i].mes<<endl;
            cout<<"Año:"<<fechas[i].año<<endl;
           

        }
    }

}

int main(){

vector <Fecha> fechas;
vector <Paciente> pacientes;
int opcion;



cout << endl;
    do{     
    cout << "1 - Registrar paciente y agendar fecha." << endl;
    cout << "2 - Cancelar cita." << endl;
    cout << "3 - Mostrar citas para un dia especifico." << endl;
    cout << "4 -  Mostrar informacion de un paciente." << endl;
    cout<<"Elija una opcion"<<endl;
    cin>>opcion;
    
    switch (opcion)
        {
        case 1:
            ingresar(fechas,pacientes);
            break;
        case 2:
            cancelar(fechas,pacientes);
            break;
        case 3:
            mostrar(fechas,pacientes);
            break;
        case 4:
            encontrar(fechas,pacientes);
            break;
            case 5:
                cout << "Saliendo del programa..." << endl;
                break;
            default:
                cout << "Opción no válida. Intenta nuevamente." << endl;
        }
    } while (opcion != 5);

}
