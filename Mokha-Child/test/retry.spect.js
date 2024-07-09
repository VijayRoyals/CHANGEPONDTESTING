// const expect = require('chai').expect 

const axios = require('axios');
const { describe } = require('mocha');

let expect; 
(async() => { 
    const chai = await import('chai'); 
    expect = chai.expect;
}) (); 



describe('Test Suite 1', function() {   //descirbe.skip and describe.only can also used 
    this.retries(1);   //Retry all tests in this suit up to 1 times 
    it('Promised based way', function() { 
        this.retries(2); //Retry this specific test case up to 2 times 

        return axios.get('https://reqres.in/api/users?page=2') 
        .then(res => { 
            expect(res.data.data[1].email).to.equal('lindsay.ferguson@reqres.in');
        })
        .catch(err => { 
            //Handle any errors during the Axios request or assertions
             console.error('Error during test:', err); 
             throw err; // Rethrow the error to trigger Mocha's retry mechanism
        });
    });
});