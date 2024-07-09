module.exports = { 
    // ui : 'tdd' 
    ui: "bdd" ,
    timeout: 2000, //Timeout after 2000 ms 
    slow:150, 
    reporter:'spec', 
    retries: 3, //(last precedence) testcase execution count, if it is 3 ,then testcase will run for 3 times)
    ui:'bdd', 
    'watch-files' : ['test/**/ *.js'],
}