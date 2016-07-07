grammar SqlBase;

init  : '{' value (',' value)* '}' ;

value : init
      | INT
      ;

INT :   [0-9]+ ;
