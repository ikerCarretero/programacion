QUnit.module('add', function() {
  QUnit.test('two numbers', function(assert) {
    assert.equal(add(1, 2), 3);
  });
  QUnit.test('zero numbers', function(assert) {
    assert.equal(add(), 3); //quest test hauria de donar vermell
  });  
});
