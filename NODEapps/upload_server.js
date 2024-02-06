var http = require('http');
var fs= require('fs');


const readline = require('node:readline').createInterface({
    input: process.stdin,
    output: process.stdout,
  });

  readline.question(`Enter Data in your file to upload: `, datainfo => {
    fs.appendFile('./demo.txt', datainfo,
    function(err){
        if(err) throw err;
        console.log("file created");
    })

    readline.close();
  });


http.createServer(function(req,res){
    fs.readFile('./demo.txt', function(error,data){
        if(error) throw error;
        res.writeHead(200,{'Content-Type':'text/html' });
        res.write(data);
        res.end();
    })
}).listen(3000,()=>{console.log("server is listening at port 3000")});


//"create a simple file upload server. Users will be able to upload a file, and the server will save it to the disk."