let Sc = "Global";
function myFunction() 
{
  let Scope = "LocalScope";
  return Scope;
}
{
  var x = "Block";
  console.log(x);
  console.log(Sc);
  console.log(myFunction());
}