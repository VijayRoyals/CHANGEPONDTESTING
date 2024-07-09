const {add, sub, mul, div} = require('../src/app') 

// const expect = require('chai').expect 
// Change this: 
// const expect = require('chai').expect; 
// to this: 
let expect; 
(async () => { 
    const chai = await import('chai');  //importing chai explicitly
    expect = chai.expect; 
})(); 

//1.BDD = 'describe' and 'it' 
describe('Suite 1', ()=> { 
    it('add(2,3) should return 5', () => { 
        expect(add(2,3)).to.be.equal(5);
    })
})

//1.BDD = 'describe' and 'it' 
describe('Suite 2', ()=> { 
    it('sub(5,3) should return 2', () => { 
        expect(add(2,3)).to.be.equal(5);
    })
})
//3.BDD - 'context' and 'specify' 
context('Suite 3', ()=> { 
    specify('add(3,3) should return 6', ()=> {
        expect(add(3,3)).to.be.equal(6); 
        
    })
})
//4.BDD -'Describe and it ' 

context('Suite 4', ()=> { 
    specify('div(2,2) should return 0', ()=> { 
        expect(sub(2,2)).to.be.equal(0);
    })
})

//5.BDD -'Describe and it' 

context('Suite 5', ()=> { 
    specify('mul(4,2) should return 8', ()=> { 
        expect(mul(4,2)).to.be.equal(8); 
    })
})


//---------------------------------------------------------------******----------------------------------------------------- 


const {suite,test,setup,teardown,suiteSetup,suiteTeardown}=require('mocha') 
//import { suite, test, setup,teardown,suiteSetup,suiteTeardown} from 'mocha' 
suite('TDD hooks', ()=> { 
    suiteSetup(() => { 
        console.log('one suitesetup')
    }); 
    suiteTeardown(() => { 
        console.log('one suiteteardown')
    }); 
    setup(() => { 
        console.log('one setup')
    }); 
    teardown(() => { 
        console.log('one teardown')
    });
    //test cases 
    test('add(7,3) should return 10', ()=> { 
        console.log('one test')
    });
})