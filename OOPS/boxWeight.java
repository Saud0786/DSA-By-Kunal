public class boxWeight extends box{
  double weight;
  boxWeight(){
    this.weight=-1;
  }

  boxWeight(boxWeight old){
    this.weight=-1;
  }
   

  boxWeight(double side, double weight){
    super(side);
    this.weight=weight;
  }

  boxWeight(double l,double h,double w,double weight){
    super(l, h, w); // what is this ? call the parent class constructor used
    // to initialise values present in parent class
    this.weight=weight;
  }
}
