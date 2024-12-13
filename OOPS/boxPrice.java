public class boxPrice extends boxWeight {
  double cost;

  boxPrice(){
    super();
    this.cost=-1;
  }

 boxPrice(boxPrice old){
  super(old);
  this.cost=old.cost;
 }


  boxPrice(double l,double h,double w,double weight){
    super(l, h, w, weight);
    this.cost= cost;
  }

  boxPrice(double side , double weight,double cost){
    super(side,weight);
    this.cost=cost;
  }

}
