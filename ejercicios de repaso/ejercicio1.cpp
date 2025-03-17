#include <iostream>
#include <vector>

using namespace std;

struct Empleado{
    string nombre;
    string apellido;
    string fecha;
    string sexo;
    int salario;
};

void ingresaremp( vector <Empleado> &empleados ){
    Empleado empleado;

    cout<<"ingresa tu nombre: ";
    cin>>empleado.nombre;
    cout<<endl;

    cout<<"ingresa tu apellido: ";
    cin>>empleado.apellido;
    cout<<endl;
       
    cout<<"ingresa tu fecha de nacimiento: ";
    cin>>empleado.fecha;
    cout<<endl;
       
    cout<<"ingresa tu sexo: ";
    cin>>empleado.sexo;
    cout<<endl;
       
    cout<<"ingresa tu salario: ";
    cin>>empleado.salario;
    cout<<endl;

    empleados.push_back(empleado);
}

Empleado empleadoConMayorSueldo( vector <Empleado> &empleados,vector <Empleado> &salariobajo ){
    Empleado empleadomayor=empleados[0];
    for (int i=0; i<empleados.size();i++){
        if(empleados[i].salario<=400000){
            salariobajo.push_back(empleados[i]);
        }
        if(empleados[i].salario>empleadomayor.salario){
            empleadomayor=empleados[i];
        }
    }
    /*
    cout<<"Empleado con mayor salario: "<<endl;
    cout<<empleadomayor.nombre<<endl;
    cout<<empleadomayor.apellido<<endl;
    cout<<empleadomayor.fecha<<endl;
    cout<<empleadomayor.sexo<<endl;
    cout<<empleadomayor.salario<<endl;
    */
//Se pide que retorne un valor, por lo tanto debemos poner un return y que la funcion no sea un void
return empleadomayor;     
}


int main() {
    vector <Empleado> empleados;
    string opcion;
    vector <Empleado> salariobajo;
    cout<<"quieres ingresar un usuario?"<<endl;
    cin>>opcion;
    cout<<endl;
    while(opcion=="si"){
    if(opcion=="si"){
        ingresaremp(empleados);
            cout<<"quieres ingresar otro usuario?"<<endl;
            cin>>opcion;
    }
    }
   
  empleadoConMayorSueldo(empleados,salariobajo);

}