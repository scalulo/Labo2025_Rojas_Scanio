const express = require('express')
const app = express()
const port = 3000
const bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json())

var mysql      = require('mysql');
const path = require('path');

var connection = mysql.createConnection({
  host     : 'localhost',   
  user     : 'alumno',
  password : 'alumnoipm',
  database : 'Susurros_urbanos'
});
 
connection.connect();
 

    app.get('/insertar', (req, res) => {
        var titulo=req.query.titulo
        var cuerpo=req.query.cuerpo
        var latitud=req.query.latitud
        var longitud=req.query.longitud
        var categoria = req.query.categoria;


        connection.query("insert into Historia values ('"+titulo+"', '"+cuerpo+"', '"+longitud+"', '"+latitud+"', '"+categoria+"')", function (error, results, fields) {
           if (error) {
      console.error('Error en la query: ', error);
      return res.status(500).send('Error al guardar la historia');
    }
    
    console.log('Historia insertada con ID: ', results.insertId);
    
    // Redirigir de vuelta a la página principal
    res.redirect("http://127.0.0.1:5500/Archivos/Principal.html")

    })
  })    


app.listen(port, () => {
console.log(`Example app listening on port ${port}`)
})