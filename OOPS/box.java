
public class box {
  double l;
  double h;
  double w;

 box(){
  this.l=-1;
  this.w=-1;
  this.h=-1;
 }

 // cube
 box(double side){
   this.w=side;
   this.h=side;
   this.l=side;
 }

 box(double l,double h,double w){
  this.l=l;
  this.h=h;
  this.w=w;
 }

 box(box old){
  this.h=old.h;
  this.l=old.l;
  this.w=old.w;
 }
 public void information(){
  System.out.println("Running the box");
 }
 } 

