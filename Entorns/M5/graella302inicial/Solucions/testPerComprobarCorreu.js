QUnit.module('isValidEmail', function() {
    QUnit.test('abc', function(assert) {
      assert.equal(isValidEmail('abc@test.com'), true);
    });
    QUnit.test('123', function(assert) {
      assert.equal(isValidEmail('123'), false); //quest test hauria de donar vermell
    });  
    QUnit.test('123@', function(assert) {
        assert.equal(isValidEmail('123@'), false); //quest test hauria de donar vermell
      }); 
  });
  