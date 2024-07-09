const { circleArea } = require("../src/app1"); 
const { suite, test} = require('mocha'); 
let expect; 
(async ()=> { 
    const chai = await import('chai'); 
    expect = chai.expect; 

})(); 

describe('circleArea', () => { 
    it('circleArea(5) should return 78.5', ()=> { 
        expect(circleArea(5)).to.be.equal(78.53981633974483)

    })
})

context('circleArea', ()=> { 
    specify('circleArea(5) should return 78.5', ()=> {
    expect(circleArea(5)).to.be.equal(78.53981633974483); 
    
})
})

suite('suite 1', ()=> { 
    test('circleArea(5) should return 78.5', ()=> { 
        expect(circleArea(5)).to.be.equal(78.53981633974483);
    })
})