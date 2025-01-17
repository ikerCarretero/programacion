function isValidEmail(  ){
    let resultat = false;
    let matchResult = emailValue.match('([a-z]|[0-9])+@([a-z]|[0-9])+\.com');
    if (matchResult != null){
        resultat = true;
    } else {
        resultat = false;
    }
    return resultat;
}