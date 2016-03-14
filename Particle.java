import java.util.*;
public class Particles {
  
  double mass;
  double charge;
  String name;
    
 public Particles ( double mass, double charge, String name){
   this.mass = mass;
   this.charge = charge;
   this.name = name;}
 public static void main(String[] args){
   Particles elec = new Particles ( 9.1*Math.pow(10,-28),-1.6*Math.pow(10,-19),"electron");
   Particles prot = new Particles ( 1.6*Math.pow(10,-24),1.6*Math.pow(10,-19),"proton");
   
   double EFstatic = eForce_s( e1,p1,d );
   
    
   public static double eForce_s(Particles a, Particles b, double d){
      return a.charge*b.charge*9*Math.pow(10,9)/(d*d);}
   
     
    // return a.charge*b.charge*8.99*Math.pow(10,9)/(Math.random()*Math.pow(10,-3))*(Math.random()*Math.pow(10,-3));}
        
   /* non static version 
    * double ef_non = e1.eforce(p1, 2);
    * public double eforce( Particles b, double d ){
    *    return this.charge*b.charge*9*Math.pow(10,9)/(d*d);}
    */
