const { before, afterEach } = require("mocha")
let expect; 
(async ()=> { 
    const chai = await import('chai'); 
    expect = chai.expect; 


})(); 
// const expect = require("chai").expect 

describe('Suite 4', ()=>{ 
    before(()=> { 
        console.log('before')
    });

after(()=> { 
    console.log('after') 
}); 
 
beforeEach(()=> { 
    console.log('beforeEach')
});

afterEach(()=>{ 
    console.log('afterEach')
});
})